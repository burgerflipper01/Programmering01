package Opgave4Boys;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Gui extends Application {
  
    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo2");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private TextField txfName;
    private ListView<String> lvwNames;
    private ArrayList<String> names;

    private void initContent(GridPane pane) {
        this.initNames();

        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 4);

        // add a label to the pane (at col=0, row=1)
        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 0);
        GridPane.setValignment(lblNames, VPos.TOP);

        // add a text field to the pane (at col=1, row=0)
        txfName = new TextField();
        pane.add(txfName, 1, 4);

        // add a listView to the pane(at col=1, row=1)
        lvwNames = new ListView<String>();
        pane.add(lvwNames, 1, 0);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);
        lvwNames.getItems().setAll(this.initNames());

        ChangeListener<String> listener = (ov, oldString, newString) -> this.selectionChanged();
        lvwNames.getSelectionModel().selectedItemProperty().addListener(listener);

        lvwNames.getSelectionModel().clearSelection();

        // add a button to the pane (at col=4, row=0)
        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 4, 4);

        // connect a method to the button
        btnAdd.setOnAction(event -> this.addAction());


    }

    // -------------------------------------------------------------------------

    private ArrayList<String> initNames() {
        names = new ArrayList<String>();
        names.add("Martin");
        names.add("Jan");
        names.add("Bent");
        names.add("Niels");
        names.add("Thor");
        names.add("Peter");
        names.add("Finn");
        names.add("Thomas");
        names.add("Jan");
        return names;
    }

    // -------------------------------------------------------------------------
    // Selection changed actions

    private void selectionChanged() {
        String selected = lvwNames.getSelectionModel().getSelectedItem();
        if (selected != null) {
            txfName.setText(selected);
        } else {
            txfName.clear();
        }
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void addAction() {
        String name = txfName.getText().trim();
        if (name.length() > 0) {
            names.add(name);
            lvwNames.getItems().setAll(names);
            txfName.clear();
        }
    }


}

