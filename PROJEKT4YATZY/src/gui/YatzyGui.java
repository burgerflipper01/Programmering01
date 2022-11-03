package gui;


import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import model.Yatzy;


public class YatzyGui extends Application {


    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // Shows the face values of the 5 dice.
    private final TextField[] txfValues = new TextField[5];
    // Shows the hold status of the 5 dice.
    //private CheckBox[] chbHolds;
    // Shows the results previously selected .
    // For free results (results not set yet), the results
    // corresponding to the actual face values of the 5 dice are shown.
    private final TextField[] txfResults = new TextField[15];
    // Shows points in sums, bonus and total.
    private TextField txfSumSame, txfBonus, txfSumOther, txfTotal;
    // Shows the number of times the dice has been rolled.
    //private Label lblRolled;

    private final Button btnRoll = new Button("Roll!");

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        dicePane.setGridLinesVisible(false);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // initialize txfValues, chbHolds, btnRoll and lblRolled
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i] = new TextField();
        }
        Label txtLabel = new Label("Press die to Hold");
        dicePane.add(txtLabel, 0, 0);


        HBox diesHolder = new HBox();
        diesHolder.setSpacing(8);
        dicePane.add(diesHolder, 0, 1);

        for (TextField dieHolder : txfValues) {
            diesHolder.getChildren().add(dieHolder);
            dieHolder.setEditable(false);
            dieHolder.setPrefHeight(60);
            dieHolder.setPrefWidth(60);
            dieHolder.setPadding(new Insets(20));
            dieHolder.setUserData(false);
            dieHolder.setStyle("-fx-border-color: Green");
            dieHolder.setAlignment(Pos.CENTER);

            dieHolder.setOnMouseClicked(this::lockDieAction);

        }
        dicePane.add(btnRoll, 0, 2);
        btnRoll.setMaxWidth(Double.MAX_VALUE);
        GridPane.setFillWidth(btnRoll, true);
        btnRoll.setOnAction(event -> rollDiesAction());


        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setGridLinesVisible(false);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int w = 60; // width of the text fields

        // Initialize labels for results, txfResults,
        // labels and text fields for sums, bonus and total.
        /*

         */
        Label labelResult;
        int row = 0;
        for (int i = 1; i <= 6; i++) {
            TextField field = new TextField("0");
            field.setEditable(false);
            field.setMaxWidth(w);
            field.setUserData(false);
            field.setDisable(true);
            field.setOnMouseClicked(this::chooseFieldAction);

            labelResult = new Label(i + "-s");


            if (i % 2 == 0) {
                scorePane.add(field, 4, row);
                scorePane.add(labelResult, 3, row);
                row++;

            } else {
                scorePane.add(field, 1, row);
                scorePane.add(labelResult, 0, row);
            }
            txfResults[i - 1] = field;
        }


        GridPane scorePane1 = new GridPane();
        pane.add(scorePane1, 0, 2);
        scorePane1.setGridLinesVisible(false);
        scorePane1.setPadding(new Insets(10));
        scorePane1.setVgap(5);
        scorePane1.setHgap(10);
        scorePane1.setStyle("-fx-border-color: black");


        Label lblResultName;
        lblResultName = new Label("One Pair");
        scorePane1.add(lblResultName, 0, 0);
        lblResultName = new Label("Two Pair");
        scorePane1.add(lblResultName, 2, 0);
        lblResultName = new Label("Three Same");
        scorePane1.add(lblResultName, 0, 1);
        lblResultName = new Label("Four Same");
        scorePane1.add(lblResultName, 2, 1);
        lblResultName = new Label("Full House");
        scorePane1.add(lblResultName, 0, 2);
        lblResultName = new Label("Small Straight");
        scorePane1.add(lblResultName, 2, 2);
        lblResultName = new Label("Big Straight");
        scorePane1.add(lblResultName, 0, 3);
        lblResultName = new Label("Chance");
        scorePane1.add(lblResultName, 2, 3);
        lblResultName = new Label("YATZY");
        scorePane1.add(lblResultName, 0, 4);


        row = 0;

        for (int i = 7; i <= 15; i++) {
            TextField resultField = new TextField("0");
            resultField.setEditable(false);
            resultField.setMaxWidth(w);
            resultField.setDisable(true);
            resultField.setUserData(false);
            resultField.setOnMouseClicked(this::chooseFieldAction);

            if (i % 2 == 0) {
                scorePane1.add(resultField, 3, row);
                row++;
            } else {
                scorePane1.add(resultField, 1, row);
            }
            txfResults[i - 1] = resultField;


        }


        Label lblSum = new Label("Sum");
        txfSumSame = new TextField("0");
        txfSumSame.setEditable(false);
        VBox sumOfSame = new VBox(lblSum, txfSumSame);
        txfSumSame.setPrefWidth(w);
        scorePane.add(sumOfSame, 1, 3);


        Label lblBonus = new Label("Bonus");
        txfBonus = new TextField("0");
        txfBonus.setEditable(false);
        VBox bonusOfSame = new VBox(lblBonus, txfBonus);
        txfBonus.setPrefWidth(w);
        scorePane.add(bonusOfSame, 4, 3);


        //I GridPane2
        Label lblSum2 = new Label("Sum");
        txfSumOther = new TextField("0");
        txfSumOther.setEditable(false);
        VBox totalSum = new VBox(lblSum2, txfSumOther);
        totalSum.setPrefWidth(w);
        scorePane1.add(totalSum, 1, 8);


        //I Gridpane2
        Label lblBonus2 = new Label("Total");
        txfTotal = new TextField("0");
        txfTotal.setEditable(false);
        txfTotal.setPrefWidth(w);
        VBox totalBox = new VBox(lblBonus2, txfTotal);
        scorePane1.add(totalBox, 3, 8);


    }


// -------------------------------------------------------------------------

    private final Yatzy yatzy = new Yatzy();

    // Create a method for btnRoll's action.
// Hint: Create small helper methods to be used in the action method.
    private void rollDiesAction() {
        if (yatzy.getThrowCount() == 0) {
            for (TextField txfResult : txfResults) {
                txfResult.setDisable((boolean) txfResult.getUserData());
            }
        }
        boolean[] holds = new boolean[5];
        for (int i = 0; i < txfValues.length; i++) {
            holds[i] = (boolean) txfValues[i].getUserData();

        }
        yatzy.throwDice(holds);
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i].setText(String.valueOf(yatzy.getValues()[i]));

        }

        //Display die faces in text fields
        int[] dices = yatzy.getValues();
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i].setText(String.valueOf(dices[i]));

        }

        //Update results, if they are not previously selected
        //They are selected if the field is disabled
        int[] results = yatzy.getResults();
        for (int i = 0; i < txfResults.length; i++) {
            TextField field = txfResults[i];
            if (!field.isDisabled())
                field.setText(String.valueOf(results[i]));


        }

        //If they user have used all their throws
        //Then we will disable the button
        if (yatzy.getThrowCount() == 3) {
            btnRoll.setDisable(true);
        }
        //Update text on the roll button
        btnRoll.setText("Roll " + yatzy.getThrowCount());


    }

// -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
// Hint: Create small helper methods to be used in the mouse click method.
    private void chooseFieldAction(Event event) {
        TextField selectedField = (TextField) event.getSource();
        selectedField.setUserData(true);

        for (TextField txfResult : txfResults) {
            if (txfResult != selectedField && !txfResult.isDisabled()) {
                txfResult.setText("0");
                txfResult.setDisable(true);
            }
        }


        //Calculate sum of the results in the "same" section
        int sumSame = 0;
        for (int i = 0; i < 6; i++) {
            if ((boolean) txfResults[i].getUserData()) {
                sumSame += Integer.parseInt(txfResults[i].getText());
            }

        }

        //If the sum is atleast 63, we add 50 points to the sum
        //of "same" - section, and set the bonus field to "50"
        if (sumSame >= 63) {
            sumSame += 50;
            txfBonus.setText("" + 50);
        }

        //Calculate sum for the "other" section of the scoreboard
        //based on textfields that are not equals to 0
        int sumOther = 0;
        for (int i = 6; i < 15; i++) {
            if ((boolean) txfResults[i].getUserData()) {
                sumOther += Integer.parseInt(txfResults[i].getText());
            }

        }
        //Set out score on our textfields
        txfSumSame.setText("" + sumSame);
        txfSumOther.setText("" + sumOther);
        // The total textfields if the sum of sumSame and sumOther
        txfTotal.setText(sumOther + sumSame + "");

        boolean gameOver = true;
        for (TextField txfResult : txfResults) {
            if (!(boolean) txfResult.getUserData()) {
                gameOver = false;
                break;

            }

        }
        if (gameOver) gameOver();

        //Reset the throw counter
        yatzy.resetThrowCount();

        //Reset dies to be empty and the border to green
        resetDies();

        //Enable the roll button again
        btnRoll.setDisable(false);


    }

    private void lockDieAction(Event event) {
        //If the throw count is 0, we will prevent the user
        // from holding a die
        if (yatzy.getThrowCount() == 0) return;

        TextField txfDie = (TextField) event.getSource();

        //Get the state of the die(is it holding or not)
        boolean holding = (boolean) txfDie.getUserData();

        //Swich the state of the die
        txfDie.setUserData(!holding);

        //If the user is holding the border will be red
        //If not it will be green
        if (holding) {
            txfDie.setStyle("-fx-border-color: Green");
        } else {
            txfDie.setStyle("-fx-border-color: Red");
        }

    }

    private void resetDies() {
        for (TextField dieHolder : txfValues) {
            dieHolder.setText("");
            dieHolder.setUserData(false);
            dieHolder.setStyle("-fx-border-color: Green;");
        }
    }

    public void gameOver() {
        Alert a = new Alert(Alert.AlertType.NONE, "", ButtonType.CLOSE);
        a.show();
        a.setContentText(" Gameover! You got " + txfTotal.getText() + " points!");
        System.out.println("Game Over");
        System.out.println("Gameover! You got " + txfTotal.getText() + " points!");
    }
}

