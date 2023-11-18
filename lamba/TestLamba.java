package lamba;

import java.util.Comparator;

public class TestLamba {

	public static void main(String[] args) {

		/* Abbiamo lo stesso risultato ma con la classe Anonima dobbiamo scrivere molte piu righe
		 * di codice, mentre usando espressione Lambda abbiamo codice pulito */
		
		
		/* Fatto con Classi anonime */
		
		//creo oggetto della classe Anonoma Comparator
		Comparator<String> confrontoStringhe1 = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.length() + s2.length();
			}
		};
		
		int result1 = confrontoStringhe1.compare("nicola", "fede");
		System.out.println("risultato con Classe Anonima: " + result1);
		
		
		
		/* Fatto con Funzioni Lambda */
		
		//espressione Lambda 			         //parametri		      //cosa deve fare
		Comparator<String> confrontoStringhe2 = (String s1, String s2) -> s1.length() + s2.length();
		
		int result2 = confrontoStringhe2.compare("nicola", "fede");
		System.out.println("risultato con espressione Lambda: " + result2);
		
	}

}
