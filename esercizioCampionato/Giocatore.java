package esercizioCampionato;

public class Giocatore {

	private String nomeGiocartore;
	
	private int annoDiNascita;
	
	private boolean capitano;

	

	// Costruttore
	public Giocatore(String nomeGiocartore, int annoDiNascita) {
		super();
		this.nomeGiocartore = nomeGiocartore;
		this.annoDiNascita = annoDiNascita;
	}

	// Getter and Setter
	public String getNomeGiocartore() {
		return nomeGiocartore;
	}

	public void setNomeGiocartore(String nomeGiocartore) {
		this.nomeGiocartore = nomeGiocartore;
	}
	
	public int getAnnoDiNascita() {
		return annoDiNascita;
	}

	public void setAnnoDiNascita(int annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}

	public boolean isCapitano() {
		return capitano;
	}

	public void setCapitano(boolean capitano) {
		this.capitano = capitano;
	}
	
	@Override
	public String toString() {
		return "Giocatori [nomeGiocartore=" + nomeGiocartore + ", annoDiNascita=" + annoDiNascita + "]";
	}


	
	

}
