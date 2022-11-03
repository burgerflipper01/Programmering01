package Opg1E_1ogE_7;

import java.util.Scanner;

public class ØgendeTal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tal 1 ");
        int tal1 = scan.nextInt();

        System.out.println("Tal 2 ");
        int tal2 = scan.nextInt();

        System.out.println("Tal 3 ");
        int tal3 = scan.nextInt();

        if (tal2 > tal1 && tal3 > tal2){
            System.out.println("Dit tal er øgende");
        }
        else{
            System.out.println("Dit tal er ikke øgende");
        }
    }
}
