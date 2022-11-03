package Opgave3Flight;
import java.util.ArrayList;


public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hans");
        list.add("Viggo");
        list.add("Jens");
        list.add("Børge");
        list.add("Bent");
        System.out.println(list.size());

        int size = list.size();
        System.out.println("Listen indeholder " + size + " elementer");

        list.add(2, "Jane");


        //Fjerner index 1 af Arraylisten
        list.remove(1);

        list.add(0, "Pia");

        list.add("Ib");
        System.out.println(list.size());

        list.set(2, "Hansi");
        System.out.println(list.size());
        System.out.println(list);


        for (int i = 0; i <= list.size(); i++){
            String s = list.get(i);
            System.out.println(s.length());
        }

        for (String s : list){
            System.out.println(s.length());
        }

    }
}
