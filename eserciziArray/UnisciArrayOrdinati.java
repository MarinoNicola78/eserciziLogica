/*Scrivi un programma Java che prenda due array ordinati di numeri interi 
 * e restituisca un nuovo array contenente tutti gli elementi dei due array 
 * originali in ordine crescente.*/

package eserciziArray;

import java.util.Arrays;

public class UnisciArrayOrdinati {

	public static int[] unisciArrayOrdinati(int[] array1, int[] array2) {

		int index1 = 0;
		int index2 = 0;
		// popolo prima meta di array3
		int[] array3 = new int[array1.length + array2.length];
		for (int i = 0; i < array3.length-4; i++) {
			array3[i] = array1[index1];
			index1++;
		}
		// popolo seconda meta di array3
		for (int i = 4; i < array3.length; i++) {
			array3[i] = array2[index2];
			index2++;
		}
		// ordino array3
		Arrays.sort(array3);
		return array3;
	}
	
	public static void main(String[] args) {
		
		int[] array1 = {1, 3, 5, 7};
		int[] array2 = {2, 4, 6, 8};
		
		int[] array3 = unisciArrayOrdinati(array1, array2);
		
		System.out.println(Arrays.toString(array3));
	}

}
