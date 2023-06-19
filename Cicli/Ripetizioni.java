//esercizi pdf "esercizi1" traccia 2.5

package Cicli;

import java.util.Scanner;

public class Ripetizioni {

	public static void main(String[] args) {
		
		char carInseriti = 0;
		int numCaratteri = 0;
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//primo FOR per far ripetere l'intero ciclo 5 volte
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.print("Quanti caratteri vuoi inserire?\n");
			numCaratteri = sc.nextInt();
			//secondo FOR per far ripetere l'inserimento dei carattere fino a quanto inserito
			for (int j = 0; j < numCaratteri; j++) {
				System.out.println();
				System.out.print("Inserire un carattere:\n");
				carInseriti = sc.next().charAt(0);
				System.out.print("Il carattere inserito e': " + carInseriti);
			}
		}
	}

}
