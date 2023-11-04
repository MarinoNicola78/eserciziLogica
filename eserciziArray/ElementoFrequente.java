/*Elemento più frequente in un array*/

package eserciziArray;

import java.util.Arrays;

public class ElementoFrequente {

	public static void main(String[] args) {

		int[] numeri = {1, -56, 1000, 3, 3, 3, 3,4,6,2,90,1000,4,4};
		int n = numeri.length;
		int maxCount = 0;
		int maxFreq = 0;
		
		// 2 FOR per confrontare i valori 
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (numeri[i] == numeri[j]){
					count++;
				}
				
			}
			if (count > maxCount) {
				maxCount = count;
				maxFreq = numeri[i];
			}
		}
		System.out.println("numero piu frequente: " + maxFreq);
		
	}

}
