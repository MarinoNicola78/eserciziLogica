/*Modificare il programma RipetoDieciNumeri in modo che stampi i numeri
inseriti in ordine inverso.*/

package eserciziArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RipetoDieciNumeri {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int i = 0;
		int[] arrayNumeri = new int[5];
//		List<Integer>arrayNumeri = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserire 5 numeri che vuoi stampare: ");
		while(i < 5) {
			numero = sc.nextInt();
			arrayNumeri[i++] = numero;
		}
		System.out.println("stampo la sequenza di numeri immessa al contrario: ");
		for(int j = arrayNumeri.length -1; j >= 0; j--) {
			System.out.println(arrayNumeri[j]);
		}
	}

}


