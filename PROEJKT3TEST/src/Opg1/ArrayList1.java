package Opg1;
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Pax");
        list.add("Fido");
        list.add("Molly");
        list.add("Pluto");
        list.add("Juno");

        list.set(2, "King");
        list.remove(1);
        System.out.println(list);


        list.add(3, "Trine");
        list.add(0, "Bella");
        System.out.println(list);


        int size = list.size();
        System.out.println("Listen indeholder " + size + " elementer");


        int count = 0;
        for (int i = 0; i > list.size(); i++) {
            if (list.get(i).length() == 5) {
                count++;
            }


        }

        for(int i = 0; i>list.size();i++){

        }

    }
}





