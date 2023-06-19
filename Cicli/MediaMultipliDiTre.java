//esercizi pdf "esercizi1" traccia 2.4

package Cicli;

import java.util.Scanner;

public class MediaMultipliDiTre {

	public static void main(String[] args) {
		
		//VAR
		int mediaDivTre = 0;
		int count = 0;
		int divTre = 0;
		int indexNum = 0;
		//creazione scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Quanti numeri vuoi inserire?\n");
		int numeriInseriti = sc.nextInt();
		
		//FOR per far inserire i numeri
		for (int i = 0; i < numeriInseriti; i++) {
			System.out.println("inserire un numero:\n");
			indexNum = sc.nextInt();
			//IF per controllare ed eseguire la logica del programma
			if(indexNum % 3 == 0) {
			divTre += indexNum;
			count++;
				
			}
		}System.out.print("La media dei numeri divisibili per 3 e':\n" + divTre / count);

	}

}
