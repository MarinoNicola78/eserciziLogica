/* Un oggetto della classe AgendaTelefonica
permette di gestire una semplice agenda (rubrica) telefonica. Ogni utenza dell’agenda ha un nome,
un cognome e un numero di telefono. L’agenda può gestire un numero limitato di utenze. Tale
numero deve essere scelto all’atto della creazione di un oggetto della classe AgendaTelefonica.
 */

package agendaTelefonica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaTelefonica {

	// nome[i], cognome[i] e numTel[i] memorizzano
	// nome, cognome e telefono della i-esima utenza

	private String nome[], cognome[], numTelefono[];

	/*
	 * costruttore: crea un’agenda che gestisce al massimo dim utenze
	 */
	public AgendaTelefonica(int dim) {
		this.nome = new String[dim];
		this.cognome = new String[dim];
		this.numTelefono = new String[dim];
	}

	/*
	 * se l’agenda non è piena, inserisce in agenda una nuova utenza con nome n,
	 * cognome c e numero di telefono t; poi restituisce true. Se l’agenda è piena
	 * restituisce false
	 */
	public boolean inserisci(String n, String c, String t) {

		boolean inserito = false;
		int i = 0;

		while (!inserito && i < this.nome.length)
			if (this.nome[i] == null) {
				this.nome[i] = n;
				this.cognome[i] = c;
				this.numTelefono[i] = t;
				inserito = true;
			} else
				i++;
		return inserito;
	}

	/*
	 * restituisce il numero di telefono di un’utenza con nome n e cognome c, se una
	 * tale utenza è presente in agenda; altrimenti restituisce null
	 */
	public String trova(String n, String c) {
		String numero = null;
		int i = 0;
		while (numero == null && i < this.nome.length && this.nome[i] != null)
			if (this.nome[i].equals(n) && this.cognome[i].equals(c)) {
				numero = this.numTelefono[i];
			} else
				i++;
		return numero;
	}

	/*
	 * visualizza sullo standard output la lista completa delle utenze in agenda
	 */
	public void listaUtenze() {
		for (int i = 0; i < this.nome.length; i++) {
			System.out.println("nome: " + this.nome[i] + " cognome: " + this.cognome[i] + " numeroTelefono: "
					+ this.numTelefono[i]);
		}

	}

}
