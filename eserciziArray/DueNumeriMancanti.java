/*Scrivi un programma Java che prende in input un array di numeri interi. L'array contiene tutti i numeri da 1 a N, tranne uno. 
 * Il tuo compito è trovare il numero mancante.**/

package eserciziArray;

public class DueNumeriMancanti {

	public static void trovaNumeriMancanti(int[] array) {
		System.out.print("numeri mancanti: ");
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] != array[i] + 1 && array[i] != array[i + 1]) {
				System.out.print(array[i] + 1 + " ");
			}
		}
	}
	public static void trovaNumeriMancanti1(int[] array) {
		System.out.print("numeri mancanti: ");

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 3, 4, 4, 6, 8, 8, 10, 10, 12 };
		trovaNumeriMancanti(array);
	}
}
