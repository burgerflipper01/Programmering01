package OPGHUS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
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
        Rectangle rectangle = new Rectangle(100, 200,120, 120);
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.RED);
        rectangle.setStroke(Color.BLACK);

        Polygon polygon = new Polygon(100,200,220,200,160,100);
        pane.getChildren().add(polygon);
        polygon.setFill(Color.GREEN);

        Circle circle = new Circle(300, 70, 30);
        pane.getChildren().add(circle);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);

        Line line = new Line(80, 320, 400, 320);
        pane.getChildren().add(line);
        line.setStroke(Color.BLACK);

        Rectangle rektangel1 = new Rectangle(100, 40, 75, 25);
        pane.getChildren().add(rektangel1);
        rektangel1.setFill(Color.CORAL);
    }


    }

