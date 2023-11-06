package scuola;

public class Test {

	public static void main(String[] args) {

		Docente docente1 = new Docente("nicola","marino","mrnncl",14); 
		Docente docente2 = new Docente("marco","gemello1","mrcncl",44);
		Docente docente3 = new Docente("fabio","gemello2","fabncl",19);
		Docente docente4 = new Docente("fede","micheletti","fabncl",56);
		Docente docente5 = new Docente("dexter","cane","fabncl",90);
		
		Docente[] docenti = {docente1, docente2, docente3, docente4, docente5};
	
		Universita universita = new Universita(docenti);
		
		int etaMediaDocenti = universita.etaMedia(docenti);
		int etaMininaDocenti = universita.etaMinima(docenti);
		int etaMassimaDocenti = universita.etaMassima(docenti);
		String docenteEtaMinima = universita.getCognomiConEtaMinima(docenti);
		
		System.out.println("eta media dei docenti e: " + etaMediaDocenti);
		System.out.println("eta minima dei docenti e: " + etaMininaDocenti);
		System.out.println("eta massima dei docenti e: " + etaMassimaDocenti);
		System.out.println("docente con eta minina: " + docenteEtaMinima);
		
		
	}

}
