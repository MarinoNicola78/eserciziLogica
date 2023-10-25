package iteratori;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class EsercizioIteratori {

	/* serve per iterare, creare un loop  */
	public static void main(String[] args) {

		List<String> persone = new ArrayList<String>();
		persone.add("nicola");
		persone.add("fabio");
		persone.add("marco");
		persone.add("fede");
		
		System.out.println("lista senza uso Iterotor: " + persone);
		System.out.println("modifico il primo nome della lista \n");
		persone.set(0, "NICOLA BIG");
		System.out.println("nuova lista modificata: " + persone);
		
		Iterator<String> personeIt = persone.iterator();
		
		System.out.println("prima persona della lista Iterator: \n" + personeIt.next());
		
		System.out.println("\nstampo il resto della fila con ciclo Iterator: \n");
		while(personeIt.hasNext()) {
		System.out.println(personeIt.next());
		}
		
		
		
	}

}
