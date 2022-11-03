package crabs;

import java.util.Scanner;

/**
 * This class models one pair of dices.
 */
public class Crabs {
    /**
     * The first die in the pair.
     */
    private Die die1;
    /**
     * The second die in the pair.
     */
    private Die die2;

    private int rolls;
    private Scanner scan;


    /**
     * Constructor for objects of class PairOfDices
     */

    public Crabs() {
        die1 = new Die();
        die2 = new Die();
        scan = new Scanner(System.in);
    }

    // TODO: put the second constructor here!
    public Crabs(int sides) {
        die1 = new Die(sides);
        die2 = new Die(sides);
        scan = new Scanner(System.in);

    }


    // TODO: Add methods here


    public Die getDie1() {
        return die1;
    }

    public Die getDie2() {
        return die2;
    }

    public int getRolls() {
        return rolls;
    }

    public int sumOfDices() {
        int sum = die1.getFaceValue() + die2.getFaceValue();
        return sum;
    }


    public void rollBothDices() {
        die1.roll();
        die2.roll();
        rolls++;
        int sum = die1.getFaceValue() + die2.getFaceValue();
        int point = sum;

        if ((sum == 7 || sum == 11)) {
            System.out.println("Tillykke du har vundet spillet");
        } else if ((sum <= 3 || sum == 12)) {
            System.out.println("Du tabte spillet prøve igen");
        } else {
            point = sum;
            System.out.println("du slog " + point + " slå det igen for at vinde");
            boolean keepPlaying = true;
            while (keepPlaying) {


                System.out.println("Tryg [Enter] for at rulle igen :)");
                scan.nextLine();
                die1.roll();
                die2.roll();
                rolls++;
                sum = die1.getFaceValue() + die2.getFaceValue();

                System.out.println("du slog " + sum);
                if (sum == point) {
                    gameOverWin();
                    keepPlaying = false;
                } else if (sum == 7) {
                    System.out.println("u lose");
                    keepPlaying = false;
                }

            }
        }

    }

    public void welcomeToGame() {
        System.out.println("hej og velkommen til crabs reglerne er således at hvis du slår 7 eller 11 i første slag vinder du");
        System.out.println("slår du 1,2 eller 12 taber du. men hvis du slår noget andet end disse tal skal du forsøge at så det samme igen uden at slå 7 held og lykke");

    }

    public void gameOverWin() {
        System.out.println("Tillykke du har vundet spillet");
    }

    public void gameOverLose() {
        System.out.println("du tabte spille prøv igen");
    }

    public void gameOverEnd() {
        System.out.println("Tak for denne gang håber vi ser dig igen snart");
    }

    public void startGame() {
        welcomeToGame();

        boolean finished = false;

        while (!finished) {
            System.out.println("Vil du kaste en terning? Angiv Ja eller Nej: ");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("Nej")) {
                finished = true;
            } else {
                rollBothDices();

            }
        }
        gameOverEnd();


    }
}













