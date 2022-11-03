package WorkshopEX6ForLoekker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class  Gui extends Application {
   

    @Override
    public void start(Stage stage) {
        GridPane root = initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
        int y = 180;
        gc.strokeLine(20, y,180, y);
        gc.strokeLine(170,170,180,180);
        gc.strokeLine(170, 190, 180, 180);

        int x1 = 20;
        for (int i = 0; i<=10; i++){
            gc.strokeLine(x1,y - 4,x1,y + 4);
            x1 = x1 + 15;


        }






        /* (int i = 0; i <= 10; i++) {
            lav streg
            x+20*/


            }

        }




