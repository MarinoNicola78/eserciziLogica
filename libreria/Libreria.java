package libreria;

public class Libreria {

	Libro[] libri;

	public Libreria(Libro[] libri) {

		this.libri = libri;
	}

	public int trovaLibro(String autore, int k) {

		int res = 0;
		for (int i = 0; i < libri.length; i++) {
			if (autore.contains(libri[i].getAutore()) && k < libri[i].getPrezzo()) {
				res++;
			}
		}
		return res;
	}

	public String[] getTitoli(String autore) {

		// primo FOR serve per inizializzare Array String titoli
		int j = 0;
		for (int i = 0; i < libri.length; i++) {
			if (autore.equals(libri[i].getAutore())) {
				j++;
			}
		}
		// secondo FOR serve per popolare Array String titoli
		String[] titoli = new String[j];
		int index = 0;
		for (int i = 0; i < libri.length; i++) {
			if (autore.equals(libri[i].getAutore())) {
				titoli[index] = libri[i].getTitolo();
				index++;
			}
		}
		return titoli;
	}
}
