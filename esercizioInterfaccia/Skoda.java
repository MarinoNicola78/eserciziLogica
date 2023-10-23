package esercizioInterfaccia;

public class Skoda implements Veicolo {

	@Override
	public String rumore() {
		String tipoRumore = "brummmmmmmmm sono la skoda";
		return tipoRumore;
	}

	@Override
	public String velocità() {
		String velocità = "vado a 100 Km/h";
		return velocità;
	}

}
