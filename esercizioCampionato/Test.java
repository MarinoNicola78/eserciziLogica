package esercizioCampionato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Campionato campionato = new Campionato();
		
		campionato.setNomeCampionato("2022/2023");
		
		Partita partita1 = new Partita();
		Partita partita2 = new Partita();
		
		Squadra squadra1 = new Squadra("inter");
		Squadra squadra2 = new Squadra("milan");
		Squadra squadra3 = new Squadra("juve");
		Squadra squadra4 = new Squadra("napoli");
		
		partita1.setSquadraCasa(squadra1);
		partita1.setSquadraTrasferta(squadra2);
		
		partita2.setSquadraCasa(squadra3);
		partita2.setSquadraTrasferta(squadra4);
		
		partita1.setGolSquadraCasa(2);
		partita1.setGolSquadraTrasferta(3);
				
		campionato.getPartite().add(partita1);
		campionato.getPartite().add(partita2);

		campionato.getInfoSquadra(squadra1);

	}

}
