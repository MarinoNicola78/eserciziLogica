package scuola;

public class Docente {
	
	private String nome, cognome, codice;
	private int eta;
	
	
	
	public Docente(String nome, String cognome, String codice, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.eta = eta;
	}
	
	public Docente(Docente d) {
		this.nome = d.getNome();
		this.cognome = d.getCognome();
		this.codice = d.getCodice();
		this.eta = d.getEta();
		
		
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getCodice() {
		return codice;
	}
	public int getEta() {
		return eta;
	}
	
	
	
	
}
