package Program;

public class Program {
    public static void main(String[] args){
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";
        String subStr1 = ord1.toUpperCase();
        String subStr2 = ord2.toLowerCase();
        System.out.println(subStr1);
        System.out.println(subStr2);
        System.out.println(ord1 +" " + ord2);
        System.out.println(ord1 +" " + subStr2);

        //Udskriver længden af ord3 altså 23 karaktere
        String ord3 = "Datamatiker uddannelsen";
        int laengde = ord3.length();
        System.out.println(laengde);


        //Udskriver de første 7 ord af ord1
        String de7 = ord1.substring(0,7);
        System.out.println(de7);


        //Udskriver 3-7 af ord2
        String de37 = ord2.substring(3, 8);
        System.out.println(de37);

        //Udskriver den sidste halvdel af ord3
        String sidstehalve = ord3.substring(ord3.length()/2);
        System.out.println(sidstehalve);



        /*Udskriver de første 7 ord af ord1
        char de7 = ord1.charAt();
        System.out.println();*/
        }
    }

