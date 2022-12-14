package Opgave3Flight;

import java.util.ArrayList;

public class MethodsArrayList {

    /**
     * @param list
     * @return sums the mumbers in the list using a for loop
     */
    public int sumListe(ArrayList<Integer> list) {
        int resultat = 0;
        for (int i = 0; i < list.size(); i++) {
            int tal = list.get(i);
            resultat = resultat + list.get(i);
        }
        return resultat;
    }

    /**
     * @param list
     * @return sums the mumbers in the list using a forEach loop
     */
    public int sumListe2(ArrayList<Integer> list) {
        int resultat = 0;
        for (int tal : list) {
            resultat = resultat + tal;
        }
        return resultat;
    }

    /**
     * @param list
     * @return index at the first even number
     */
    public int hasEvenAtIndex(ArrayList<Integer> list) {
        int index = -1;
        int i = 0;
        while (index == -1 && i < list.size()) {
            if (list.get(i) % 2 == 0) {
                index = i;
            }
            i++;
        }
        return index;

    }

    public int min(ArrayList<Integer> list) {
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < lowest) {
                lowest = list.get(i);
            }
        }
        return lowest;
    }


    public double averageNumber(ArrayList<Integer> list) {
        int sum = 0;
        double average = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        if (list.size() > 0) {
            average = (double) sum / list.size();
        }
        return average;
    }

    public int nulgange(ArrayList<Integer> list) {
        int nul = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                nul++;
            }
        }
        return nul;
    }

    public void swapEvenWithZeroes(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, 0);
            }
        }

    }

    public ArrayList<Integer> aEvenList(ArrayList<Integer> list) {
        ArrayList<Integer> listegustav = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                listegustav.add(list.get(i));

            }
        }
        return listegustav;
    }


    public void bytTal(int[] arr){


    }
}



