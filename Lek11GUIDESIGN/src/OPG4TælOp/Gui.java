package OPG4TælOp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Tæl Op");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField("50");

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);

        Label lblName = new Label("Count");
        pane.add(lblName, 0, 0);

        pane.add(txfName, 1, 1);
        txfName.setEditable(true);


        Button combineNames = new Button("+");
        pane.add(combineNames, 3, 1);
        GridPane.setMargin(combineNames, new Insets(10, 10, 0, 10));
        combineNames.setOnAction(event -> this.countUp());

        Button combineNames1 = new Button("-");
        pane.add(combineNames1, 3, 2);
        GridPane.setMargin(combineNames1, new Insets(10, 10, 0, 10));
        combineNames1.setOnAction(event -> this.countDown());



    }
    private void countUp() {
        String name = txfName.getText().trim();
        int tal = Integer.parseInt(name);
        txfName.setText(tal +  1 + " ");

    }
    private void countDown(){
        String name = txfName.getText().trim();
        int tal = Integer.parseInt(name);
        txfName.setText(tal - 1 + " ");



    }
}


