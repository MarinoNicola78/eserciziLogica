package gestioneBiblioteca;

public class Libro {

	private String titolo, autore;
	private int annoPubblicazione;

	public Libro() {}
	

	public Libro(String titolo, String autore, int annoPubblicazione) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", annoPubblicazione=" + annoPubblicazione + "]";
	}

	
}
