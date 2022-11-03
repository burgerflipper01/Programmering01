import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {

        //Konstrurer et Array

        int [] alder = new int[5];
        alder[0] = 21;
        alder[1] = 23;
        alder[2] = 25;
        alder[3] = 27;
        alder[4] = 29;

        //System.out.println(Arrays.toString(alder));

        //Finder summen af aldrene

        int sum = 0;

        for (int i = 0; i<alder.length; i++){
            sum = sum + alder[i];

           // System.out.println(sum);
        }

        //Find det største tal i Arrayet

        int highest = alder[0];
        for (int i = 0; i<alder.length; i++){
            if (alder[i] >highest){
                highest = alder[i];

            }
        }

        //Anden form for Array

        int[] alder2 = {24,12,543,23,13};
        //System.out.println(Arrays.toString(alder2));

        //Ændrer værdien i Arrayet

        alder2[3] = 44;
       // System.out.println(Arrays.toString(alder2));

        //??
        for (int i = 0; i <alder2.length; i++){
            alder2[i] = 99;
        }


        String [] navne = new String[4];
       // System.out.println(Arrays.toString(navne)); // Viser NULL
        navne[2] = "Margrethe";
        System.out.println(Arrays.toString(navne));




        /*public int[] fyldArrayPP(){
            j = 0;
            int[] result = new int[10];
            for (int = 0; j < result.length; j++){
                result[j] = j*3;*/
            }
        }


