/*Scrivi un programma Java che trovi e stampi tutti i duplicati in un array di interi.*/
package eserciziArray;

import java.util.Arrays;

public class TrovaDuplicati {

	public static void main(String[] args) {

		int[] numeriCasuali = { 5, 2, 10, 90, 1, 7, 5, 2,1 };
		int tmp = 0;

		// Arrays.sort(numeriCasuali);
		System.out.print("num diplicati trovati: ");
		for (int i = 0; i < numeriCasuali.length; i++) {
			for (int j = i + 1; j < numeriCasuali.length; j++) {
				if (numeriCasuali[i] == numeriCasuali[j]) {
					System.out.print(numeriCasuali[j] + " , ");
				}
				
			}
		} //System.out.print("nessun num duplicato!!");

	}

}
