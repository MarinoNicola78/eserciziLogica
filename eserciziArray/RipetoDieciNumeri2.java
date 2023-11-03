/*Modificare il programma RipetoDieciNumeri in modo che stampi i numeri
inseriti in ordine inverso. 
Aggiunto modifica che chiede quanti numeri inserire*/

package eserciziArray;

import java.util.Scanner;

public class RipetoDieciNumeri2 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int index = 0;
		
		Scanner scNum = new Scanner(System.in);
		Scanner scNumToPrint = new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi inserire nella lista da stampare: ");
		int numToPrint = scNumToPrint.nextInt();
		int[] arrayNumeri = new int[numToPrint];
		
		System.out.println("inserisci il  numero: ");
		while(index < numToPrint) {
			numero = scNum.nextInt();
			arrayNumeri[index++] = numero;
		}
		System.out.println("stampo la sequenza di numeri immessa al contrario: ");
		for(int j = arrayNumeri.length -1; j >= 0; j--) {
			System.out.println(arrayNumeri[j]);
		}
	}

}


