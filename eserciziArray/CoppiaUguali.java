/*Verifica esistenza di almeno una coppia di elementi uguali*/

package eserciziArray;

import java.util.Arrays;

public class CoppiaUguali {

	public static void main(String[] args) {

		int[]  numeri = { 1, -56, 1000, 3, 10, 10, 3,4,6,2,90,1000,4,4};
		int tmp = 0;
		Arrays.sort(numeri);
		System.out.println("trovo tutte le coppie di numeri: ");
		for (int i = 1; i < numeri.length-1; i++) {
			if(numeri[i] == numeri[i+1]) {
				tmp = numeri[i+1];
				System.out.println("coppia uguale trovata -> " + tmp );
			}
		}
		
	}

}
