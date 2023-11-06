package libreria;

public class Libro {
	
	private String titolo, autore;
	private int prezzo;
	

	public Libro() {
		
	}

	public Libro(String titolo, String autore, int prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public String getAutore() {
		return autore;
	}
	public int getPrezzo() {
		return prezzo;
	}
	
	

}

