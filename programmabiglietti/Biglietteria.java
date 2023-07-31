package programmabiglietti;

import javax.swing.JOptionPane;

/* Su una linea ferroviaria, rispetto alla tariffa piena, gli utenti pensionati usufruiscono di uno sconto del
10%, gli studenti del 15% e i disoccupati del 25%. Codificando i pensionati con una P, gli studenti con una S e i
disoccupati con una D, scrivere un programma che, richiesto il costo di un biglietto e l'eventuale condizione
particolare dell'utente, visualizzi l'importo da pagare. */

public class Biglietteria {

	String p = "pensionato";
	String s = "studente";
	String d = "disoccupato";
	String n = "pendolare";

	static Double scontoPensionato = 10.;
	static Double scontoStundente = 15.;
	static Double scontoDisoccupato = 25.;

	static Double costoBiglietto = 0.;
	Double valorePercentuale = 0.;
	static Double importoDaPagare = 0.;

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "PROGRAMMA BIGLIETTERIA");

		int costoBiglietto = Integer.parseInt(JOptionPane.showInputDialog(
				"Digitare il costo del Biglietto:"));
		
		int scelta = Integer.parseInt(JOptionPane.showInputDialog(
				"Digitare 1 se sei Pensionato \nDigitare 2 se sei Studente \nDigitare 3 se sei Disoccupato \nDigitare 4 se sei un Pendolare \nDogitare 5 per TERMINARE IL PROGRAMMA"));

		switch (scelta) {

		case 1: {
			Double valorePercentuale = (costoBiglietto * scontoPensionato) / 100; // percentuale di sconto applicata
			importoDaPagare = costoBiglietto - valorePercentuale;
			JOptionPane.showMessageDialog(null, "SEI UN PENSIONATO \nIMPORTO DA PAGARE: " + importoDaPagare + "€");
			break;
		}

		case 2: {
			Double valorePercentuale = (costoBiglietto * scontoStundente) / 100; // percentuale di sconto applicata
			importoDaPagare = costoBiglietto - valorePercentuale;
			JOptionPane.showMessageDialog(null, "SEI UNO STUDENTE \nIMPORTO DA PAGARE: " + importoDaPagare + "€");
			break;

		}

		case 3: {
			Double valorePercentuale = (costoBiglietto * scontoDisoccupato) / 100; // percentuale di sconto applicata
			importoDaPagare = costoBiglietto - valorePercentuale;
			JOptionPane.showMessageDialog(null, "SEI UN DISOCCUPATO DI MERDA QUINDI VAI A LAVORARE TERRONE \nIMPORTO DA PAGARE: " + importoDaPagare + "€");
			break;

		}

		case 4: {
			JOptionPane.showMessageDialog(null,
					"NON SI HA DIRITTO A NESSUNO SCONTO \nIMPORTO DA PAGARE: " + costoBiglietto + "€");
			break;

		}

		case 5: {

			JOptionPane.showMessageDialog(null, "SESSIONE TERMINATA");
			break;
		}

		default: {
			JOptionPane.showMessageDialog(null, "VALORE DIGITATO NON CORRETTO");
			break;
		}

		}
	}

}
