package Opgave3PersonAdmin;

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
        psw = new PersonInputWindow("Person",stage);
    }

    // -------------------------------------------------------------------------

    private final ListView<Person> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();
    private final TextField txfName = new TextField();
    private PersonInputWindow psw;


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


        Label lblNames = new Label("Persons:");
        pane.add(lblNames, 0, 0);


        // add a listView to the pane(at col=1, row=0)
        pane.add(lvwPersons, 1, 0, 1, 5);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);
        lvwPersons.getItems().setAll(persons);

        ChangeListener<Person> listener = (ov, oldPerson, newPerson) -> this.selectionChanged();
        lvwPersons.getSelectionModel().selectedItemProperty().addListener(listener);

        lvwPersons.getSelectionModel().clearSelection();


        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 6, 0);
        //connect a method to the button
        btnAdd.setOnAction(event -> this.addAction());



    }

    // -------------------------------------------------------------------------
    // Button actions

    private void addAction() {
        psw.showAndWait();
        if (psw.getActualPerson() != null) {
            persons.add(psw.getActualPerson());
            lvwPersons.getItems().setAll(persons);
        }

    }

    private void initPersons() {
        persons.add(new Person("Jens", "Doktor", true));
        persons.add(new Person("Hans", "Brandmand", false));
        persons.add(new Person("Pia", "L??rer", false));
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
