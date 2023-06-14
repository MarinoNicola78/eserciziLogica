package esercizioCampionato;

import java.util.ArrayList;

public class Squadra {

	private String nomeSquadra;

	private ArrayList<Giocatore> giocatori;

	// Costruttore
	public Squadra(String nomeSquadra) {
		super();
		this.nomeSquadra = nomeSquadra;
	}

	// Getter and Setter
	public String getNomeSquadra() {
		return nomeSquadra;
	}

	public ArrayList<Giocatore> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(ArrayList<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}

	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}

	@Override
	public String toString() {
		return "Squadre [nomeSquadra=" + nomeSquadra + "]";
	}

}
