package Opgave5OL;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
        Circle circle = new Circle(70, 70, 30);
        pane.getChildren().add(circle);
        circle.setFill(null);
        circle.setStroke(Color.BLUE);
        circle.setStrokeWidth(5);

        Circle circle1 = new Circle(135, 70, 30);
        pane.getChildren().add(circle1);
        circle1.setFill(null);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeWidth(5);

        Circle circle2 = new Circle(200, 70, 30);
        pane.getChildren().add(circle2);
        circle2.setFill(null);
        circle2.setStroke(Color.RED);
        circle2.setStrokeWidth(5);

        Circle circle3 = new Circle(102.5, 100, 30);
        pane.getChildren().add(circle3);
        circle3.setFill(null);
        circle3.setStroke(Color.YELLOW);
        circle3.setStrokeWidth(5);

        Circle circle4 = new Circle(167.5, 100, 30);
        pane.getChildren().add(circle4);
        circle4.setFill(null);
        circle4.setStroke(Color.GREEN);
        circle4.setStrokeWidth(5);
    }
}
