package studente;

import java.util.ArrayList;
import java.util.List;

public class Studente {

	private String nome, cognome;
	private List<Double> voti;

	public Studente() {
		super();
		this.nome = "";
		this.cognome = "";
		this.voti = new ArrayList<>();
	}

	public Studente(String nome, String cognome, List<Double> voti) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.voti = voti;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public List<Double> getVoti() {
		return voti;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setVoti(List<Double> voti) {
		this.voti = voti;
	}

	// add voto alla lista
	public void aggiungiVoto(Double voto) {
		this.voti.add(voto);
	}

	// calcosa Media Voti
	public Double calcolaMedia(List<Double> voti) {
		Double somma = 0.0;
		for (int i = 0; i < this.voti.size(); i++) {
			somma += voti.get(i);
		}
		Double media = somma / this.voti.size();
		return media;
	}

	public void stampaInformazioni() {

	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", voti=" + voti + "]";
	}

}
