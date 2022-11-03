package HJEMMEARBEJD.PigGame;

import java.util.Scanner;

public class Player {
    private Die die;
    private String playerName;
    private int totalPoints;
    private Scanner scan;


    public Player(String playerName) {
        this.die = new Die();
        this.playerName = playerName;
        scan = new Scanner(System.in);
    }

    public void takeTurn() {
        boolean stop = false;

        int points = 0;
        int hit = 0;


        System.out.println(playerName + "'s tur");

        while (!stop) {
            System.out.println("Would you like to continue? (Ja eller Nej):");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("Nej")) {
                stop = true;
            } else {
                die.roll();
                hit = die.getFaceValue();

                if (hit == 1) {
                    points = 0;
                    stop = true;
                    System.out.println("You rolled 1, and lost your points");
                } else {
                    points += hit;
                    System.out.println("You rolled " + hit + ", you have " + points + " gathered");
                }
            }
        }

        totalPoints += points;
        System.out.println(playerName + "'s total points: " + totalPoints);
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public String getPlayerName() {
        return playerName;
    }
}

