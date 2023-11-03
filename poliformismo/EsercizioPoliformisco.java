package poliformismo;

public class EsercizioPoliformisco {

	private static void getTipo(Object object) {

		// controllo del tipo di opggetto tramite "instanceof"
		if (object instanceof String) {
			System.out.println("oggetto: " + object + " e di tipo Stringa");
		} else if (object instanceof Integer) {
			System.out.print("faccio la somma di: " + object + "+" + "10 = ");
			Integer sum = (Integer) object + 10;
			System.out.println(sum);
		} else if (object instanceof Boolean) {
			System.out.println("oggetto: " + object + " e di tipo Boolean");
		} else
			System.out.println("non riscosco il tipo di oggetto passato come arg");
	}

	public static void main(String[] args) {

		String oggettoStringa = "nicolaDeveloper";
		Integer oggettoInteger = 10;
		Boolean oggettoBoolean = true;
		Double oggettoDouble = 1.1;

		getTipo(oggettoStringa);
		getTipo(oggettoInteger);
		getTipo(oggettoBoolean);
		getTipo(oggettoDouble);

	}

}
