//esercizi pdf "esercizi1" traccia 5.2

package array;

import java.util.Scanner;

public class SecondoArray {

	public static void main(String[] args) {

		// VAR
		int count = 0;
		int[] array1 = new int[10];

		Scanner s = new Scanner(System.in);

		// Popolo il primo Array
		for (int i = 0; i < array1.length; i++) {
			System.out.println("inserisci un numero: ");
			array1[i] = s.nextInt();
			if (array1[i] >= 0)
				count++;
		}

		// popolo il secondo Array
		int[] array2 = new int[count];
		int j = 0;
		for (int x : array1) {
			if (x >= 0) {
				array2[j] = x;
				j++;
			}
		}

		// stampo il secondo Array2 con i valori in ordine inverso
		for (int i = array2.length - 1; i >= 0; i--) {
			System.out.println("Stampo i numeri inseriti in ordine inverso: " + array2[i]);
		}
	}

}
