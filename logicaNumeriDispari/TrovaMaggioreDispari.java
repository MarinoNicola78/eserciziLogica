/*Realizza un programma Java che, data una sequenza di numeri interi, 
 * identifichi e stampi il più grande tra i numeri dispari presenti nella sequenza*/

package logicaNumeriDispari;

import java.util.Arrays;

public class TrovaMaggioreDispari {

	public static void trovaMaggioreDispari(int[] array) {
		
		Arrays.sort(array);
		int numMax = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				if (array[i] < array[i+1]) {
					numMax = array[i];
				}
			}
		}
		System.out.println(numMax);

	}

	public static void main(String[] args) {

		int[] array = { 22, 7, 9, 21, 11, 12,40 };

		trovaMaggioreDispari(array);
	}

}
