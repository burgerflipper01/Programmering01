package Piggame;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Piggame {

    private Player player1;

    private Player player2;

    private Scanner scan;

    //
    private int win = 30;

    public Piggame(String player1, String player2, int win) {
        this.player1 = new Player(player1, win);
        this.player2 = new Player(player2, win);
        scan = new Scanner(System.in);
        this.win = win;
    }

    public void startGame() {
        boolean finished = false;
        int rounds = 1;
        System.out.println("velkommen til spille Pig her gælder det om at samle 100 points");
        System.out.println("hvis du slår 1 mister du de point som du ikke har gemt, du kan gemme dine points ved at skrive [stop]");
        System.out.println("held og lykke må den bedste vinde");
        System.out.println("spiller 1 starter");
        System.out.println();
        while (!finished) {

            if (rounds % 2 == 0) {
                player1.taketurn();
                System.out.println("" + player1.getName() + "'s tur");
            } else {
                player2.taketurn();
                System.out.println("" + player2.getName() + "'s tur");
            }
            rounds++;
            if (checkwinner(player1) || checkwinner(player2)) {
                System.out.println("skal vi spille igen (ja/nej)");
                String input = scan.nextLine();
                if (input.equalsIgnoreCase("nej")) {
                    finished = true;
                }


            }
        }
    }

    private boolean checkwinner(Player player) {
        if (player.getTotalpoints() >= win) {
            System.out.println(player.getName() + " vandt spillet!");
            return true;
        }
        return false;
    }
}
