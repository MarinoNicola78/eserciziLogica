/*Problema: Trova l'Elemento Mancante in un Array di Numeri Crescenti*/

package eserciziArray;

public class TrovaMancante {

	/*
	 * trovaMancante(int[] array) che prende in input un array di numeri crescenti
	 * di lunghezza n contenente tutti gli interi da 1 a n+1 senza duplicati, ad
	 * eccezione di un numero mancante. Il metodo deve restituire il numero
	 * mancante.
	 */
	public static void trovaMancante(int[] array) {
		int tmp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] != array[i] + 1) {
				System.out.println("num mancante: " + (array[i] + 1));
			}
		}

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 5, 6, 7, 9, 10, 12 };
		trovaMancante(array);
	}
}
