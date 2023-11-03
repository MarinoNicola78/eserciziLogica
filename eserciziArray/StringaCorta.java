/* Implementare un metodo statico di nome
stringaCorta che prende come parametro un array di oggetti String 
e che restituisce la stringa dell’array avente lunghezza minima. 
Nel caso vi fossero due o più stringhe con la lunghezza minima,
il metodo ne deve restituire una arbitrariamente. 
*/

package eserciziArray;

public class StringaCorta {

	public static String stringaCorta(String[] arrayStringa) {
		String corta = arrayStringa[0];
	
		for (int i = 1; i < arrayStringa.length; i++) {
			if(arrayStringa[i].length() < corta.length())
				corta = arrayStringa[i];
		}
		System.out.println("la stringa piu corta dell' Array e: " + corta);
		return corta;

		}
	
	
	public static void main(String[] args) {

		String[] arrayStringa = { "nicola", "fede", "maricomarino", "fabiomarino"};
		stringaCorta(arrayStringa);
	}

}
