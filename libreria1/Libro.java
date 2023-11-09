package libreria1;

public class Libro {

	private String titolo, autore;
	private int annoPubblicazione, numeroCopieDisponibili;

	public Libro() {

	}

	public Libro(String titolo, String autore, int annoPubblicazione, int numeroCopieDisponibili) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroCopieDisponibili = numeroCopieDisponibili;
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

	public int getNumeroCopieDisponibili() {
		return numeroCopieDisponibili;
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

	public void setNumeroCopieDisponibili(int numeroCopieDisponibili) {
		this.numeroCopieDisponibili = numeroCopieDisponibili;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroCopieDisponibili=" + numeroCopieDisponibili + "]";
	}

}
