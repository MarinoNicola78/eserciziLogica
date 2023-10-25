package ricorsione;

public class EsercizioRicorsione {

	// static ti permette di richiamre il metdo direttamente senza istanziare la
	// classe
	public static String decimalToBinary(int n, String r) {

		// condizione necessaria che chiude lo stack ed evita errore di stackoverflow
		if (n == 0) {
			return r;
		}
		r = n % 2 + r;
		return decimalToBinary(n / 2, r);
	}

	public static String reverseParola(String p) {

		if (p.equals("")) {
			return "";
		}

		return reverseParola(p.substring(1)) + p.charAt(0);
	}

	public static void main(String[] args) {

		System.out.println("numero converito in decimale: " + decimalToBinary(20, ""));

		System.out.println("parola reversata: " + reverseParola("nicola grosso"));
		
	}

}
