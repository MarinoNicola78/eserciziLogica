//esercizi pdf "esercizi1" traccia 5.2

package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SommaPariDispari {
	public static void main(String[] args) {

		int sommaPari = 0;
		int sommaDispari = 0;
		int[] stampaNum = { 2, 9, 8, 6, 12, 12, 23, 23, 10, 1 };
		
		// metedo per oprdinare un Array prima di mandarlo a video
		Arrays.sort(stampaNum);
		System.out.println(Arrays.toString(stampaNum));

		for (int i = 0; i < stampaNum.length; i++) {
			if (i % 2 == 0) {
				sommaPari += stampaNum[i];
			}
			if (i % 2 != 0) {
				sommaDispari += stampaNum[i];
			}
		}
		System.out.println("somma dei numeri pari: " + sommaPari);
		System.out.println("somma dei numeri dispari: " + sommaDispari);

		if (sommaPari == sommaDispari) {
			System.out.println("Pari e dispari uguali");
		} else {
			System.out.println("Pari e dispari diversi");
		}

	}

}
