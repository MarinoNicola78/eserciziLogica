/*Scrivi un programma Java che, dato un array di interi e un obiettivo di somma, 
 * trovi tutte le coppie di numeri nell'array la cui somma è uguale all'obiettivo. 
 * Stampa queste coppie.*/

package eserciziArray;

public class SommaCoppie {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int obiettivoSomma = 10;
		System.out.println("coppie di num in cui la somma e uguale a 10:");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] + array[j]) == obiettivoSomma) {
					int somma = array[i] + array[j];
					System.out.println("(" + array[i] + ", " + array[j] + ")");
					System.out.println(array[i] + " + " + array[j] + " = " + somma + "\n");

				}
			}

		}

	}

}
