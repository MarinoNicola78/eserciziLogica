/*Scrivere una classe java che contenga al suo interno un metodo main, 
 * nel quale si chiede all'utente di inserire un vettore di numeri reali V 
 * e si calcolano il valore minimo e il secondo minimo, stampandoli sullo schermo.
 */

package trovaMinimo;

import java.util.Scanner;

public class TrovaMinimo {

	public static void main(String[] args) {

		int index = 0;
		int[] arrayNumeri = new int[5];
		Scanner scNum = new Scanner(System.in);

		int count = 0;
		System.out.println("inserisci 5 numeri per calcolare 2 minimi: ");
		while (index < 5) {
			arrayNumeri[count++] = scNum.nextInt();
			index++;
		}
		// primo FOR per trovare il primo numero minino
		int numMin1 = arrayNumeri[0];
		for (int i = 0; i < arrayNumeri.length; i++) {
			if (numMin1 > arrayNumeri[i]) {
				numMin1 = arrayNumeri[i];
			}
		}
		// terzo FOR per valorizzare il numMin2 con numero piu grande
		int numMin2 = 0;
		for (int i = 0; i < arrayNumeri.length; i++) {
			if (numMin2 < arrayNumeri[i]) {
				numMin2 = arrayNumeri[i];
			}
		}
		// secondo FOR per trovare il secondo numero minino
		for (int j = 0; j < arrayNumeri.length; j++) {
			if (numMin2 > arrayNumeri[j] && arrayNumeri[j] != numMin1) {
				numMin2 = arrayNumeri[j];
			}
		}

		System.out.println("1 num minimo: " + numMin1);
		System.out.println("2 num minimo: " + numMin2);

	}

}
