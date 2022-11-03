package CrabsPlay;

import dicegames.PairOfDices;

import java.util.Scanner;

public class PlayCrabs {


    private dicegames.PairOfDices dices;
    /**
     * The scanner used for reading user input.
     */
    private Scanner scan;

    public PlayCrabs() {
        scan = new Scanner(System.in);
        dices = new PairOfDices();
    }

    /**
     * Print out a neat welcome message to the player.
     */
    private void welcomeToGame() {
        System.out.println("Velkommen til spillet Craps kast dine terninger");

    }
}


