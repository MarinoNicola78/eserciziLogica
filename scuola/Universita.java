package scuola;

import java.util.Arrays;

public class Universita {

	Docente[] docenti = new Docente[3];

	public Universita(Docente[] docenti) {
		super();
		this.docenti = docenti;
	}

	public int etaMedia(Docente[] docenti) {
		int sommaEta = 0;
		int mediaEta = 0;
		int count = 0;
		for (Docente docente : docenti) {
			sommaEta += docente.getEta();
			count++;
		}
		mediaEta = sommaEta / count;

		return mediaEta;
	}

	public int etaMinima(Docente[] docenti) {
		int tmp = docenti[0].getEta();
		for (int i = 0; i < docenti.length; i++) {
			if (tmp > docenti[i].getEta()) {
				tmp = docenti[i].getEta();
			}
		}
		return tmp;
	}
	
	public int etaMassima(Docente[] docenti) {
		int tmp = docenti[0].getEta();
		for (int i = 0; i < docenti.length; i++) {
			if (tmp < docenti[i].getEta()) {
				tmp = docenti[i].getEta();
			}
		}
		return tmp;
	}

}
