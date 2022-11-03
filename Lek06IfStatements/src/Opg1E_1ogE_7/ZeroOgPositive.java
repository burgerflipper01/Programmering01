package Opg1E_1ogE_7;

import java.util.Scanner;

public class ZeroOgPositive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tal? ");
        int tal = scan.nextInt();
        if (tal == 0){
            System.out.println("Dit tal er 0");
        }
        else if (tal > 0){
            System.out.println("Dit tal er positivt");
        }
        else{
            System.out.println("Dit tal er negativt");
        }
    }
}
