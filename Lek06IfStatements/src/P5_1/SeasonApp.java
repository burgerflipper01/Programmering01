package P5_1;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Season season = new Season();
        System.out.print("Angiv et tal (måned)");
        int inputMonth = scanner.nextInt();
        //System.out.println(season.getSeason(inputMonth));
    }
}
