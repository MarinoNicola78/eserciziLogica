package scuola;

public class Test {

	public static void main(String[] args) {

		Docente docente1 = new Docente("nicola","marino","mrnncl",34); 
		Docente docente2 = new Docente("marco","marino","mrcncl",54);
		Docente docente3 = new Docente("fabio","marino","fabncl",9);
		Docente docente4 = new Docente("fabio","marino","fabncl",100);
		Docente docente5 = new Docente("fabio","marino","fabncl",90);
		
		Docente[] docenti = {docente1, docente2, docente3, docente4, docente5};
	
		Universita universita = new Universita(docenti);
		
		int etaMediaDocenti = universita.etaMedia(docenti);
		int etaMininaDocenti = universita.etaMinima(docenti);
		int etaMassimaDocenti = universita.etaMassima(docenti);
		
		System.out.println("eta media dei docenti e: " + etaMediaDocenti);
		System.out.println("eta minima dei docenti e: " + etaMininaDocenti);
		System.out.println("eta massima dei docenti e: " + etaMassimaDocenti);
	}

}
