package ereditarietà;

public class Dipendente extends Persona {

	private String stipendio;

	public String toStringCustom() {
		return "Dipenrente: " + getNome() + " " + getCognome() + " " + this.stipendio;
	}

	public Dipendente(String nome, String cognome, String stipendio) {
		super(nome, cognome);
		this.stipendio = stipendio;
		
	}

}
