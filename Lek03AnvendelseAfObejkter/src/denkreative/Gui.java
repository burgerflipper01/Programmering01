package denkreative;

import javafx.application.Application;
import javafx.css.Size;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
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
        Rectangle rec1 = new Rectangle(140,180,90, 170);
        rec1.setFill(Color.DARKGREEN);
        rec1.setStroke(Color.DARKGREEN);

        Ellipse ellipse = new Ellipse(185, 205, 44, 100);
        ellipse.setFill(Color.DARKGREEN);
        ellipse.setStroke(Color.DARKGREEN);
        ellipse.setStrokeWidth(5);

        Rectangle rec2 = new Rectangle(169.9,40,30,80);
        rec2.setFill(Color.DARKGREEN);
        rec2.setStroke(Color.DARKGREEN);

        Ellipse ellipse2 = new Ellipse(185, 253, 35, 60);
        ellipse2.setFill(Color.GREEN);
        ellipse2.setStroke(Color.SILVER);
        ellipse2.setStrokeWidth(3);

        Rectangle rec3 = new Rectangle(157,240,55, 25);
        rec3.setFill(Color.RED);
        rec3.setStroke(Color.WHITE);

        Text text = new Text(160, 258, "Ceres");
        text.setFill(Color.WHITE);
        text.setFont(Font.font(20));

        Rectangle vand = new Rectangle(0, 0, 600, 600);
        pane.getChildren().add(vand);
        vand.setFill(Color.STEELBLUE);

        Line line = new Line(170, 40, 200,40 );
        line.setFill(Color.GOLD);
        line.setStroke(Color.GOLD);
        line.setStrokeWidth(8);
        pane.getChildren().add(line);

        Rectangle strand = new Rectangle(0, 300, 600, 200);
        pane.getChildren().add(strand);
        strand.setFill(Color.SANDYBROWN);

        pane.getChildren().add(rec1);
        pane.getChildren().add(ellipse);
        pane.getChildren().add(rec2);
        pane.getChildren().add(ellipse2);
        pane.getChildren().add(rec3);
        pane.getChildren().add(text);



    }
}
