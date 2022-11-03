package afleveringfravaer;

import java.util.Arrays;

public class AfproevFravaersSystem {

    public static void main(String[] args) {
        int[][] fravaer22S = {
                { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 },
                { 1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0 },
                { 5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0 }
        };

        FravaersSystem fraværsSystem = new FravaersSystem();

        //Udskriver fraværstallene i konsollen
        fraværsSystem.udskrivFravaer(fravaer22S);

        //Udskriver samletfravær for elevNR i 22s
        System.out.println("Det samlede fravær er " + fraværsSystem.samletFravaer(fravaer22S, 3));

        //Udskriver det gennemsnitlige fravær for elevNR i 22s
        System.out.println("Det gennemsnitlige fravær er " + fraværsSystem.gennemsnit(fravaer22S, 1));

        //Udskriver hvor mange der ikke har fravær for 22s
        System.out.println("Samlede antal af elever uden fravær er " + fraværsSystem.antalUdenFravaer(fravaer22S));


        //Udskriver hvem der har mest fravær
        System.out.println("Eleven med mest fravær er nr. " + fraværsSystem.mestFravaer(fravaer22S));


        //Nulstilning af fravær for 22s
        fraværsSystem.nulstil(fravaer22S, 0);
        System.out.println(Arrays.toString(fravaer22S[0]));

    }
}
