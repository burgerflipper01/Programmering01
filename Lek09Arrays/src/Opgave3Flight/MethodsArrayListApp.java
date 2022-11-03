package Opgave3Flight;

import java.util.ArrayList;

public class MethodsArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(35);
		list.add(14);
		list.add(7);
		MethodsArrayList methods = new MethodsArrayList();
		System.out.println(list);
		System.out.println("Summen af tallene i listen med for "
				+ methods.sumListe(list));
		System.out.println("Summen af tallene i listen med forEach "
				+ methods.sumListe2(list));

		System.out.println("Indeks for det første lige tal: "
				+ methods.hasEvenAtIndex(list));

		System.out.println(methods.min(list));
		System.out.println(methods.averageNumber(list));


		System.out.println(methods.nulgange(list));
		System.out.println();



		methods.swapEvenWithZeroes(list);
		System.out.println(list);

		System.out.println(methods.aEvenList(list));


	}

}
