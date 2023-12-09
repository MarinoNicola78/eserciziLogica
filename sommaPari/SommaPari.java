/*calcolaSommaPari(int n) che prende in input un numero intero positivo n
 *  e restituisce la somma di tutti i numeri pari compresi tra 1 e n.*/

package sommaPari;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SommaPari {
	
	public static void calcolaSommaPari(int n) {
	
		int[] array = new int[n+1];
		int somma = 0;
	
		for (int i = 1; i < array.length; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i);
				somma += i;
				
			}
			
		}
		System.out.println("somma num positivi: " + somma);
		
	}
		
	public static void main(String[] args) {
		
		calcolaSommaPari(4);
	}

}
