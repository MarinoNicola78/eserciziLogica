/*Scrivi un programma Java che, dato un array di interi consecutivi da 1 a N con un numero mancante, 
 *trovi e stampi quel numero mancante.
*/

package eserciziArray;

public class TrovaNumeroMancante {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 5, 6, 7, 8, 9, 11, 12, 14 };

		System.out.print("array originale: ");

		for (int numero : array) {
			System.out.print(numero + " ");
		}

		System.out.println();
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != (array[i + 1] - 1)) {
				int tmp = array[i + 1] - 1;
				System.out.println("num mancante: " + tmp);
			}
		}
	}

}
