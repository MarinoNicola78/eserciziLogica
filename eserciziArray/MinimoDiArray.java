package eserciziArray;

import java.util.Arrays;
import java.util.Scanner;

public class MinimoDiArray {

	public static void main(String[] args) {
		int index = 0;
		int[] arrayNum = new int[5];
		Scanner scNum = new Scanner(System.in);
		System.out.println("Inserire 5 numeri: ");

		while (index < 5) {
			int num = scNum.nextInt();
			arrayNum[index++] = num;
		}
		int tmp = arrayNum[0];
		int indexTmp = 0;
		for (int i = 0; i < arrayNum.length; i++) {
			// tmp quando MAGGIORE entra e mette il valore piu piccolo
			if (tmp > arrayNum[i]) {
				tmp = arrayNum[i];
				indexTmp = i;
			}
		}
		System.out.println("numero minimo del Array: " + tmp + " in posizione: " + (indexTmp+1));

	}

}
