/*Problema: Rovescia l'Ordine delle Parole in una Frase*/
package stringhe;

import java.util.Arrays;

public class RovesciaParole {

	public static String rovesciaParole1(String frase) {
		String[] parole = frase.split(" ");
		StringBuilder risultato = new StringBuilder();

		for (int i = parole.length - 1; i >= 0; i--) {
			risultato.append(parole[i]).append(" ");
		}

		return risultato.toString().trim(); // Rimuove lo spazio finale aggiunto nell'ultimo ciclo
	}

	public static void rovesciaParole(String frase) {
		// split String in Array per ogni spazio -> " "
		String[] arrayFrase = frase.split(" ");
		System.out.print("Frase originale immessa: " + Arrays.toString(arrayFrase));
		System.out.println("\n");
		System.out.print("Frase rovesciata: ");
		for (int i = arrayFrase.length - 1; i >= 0; i--) {
			System.out.print(" " + arrayFrase[i]);
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		String frase = "ciao nicola come stai";
		
		
		rovesciaParole(frase);
		
		String frase1 = "Che bella giornata";
		String resFrase = rovesciaParole1(frase1);
		System.out.print("metodo rovesciaParole1: " + resFrase);
	}
}
