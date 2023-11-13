package eserciziArray;
/*Scrivi un programma Java che prenda due array di interi ordinati in modo crescente e
 * li unisca in un unico array ordinato.*/

import java.util.Arrays;

public class UnisciArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 3, 5, 7, 9 };
		// int[] array2 = { 89, 32, 90, 80, 100 };
		int[] array2 = { 2, 4, 6 };
		int[] array3 = new int[(array1.length + array2.length)];

		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));

		int index = 0;
		for (int i = 0; i < array1.length; i++) {
			array3[index++] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[index++] = array2[i];
		}
		System.out.println("size Array 3: " + array3.length);
		System.out.println("Array 3: " + Arrays.toString(array3));

	}
}
