package ereditarietà;

public class Persona {

	private String nome, cognome;

	@Override
	public String toString() {
		return "Persona: " + nome + " " + cognome;
	}

	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

}
