package Opgave2PersonADmin;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;



public class Gui extends Application {

  
    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo3");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final ListView<Person> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();
    private final TextField txfName = new TextField();

    private final CheckBox check1 = new CheckBox("Senior");

    private final TextField txfName2 = new TextField();

    private void initContent(GridPane pane) {
        this.initPersons();

        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);


        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        Label lblNames = new Label("Persons:");
        pane.add(lblNames, 0, 4);

        Label lblTitle = new Label("Title:");
        pane.add(lblTitle,0,2);

        pane.add(txfName, 1, 0, 2, 1);

        pane.add(txfName2,1,2,2,1);

        // add a listView to the pane(at col=1, row=0)
        pane.add(lvwPersons, 1, 4, 1, 5);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);
        lvwPersons.getItems().setAll(persons);

        ChangeListener<Person> listener = (ov, oldPerson, newPerson) -> this.selectionChanged();
        lvwPersons.getSelectionModel().selectedItemProperty().addListener(listener);

        lvwPersons.getSelectionModel().clearSelection();

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 6, 0);

        //Adder checkbox
        pane.add(check1,1,3);


        // connect a method to the button
        btnAdd.setOnAction(event -> this.addAction());

        Button btnDelete = new Button("Delete");
        pane.add(btnDelete, 6, 3);

        // connect a method to the button
        btnDelete.setOnAction(event -> this.deleteAction());

    }

    // -------------------------------------------------------------------------
    // Button actions




    private void addAction() {
        boolean senior = check1.isSelected();
        String name = txfName.getText().trim();
        String title = txfName2.getText().trim();
        if (name.length() > 0 && title.length() > 0) {
            Person p = new Person(name, title, senior);
            persons.add(p);
            lvwPersons.getItems().setAll(persons);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add person");
            alert.setHeaderText("No named typed");
            alert.setContentText("Type the name of the person");
            alert.show();
        }
    }

    private void deleteAction() {
        int index = lvwPersons.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            persons.remove(index);
            txfName.clear();
            lvwPersons.getItems().setAll(persons);
        }
    }


    private void initPersons() {
        persons.add(new Person("Jens", "Doktor", true));
        persons.add(new Person("Hans", "Brandmand", false));
        persons.add(new Person("Pia", "Lærer", false));
    }

    // -------------------------------------------------------------------------
    // Selection changed action

    private void selectionChanged() {
        Person newPerson = lvwPersons.getSelectionModel().getSelectedItem();
        if (newPerson != null) {
            txfName.setText(newPerson.firstName());
        } else {
            txfName.clear();
        }
    }
}
