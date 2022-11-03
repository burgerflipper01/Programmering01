package OPG5Konveter;

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
        stage.setTitle("Change Temperatur");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfName1 = new TextField();


    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        pane.add(txfName, 1, 1);
        txfName.setEditable(true);

        Button convert = new Button("Ændrer temperatur");
        pane.add(convert, 2, 1);
        GridPane.setMargin(convert, new Insets(10, 10, 0, 10));
        convert.setOnAction(event -> this.changeTemp());

    }

    private void changeTemp() {
        String pre = txfName.getText().trim();
        txfName.setText(txfName1.getText());
        txfName1.setText(pre);
    }
}


