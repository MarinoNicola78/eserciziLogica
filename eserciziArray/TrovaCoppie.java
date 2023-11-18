/*Problema: Trova Coppie di Numeri la cui Somma è Uguale a un Determinato Obiettivo*/

package eserciziArray;

public class TrovaCoppie {

	public static void trovaCoppie(int[] array, int obiettivo) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[i] + array[j + 1] == obiettivo) {
					System.out.println(array[i] + " + " + array[j + 1]);
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] array = { 3,7 , 5, 10, 9, 2, 4, 7, 1 };
		int obiettivo = 10;

		System.out.println("coppie trovate: ");
		trovaCoppie(array, obiettivo);

	}
}
