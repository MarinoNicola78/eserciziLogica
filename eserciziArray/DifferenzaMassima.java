/*Scrivi un programma Java che, dato un array di interi, 
* trovi e stampi la differenza massima tra due elementi dell'array, 
* dove l'elemento più grande si trova dopo quello più piccolo.*/

package eserciziArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenzaMassima {

	public static void main(String[] args) {

		int[] array = { 2, 7, 9, 5, 1, 4, 6, 5, 8, 9, 2 };
		List<Integer> listDiff = new ArrayList<>();
		int diff = 0;
		int diffMax = 0;

		System.out.println("Array originale:");
		for (int num : array) {
			System.out.print(num + " ");
		}

		Arrays.sort(array);

		System.out.println("\narray ordinato: \n" + Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				diff = array[j] - array[i];
				listDiff.add(diff);
				System.out.print("\ndiff tra: " + array[j] + " - " + array[i] + " = " + diff);
			}
		}
		diffMax = listDiff.get(0);
		for (int i = 0; i < listDiff.size(); i++) {
			if (diffMax < listDiff.get(i)) {
				diffMax = listDiff.get(i);
			}

		}
		System.out.println("\ndiff Max è : " + diffMax);
	}

}

//public class DifferenzaMassima {
//    public static void main(String[] args) {
//        int[] array = {2, 7, 9, 5, 1, 4, 6, 5, 8, 9, 2};
//
//        System.out.println("Array originale:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//
//        int differenzaMassima = trovaDifferenzaMassima(array);
//        System.out.println("\nLa differenza massima è: " + differenzaMassima);
//    }
//
//    public static int trovaDifferenzaMassima(int[] array) {
//        int differenzaMassima = Integer.MIN_VALUE;
//        int minElemento = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > minElemento) {
//                int differenza = array[i] - minElemento;
//                if (differenza > differenzaMassima) {
//                    differenzaMassima = differenza;
//                }
//            } else {
//                minElemento = array[i];
//            }
//        }
//
//        return differenzaMassima;
//    }
//}
