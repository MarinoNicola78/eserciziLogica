/*  Implementare un metodo statico di nome filtra che
prende come parametro un array a di numeri interi e un intero positivo k, 
e che restituisce un nuovo array b di numeri interi contenente 
i soli elementi di a che sono divisibili per k. 
Si faccia in modo che l’array b abbia una dimensione uguale 
al numero di elementi che deve contenere 
(non devono cioè esservi posizioni inutilizzate). */

package eserciziArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Filtra {

	public static int[] filtra(int[] numeri, int k) {
		int countElementi = 0;

		for (int i = 0; i < numeri.length; i++) // conto gli elementi da inserire
			if (numeri[i] % k == 0)
				countElementi++;
		
		// nuovo Array
		int[] nuovoArray = new int[countElementi];
		int j = 0; // index nuovo Array

		System.out.print("Stampo nuovo array divisibile per: " + k + " -> ");
		for (int i = 0; i < numeri.length; i++)
			if (numeri[i] % k == 0) {
				nuovoArray[j] = numeri[i];
				System.out.print(nuovoArray[j] + ", ");
				j++;
				
			}
		return nuovoArray;
	}

	public static void main(String[] args) {

		int[] numeri = { 10, 5, 9, 50, 30, 37 };
		int k = 2;

		filtra(numeri, k);
	}

}
