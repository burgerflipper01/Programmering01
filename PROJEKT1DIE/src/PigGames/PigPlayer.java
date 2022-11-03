package PigGames;

import java.util.Scanner;

public class PigPlayer {
    private Die die;
    private String name;
    private int points;
    private Scanner scan;

    public PigPlayer(String name){
        this.name = name;
        this.die = new Die();
        scan = new Scanner(System.in);

    }
    public void takeTurn(){
        boolean stop = false;

        int points = 0;
        int hit = 0;
        int attemps = 0;

        System.out.println(name + " tur");

        while(!stop){
            System.out.println("You wanna keep on going? (Yes or No)");

            //if ()
        }
    }
}
