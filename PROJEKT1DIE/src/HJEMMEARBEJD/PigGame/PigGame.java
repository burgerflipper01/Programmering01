package HJEMMEARBEJD.PigGame;

import java.util.Scanner;

public class  PigGame {
    private Player player1;
    private Player player2;
    private Scanner scan;

    public PigGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        scan = new Scanner(System.in);
    }

    public void startGame() {
        boolean finished = false;

        int rounds = 0;

        while (!finished) {
            if (rounds % 2 == 0) {
                player1.takeTurn();
            } else {
                player2.takeTurn();
            }

            System.out.println("next");
            if (checkWinner(player1) || checkWinner(player2)) {
                System.out.println("Skal vi spille igen? (Ja/Nej):");
                String input = scan.nextLine();
                if (input.equalsIgnoreCase("Nej")) {
                    finished = true;
                } else {
                    player1 = new Player(player1.getPlayerName());
                    player2 = new Player(player2.getPlayerName());
                }
            }

            rounds++;
        }
    }

    private boolean checkWinner(Player player) {

        if (player.getTotalPoints() >= 10) {
            System.out.println(player.getPlayerName() + " vandt spillet!");
            return true;
        }
        return false;
    }
}
