package esercizioInterfaccia;

public class Tmax implements Veicolo{

	@Override
	public String rumore() {
		String tipoRumore = "beeeeeeeeeee sono il Tmax di nicola";
		return tipoRumore;
	}

	@Override
	public String velocità() {
		String velocità = "vado a 200 Km/h";
		return velocità;
	}

}
