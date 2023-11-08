/*Scrivere un programma SommaPariDispari che prevede un array di 10 numeri interi
contenente valori a piacere (senza bisogno di chiederli all'utente) e stampa “Pari e dispari uguali” se
la somma dei numeri in posizioni pari dell'array è uguale alla somma dei numeri in posizioni dispari,
altrimenti il programma stampa “Pari e dispari diversi”*/

package eserciziArray;

public class SommaPariDispari {

	public static void main(String[] args) {

		// soluzione 1

		int[] numeri = { 1,2,3,4,5,6,7,8,9,10 };
		int sommaPari = 0;
		int sommaDispari = 0;

		for (int i = 0; i < numeri.length; i++) {
			if (i % 2 == 0) {
				sommaPari += numeri[i];
			}
		}
		System.out.println(sommaPari);

		for (int i = 0; i < numeri.length; i++) {
			if (i % 2 != 0) {
				sommaDispari += numeri[i];
			}
		}
		System.out.println(sommaDispari);

		
		// soluzione 2

		int[] valori = { 1,2,3,4,5,6,7,8,9,10 };
		int sumPari = 0;
		int sumDispari = 0;
		for (int i = 0; i < valori.length; i += 2) { // pari con i inizialmente 0 :
			// i i+2
			sumPari += valori[i];
			sumDispari += valori[i + 1]; // dispari … se i pari : i+1
		}
		if (sumPari == sumDispari) {
			System.out.println(" somma pari: " + sumPari);
			System.out.println(" somma dispari: " + sumDispari);
			System.out.println(" Pari e dispari uguali ");
		} else {
			System.out.println(" somma pari: " + sumPari);
			System.out.println(" somma dispari: " + sumDispari);
			System.out.println(" Pari e dispari diversi ");
		}
			
	

	}
}
