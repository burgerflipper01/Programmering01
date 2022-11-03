package dicegames;

import java.util.Scanner;

public class PlayPairOfDices {


    private PairOfDices dices;
    /**
     * The scanner used for reading user input.
     */
    private Scanner scan;

    public PlayPairOfDices() {
        scan = new Scanner(System.in);
        dices = new PairOfDices();
    }


    /**
     * Print out a neat welcome message to the player.
     */
    private void welcomeToGame() {
        System.out.println("Velkommen til spillet KAST 2 terninger");
    }

    /**
     * Finishes the game and prints out the result.
     */
    private void gameOver() {

        System.out.println("Tak for spillet du kastede " + dices.getRolls() + " "
                + "gange.");
        System.out.println("Du kastede 1 " + dices.getOnes() + " gange");
        System.out.println("Du kastede 2 " + dices.getTwos() + " gange");
        System.out.println("Du kastede 3 " + dices.getThrees() + " gange");
        System.out.println("Du kastede 4 " + dices.getFours() + " gange");
        System.out.println("Du kastede 5 " + dices.getFives() + " gange");
        System.out.println("Du kastede 6 " + dices.getSixes() + " gange");
        System.out.println("Dit højeste kast var " + dices.getHighest());
        System.out.println("Du et par " + dices.getPairs() + " gange");
        scan.close();
    }

    /**
     * Take another turn in the game.
     */
    private void takeTurn() {
        dices.rollBothDices();
        int roll = dices.sumOfDices();
        System.out.println("Du har kastet: " + roll);
    }

    /**
     * Start the game loop.<br/>
     * The game is finished when the player chooses to not roll the die anymore.
     */
    public void startGame() {
        welcomeToGame();

        boolean finished = false;

        while (!finished) {
            System.out.println("Vil du kaste en terning? Angiv Ja eller Nej: ");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("Nej")) {
                finished = true;
            } else {
                takeTurn();

            }
        }
        gameOver();
    }
}
