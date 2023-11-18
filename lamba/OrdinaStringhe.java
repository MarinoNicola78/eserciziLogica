package lamba;

import java.util.ArrayList;
import java.util.List;

public class OrdinaStringhe {

	/*
	 * prende in input una lista di stringhe e restituisce una nuova lista
	 * contenente le stringhe ordinate per lunghezza crescente.
	 */

	public static List<String> ordinaPerLunghezza(List<String> stringhe) {

		// il metodo sort mi ordina la lista, 
		stringhe.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		return stringhe;

	}

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();

		lista.add("Nicola");
		lista.add("è");
		lista.add("in");
		lista.add("mediobanca");

		List<String> listaWork = ordinaPerLunghezza(lista);

		System.out.println("lista passata al metodo: " + listaWork);

	}

}
