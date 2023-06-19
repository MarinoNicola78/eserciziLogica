//esercizi pdf "esercizi1" traccia 2.1

package Cicli;

import java.util.Scanner;

public class TuttiPositiviPari {

	public static void main(String[] args) {
		
		//VAR
		boolean positiviPari = true;
		
		//creazione scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Quanti numeri vuoi inserire?\n");
		int numeriInseriti = sc.nextInt();
		
		//FOR per controllare i numeri passati nel ciclo (la traccia dice di nn usare un ARRAY)
		for (int i = 0; i < numeriInseriti; i++) {
			
			System.out.println("inserire un numero:\n");
			int indexNum = sc.nextInt();
			
			//controlla se il numero è posito e pari, se non lo è la VAR positiviPari diveta FALSE ed esce andando ad ELSE
			if (indexNum < 0 || indexNum % 2 != 0) 	positiviPari = false;
		}
				
			if (positiviPari) {
				System.out.println("tutti i numeri sono Positivi e Pari");
			} else 
				System.out.println("Hai inserito dei numeri Dispari!!");
			
			
			
			
		
	}

}
