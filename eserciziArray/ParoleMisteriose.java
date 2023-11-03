/*Scrivere un programma ParoleMisteriose che crea e inizializza un array di stringhe
contenete 5 parole a piacere (usando il comando di inizializzazione che prevede la lista dei valori tra
parentesi graffe) e chiede all’utente di indovinare una tra le 5 parole entro 3 tentativi.*/

package eserciziArray;

import java.util.Scanner;

public class ParoleMisteriose {

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
					return;
				}
			}
			index++;
		}
		System.out.println("tentativi esauriti, non ha indivinato!!");

	}

}
