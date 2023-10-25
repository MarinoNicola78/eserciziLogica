package collezioniEndMappe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

/* viene utilizza un riferimento chiave - valore */
public class EsercizioMappe {

	public static void main(String[] args) {
		HashMap<Integer, String> persone = new HashMap<Integer, String>();

		// come gli array utilizza gli index che partono da 0
		// per aggiungrre nuovi menbri uso -> .put
		persone.put(1, "nicola");
		persone.put(2, "marco");
		persone.put(3, "fabio");
		persone.put(4, "fede");
		persone.put(5, "dexter");

		System.out.println("dimensione lista: " + persone.size());
		System.out.println("Lista: " + persone);

		System.out.println("persona al numero 3: " + persone.get(3));

		System.out.println("modifico nome della persona 3");
		persone.replace(3, "DEXTER");
		System.out.println("lista con nome n.3 modificato: " + persone);

		System.out.println("rimuovo FEDE il numero 4 dalla lista");
		persone.remove(4);

		System.out.println("lista aggiormata dopo il delete: " + persone);

		System.out.println("cancello tutta la lista");
		persone.clear();
		System.out.println("lista vuota: " + persone);

//		if (persone.isEmpty()) {
//			System.out.println("lista vuota");
//
//			int count = 1;
//			int limite = 5;
//			while (persone.size() < limite) {
//				System.out.print("inserisci un nome: ");
//				Scanner sc = new Scanner(System.in);
//				String nomeAdd = sc.nextLine();
//				persone.put(count, nomeAdd);
//				System.out.println("nuova lista: " + persone);
//				count++;
//			}
//		}

		System.out.println("lista piena");
		System.out.println("dimenzione nuova lista: " + persone.size());

		// Politca del FIFO (first Input First Output)
		// lista popolata tramite Arrays.asList
		LinkedList<String> persone1 = new LinkedList<String>(Arrays.asList("NICOLA", "MARCO", "FABIO", "FEDE"));

		System.out.println("\nlista tipo LinkedList:  " + persone1);
		System.out.println(
				"aggiungo MARINO come primo memnbro sfruttando la politica FIFO, va al primo posto della pila");
		persone1.addFirst("MARINO"); // pila

		System.out.println("\nlista tipo LinkedList:  " + persone1);

		// eliminare i doppioni, non tiene conto dell'ordine di inserimento
		HashSet<String> persone2 = new HashSet<String>(
				Arrays.asList("NICOLA", "NICOLA", "NICOLA", "FEDE", "FEDE", "FEDE"));
		System.out.println("\nlista tipo HashSet:  " + persone2);

		// eliminare i doppioni, mantione ordine di inserimento
		LinkedHashSet<String> persone3 = new LinkedHashSet<String>(
				Arrays.asList("NICOLA", "NICOLA", "NICOLA", "FEDE", "FEDE", "FEDE"));
		System.out.println("\nlista tipo HashSet:  " + persone3);

	}

}
