package Opgave3Smiley;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
        Circle circle = new Circle(140, 140, 80);
        pane.getChildren().add(circle);
        circle.setFill(null);
        circle.setStroke(Color.BLACK);

        Line line1 = new Line(100, 200, 180, 200);
        pane.getChildren().add(line1);
        line1.setStroke(Color.GREEN);

        Circle circle1 = new Circle(110, 110, 10);
        pane.getChildren().add(circle1);
        circle1.setFill(Color.GREEN);

        Circle circle3 = new Circle(180, 110, 10);
        pane.getChildren().add(circle3);
        circle3.setFill(Color.GREEN);

    }
}
