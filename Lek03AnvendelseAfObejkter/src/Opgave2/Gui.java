package Opgave2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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

        //int pixels = 100; Du kan også sætte heroppe og derefter skrive "+pixels" ved hver x akse"

        Rectangle rectangle1 = new Rectangle(40, 40, 40, 40);
        pane.getChildren().add(rectangle1);
        rectangle1.setFill(Color.CORNFLOWERBLUE);
        rectangle1.setStroke(Color.BLACK);

        Circle circle1 = new Circle(140, 80, 20);
        pane.getChildren().add(circle1);
        circle1.setFill(Color.CORNFLOWERBLUE);
        circle1.setStroke(Color.BLACK);

        Line line1 = new Line(180, 180, 300, 300);
        pane.getChildren().add(line1);
        line1.setStroke(Color.DARKGREEN);

        int pixels = 100;
        rectangle1.setTranslateX(pixels);
        circle1.setTranslateX(pixels);
        line1.setTranslateX(pixels);

        Color yellow1 = Color.YELLOW;
        circle1.setFill(yellow1);
        line1.setStroke(yellow1);
        rectangle1.setFill(yellow1);





    }
}
