/*esercizio di logica Java di media difficoltà. 
 * L'obiettivo è scrivere un programma che trova il più grande tra tre numeri inseriti dall'utente.*/

package trovaMassimo;

import java.util.Scanner;

public class TrovaMassimoApp {

	public static int trovaMassimoMethod(int[] array) {

		int n = array[0];

		for (int i = 1; i < array.length; i++) {
			if (n < array[i]) {
				n = array[i];
			}
		}
		return n;

	}
	
	public static void main(String[] args) {
		
		Scanner sn1 = new Scanner(System.in);
		Scanner sn2 = new Scanner(System.in);
		Scanner sn3 = new Scanner(System.in);
		int[] array = new int[3];
		
		System.out.println("inserire 3 numeri: ");
		
		array[0] = sn1.nextInt();
		array[1] = sn2.nextInt();
		array[2] = sn3.nextInt();
		
		
		int res =trovaMassimoMethod(array);
		System.out.println("il numero piu grande è: " + res);
		
	}

}
