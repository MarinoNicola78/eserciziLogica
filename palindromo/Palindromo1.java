package palindromo;

import java.util.Iterator;
import java.util.Scanner;

public class Palindromo1 {

	public static void main(String[] args) {

		System.out.println("ESERCIZIO: PALINDROMO");
		System.out.println("inserire una Stringa da controllare: ");
		Scanner scFrase = new Scanner(System.in);

		String frase = scFrase.nextLine();

		String fraseTuttoMinuscolo = frase.toLowerCase();
		System.out.print("frase tutto minuscolo: " + fraseTuttoMinuscolo);
		System.out.println();
		String fraseSenzaSpazi = fraseTuttoMinuscolo.replace(" ", "");
		System.out.print("fraseSenzaSpazi: " + fraseSenzaSpazi);
		System.out.println();
		System.out.print("frase reverse: ");

		int index = 0;
		char[] ca = new char[fraseSenzaSpazi.length()];
		for (int i = fraseSenzaSpazi.length() - 1; i >= 0; i--) {
			ca[index] = fraseSenzaSpazi.charAt(i);
			index++;
			System.out.print(fraseSenzaSpazi.charAt(i));
		}
		System.out.println();
		System.out.print("array di char: ");
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
		System.out.println();
		// converto array ca in String per fare il confronto
		String caToString = String.valueOf(ca);
		System.out.println("array ca convertito in String: " + caToString);

		System.out.println();

		if (caToString.equals(fraseSenzaSpazi)) {
			System.out.println("La String immessa è palindroma");
		}
		else System.out.println("La String immessa NON palindroma");

	}
}
