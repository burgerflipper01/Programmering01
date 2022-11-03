package OPG3Split;

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
        stage.setTitle("Split Navne");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfName1 = new TextField();
    private final TextField txfName2 = new TextField();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        pane.add(txfName, 1, 3);
        pane.add(txfName1, 2, 3);
        pane.add(txfName2, 1, 1, 2, 2);
        txfName.setEditable(true);

        Button combineNames = new Button("Split Names");
        pane.add(combineNames, 3, 1);
        GridPane.setMargin(combineNames, new Insets(10, 10, 0, 10));
        combineNames.setOnAction(event -> this.splitNames());



    }

    private void splitNames() {
        String name = txfName2.getText().trim();;
        int i = name.indexOf(" ");
        txfName.setText(name.substring(0,i));
        txfName1.setText(name.substring(i + 1));
    }
}


