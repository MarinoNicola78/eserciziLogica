/*Scrivere il programma UgualiConsecutivi che chiede all’utente di inserire 10 numeri, li
memorizza in un array e stampa valori e posizioni di tutti gli elementi che sono preceduti dallo stesso
elemento (Ricordare che le posizioni iniziano da 0). Se non ci sono coppie di valori consecutivi uguali il
programma non stampa nulla*/

package eserciziArray;

import java.util.Scanner;

public class UgualiConsecutivi {

	public static void main(String[] args) {

		int index = 0;
		int[] arrayNum = new int[10];
		Scanner scNum = new Scanner(System.in);
		System.out.println("Immettere 10 numeri: ");

		// popolo Array di interi
		while (index <= arrayNum.length - 1) {
			arrayNum[index] = scNum.nextInt();
			index++;
		}

		for (int i = 0; i < arrayNum.length - 1; i++) {
			if (arrayNum[i] == arrayNum[i + 1]) {
				int tmp = arrayNum[i];
				System.out.println("valore: " + tmp + " nella posizione " + (i + 2) + " uguale a quello precedente");
			}
		}
	}

}
