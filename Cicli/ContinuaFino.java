//esercizi pdf "esercizi1" traccia 2.2

package Cicli;

import java.util.Scanner;

public class ContinuaFino {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean numCompliance;
		int somma = 0;		
		do {
			System.out.println("inserire un valore:\n");
			int numInserito = sc.nextInt();
			numCompliance = (numInserito < 0 && numInserito %2 == 0 || numInserito > 0 && numInserito %3 ==0);
			if (numCompliance) somma += numInserito;
		} while (numCompliance);
		System.out.print("stampo la somma dei soli numeri compliance:\n" + somma);
	}

}
