/*Scrivi un programma Java che, dato un array di numeri interi 
 * e un numero target, trovi tutte le coppie di numeri nell'array la cui somma è uguale al numero target. 
 * Il programma dovrebbe restituire tutte le coppie uniche.*/

package eserciziArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoppieSommaData {

	public static void cercaCoppieSomma(int[] array, int target) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if ((array[i] + array[j]) == target) {
					System.out.println(array[i] + " + " + array[j] + " = " + target);
				}
			}
		}
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		//int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 10;
		System.out.println("Coppie trovate con somma = " + target);
		
		cercaCoppieSomma(array, target);
		
		
		
	}

}
