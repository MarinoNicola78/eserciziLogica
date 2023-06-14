package esercizioCampionato;

import java.util.ArrayList;
import java.util.List;

public class Campionato {

	private String nomeCampionato;

	private List<Squadra> squadre;

	private List<Partita> partite = new ArrayList<Partita>();

	// Getter and Setter
	public String getNomeCampionato() {
		return nomeCampionato;
	}

	public List<Squadra> getSquadre() {
		return squadre;
	}

	public List<Partita> getPartite() {
		return partite;
	}

	public void setNomeCampionato(String nomeCampionato) {
		this.nomeCampionato = nomeCampionato;
	}

	public void setSquadre(List<Squadra> squadre) {
		this.squadre = squadre;
	}

	public void setPartite(List<Partita> partite) {
		this.partite = partite;
	}

	public void getInfoSquadra(Squadra squadra) {

		for (Partita partita : partite) {

			if (partita.getSquadraCasa().getNomeSquadra().equals(squadra.getNomeSquadra()))
				;
			{
				System.out.println(squadra.getNomeSquadra() + " - " + partita.getSquadraTrasferta().getNomeSquadra()
						+ " questa partita e giocata in casa");

			}
		}
	}
}
