package gestionePalestra;

import java.util.ArrayList;
import java.util.List;

public class Palestra {

	private List<Cliente> clienti = new ArrayList<>();

	public String aggiungiCliente(Cliente cliente) {
		clienti.add(cliente);

		return "Cliente aggiunto!!";
	}

	/*
	 * nella classe Palestra dovrebbe calcolare e stampare i costi totali di tutti
	 * gli abbonamenti dei clienti.
	 */
	public int calcolaCostiTotali() {
		int costiParziale = 0;
		int count = 0;
		int costoTot = 0;
		for (Cliente cliente : this.clienti) {
			costoTot += cliente.calcolaCostoAbbonamento(cliente.getEta(), cliente.getTipoAbbonamento());
		}

		return costoTot;
	}

	public List<Cliente> stampaClienti() {
		for (Cliente cliente : clienti) {
			System.out.print("\n Nominativo cliente: " + cliente.getNome());
		}
		return clienti;
	}
	
	public List<Cliente> stampaClientiDataScadenzaAbbonamento() {
		for (Cliente cliente : clienti) {
			System.out.print("\n Nominativo cliente: " + cliente.getNome() + cliente.getDataScadenzaAbbonamento());
		}
		return clienti;
	}

	public List<Cliente> getClienti() {
		return clienti;
	}

	public void setClienti(List<Cliente> clienti) {
		this.clienti = clienti;
	}

}
