package OPG1KombinerNavne;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {


    //Normal skrivning der skal foregå for at få applikationen til at køre
    @Override
    public void start(Stage stage) {
        stage.setTitle("Kombiner Navne");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------


    //Skaber objekter af textfields

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

        pane.add(txfName, 1, 1);
        pane.add(txfName1, 2, 1);
        pane.add(txfName2, 1, 2, 2, 4);
        txfName.setEditable(true);

        Button combineNames = new Button("Combine Names");
        pane.add(combineNames, 3, 1);
        GridPane.setMargin(combineNames, new Insets(10, 10, 0, 10));
        combineNames.setOnAction(event -> this.combineNames());



    }



    //Metoder der "Combiner Names" i applikationen
    private void combineNames() {
        String name = txfName.getText().trim();
        String name1 = txfName1.getText().trim();
        txfName2.setText(name + " " + name1);
    }
}


