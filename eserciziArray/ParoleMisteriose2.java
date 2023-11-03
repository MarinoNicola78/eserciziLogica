/*Modificare l’esercizio precedente in modo che se l’utente indovina una parola il programma
stampi l’elenco delle altre parole misteriose, 
mentre se l’utente sbaglia stampi tutte e 5 le parole misteriose.
*/

package eserciziArray;

import java.util.Scanner;

public class ParoleMisteriose2 {

	public static void main(String[] args) {

		String[] paroleMisteriose = { "cane", "gatto", "topo", "criceto", "pesce" };
		int index = 1;
		Scanner scNomeDaIndovinare = new Scanner(System.in);

		System.out.println("indovina la parola misteriosa con 3 tentativi");

		while (index <= 3) {
			System.out.println("tentativo numero " + index + " :");
			String parolaToFind = scNomeDaIndovinare.next();
			for (int i = 0; i < paroleMisteriose.length; i++) {
				if (parolaToFind.equals(paroleMisteriose[i])) {
					System.out.println("Indovinato!!");
					System.out.println("le altre parole miteriose sono: ");
					for (String tmpParola : paroleMisteriose) {
						if(!tmpParola.equals(parolaToFind))
						System.out.println(tmpParola);
					}return;
				}
			}
			index++;
		}
		System.out.println("tentativi esauriti, non ha indivinato!!");
		System.out.println("Le parole misteriose erano: ");
		String tmpParola = "";
		for (int i = 0; i < paroleMisteriose.length; i++) {
			tmpParola = paroleMisteriose[i];
			System.out.println(tmpParola);
		}

	}
}
