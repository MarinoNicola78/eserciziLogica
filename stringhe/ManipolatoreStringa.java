package stringhe;

import javax.management.openmbean.TabularData;

/*Un oggetto di questa classe
rappresenta una stringa e dispone di alcuni metodi per manipolarla. Il costruttore e i metodi di
istanza della classe sono i seguenti:
 * */

public class ManipolatoreStringa {

	/* Costruttore */
	public ManipolatoreStringa(String s) {

	}

	/* Metodi */

	// metodo che restituisce una nuova stringa ottenuta
	// invertendo la stringa rappresentata dall’oggetto ricevente (cioè leggendo i
	// suoi caratteri da
	// destra verso sinistra).
	public String inverti(String str) {
		//creo oggetto builder dalla Classe StringBuilder()
		StringBuilder builder = new StringBuilder();
		// faccio inversione della stringa
		for (int i = str.length() - 1; i >= 0; i--) {
			//uso metoto append per stampare appendere ogni singolo carattere preso dall'ultimo
			builder.append(str.charAt(i));
		}
		//ritorno la stringa al contrerio
		return builder.toString();

	}

	// metodo che restituisce una nuova stringa ottenuta
	// rimuovendo gli spazi bianchi dalla stringa rappresentata dall’oggetto
	// ricevente.
	public String rimuoviSpazi(String str) {
		String strSenzaSpazi = str.replace(" ", "");
		return strSenzaSpazi;
	}

//	metodo che restituisce una nuova stringa
//	ottenuta concatenando (cioè giustapponendo) la stringa rappresentata dall’oggetto
//	ricevente con la stringa s.
	public String concatenaCon(String strSenzaSpazi) {
		String strConcatenata = strSenzaSpazi.concat(strSenzaSpazi);
		return strConcatenata;
	}
}
