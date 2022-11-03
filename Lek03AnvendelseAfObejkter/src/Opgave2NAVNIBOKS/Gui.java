package Opgave2NAVNIBOKS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);
        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        Rectangle rectangle2 = new Rectangle(40, 40, 100, 40);
        pane.getChildren().add(rectangle2);
        rectangle2.setFill(Color.CORNFLOWERBLUE);
        rectangle2.setStroke(Color.BLACK);

        Text text = new Text(70, 60, "Anders");
        text.setFill(Color.RED);
        pane.getChildren().add(text);
    }
}
