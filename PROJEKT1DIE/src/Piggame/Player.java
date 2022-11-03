package Piggame;

import java.util.Scanner;

public class Player {

    private String name;

    private Die die;

    private Scanner scan;

    private int totalpoints;
    private int win;

    public Player(String name, int win) {
        this.name = name;
        this.die = new Die();
        this.scan = new Scanner(System.in);
        this.win = win;
    }

    public String getName() {
        return name;
    }

    public int getTotalpoints() {
        return totalpoints;
    }

    public void taketurn() {
        boolean stop = false;
        int points = 0;
        int sum = 0;
        //int sumtotal = 0;
        while (!stop) {
            System.out.println("tryg [enter] for at rulle ellers skriv stop");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("stop")) {
                stop = true;
                System.out.println("du har nu " + (totalpoints + sum) + " points gemt");
            } else {
                die.roll();
                points = die.getFaceValue();
                if (points == 1) {
                    sum = 0;
                    stop = true;
                    System.out.println("du rullede 1 og mister alle dine points og har stadig " + totalpoints);
                } else {
                    sum += points;
                    System.out.println("du har rullet " + points + ", din nuværende runde har en værdi af " + sum + " og dine gemte points " + totalpoints);
                    if (sum + totalpoints >= win) {
                        stop = true;
                    }
                }


            }

        }
        totalpoints = totalpoints + sum;


    }

    public String getname() {
        return name;
    }
}