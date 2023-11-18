package eserciziArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class UnioneArray {

	public static void unisciArray(int[] array1, int[] array2) {

		int dim = array1.length + array2.length;
		int[] array3 = new int[dim];

		int index = 0;
		for (int i = 0; i < array1.length; i++) {
			array3[index++] = array1[i];

		}
		for (int i = 0; i < array2.length; i++) {
			array3[index++] = array2[i];
		}

		System.out.println(Arrays.toString(Arrays.stream(array3).distinct().toArray()));

	}

	public static void main(String[] args) {

		int[] array1 = { 3, 6, 5, 3, 7, 9, 9, 3 };
		int[] array2 = { 4, 7, 10, 12, 34, 9, 3 };
		unisciArray(array1, array2);
	}
}
