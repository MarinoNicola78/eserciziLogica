package gestionePalestra;

import java.util.Date;

public class Cliente {

	private String nome;
	private Abbonamento tipoAbbonamento;
	private int eta;
	private String scadenzaAbbonamento;

	public Cliente() {
	}

	public Cliente(String nome, Abbonamento tipoAbbonamento, int eta, String scadenzaAbbonamento) {
		super();
		this.nome = nome;
		this.tipoAbbonamento = tipoAbbonamento;
		this.eta = eta;
		this.scadenzaAbbonamento = scadenzaAbbonamento;
	}

	public Abbonamento getTipoAbbonamento() {
		return tipoAbbonamento;
	}

	public void setTipoAbbonamento(Abbonamento tipoAbbonamento) {
		this.tipoAbbonamento = tipoAbbonamento;
	}

	public String getNome() {
		return nome;
	}

	public int getEta() {
		return eta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getDataScadenzaAbbonamento() {
		return scadenzaAbbonamento;
	}

	public void setDataScadenzaAbbonamento(String dataScadenzaAbbonamento) {
		this.scadenzaAbbonamento = dataScadenzaAbbonamento;
	}

	// calcolare il costo dell'abbonamento in base all'età e al tipo di abbonamento.
	public int calcolaCostoAbbonamento(int eta, Abbonamento tipoAbbonamento) {
		int costoAbbonamento = 0;
		if (eta < 18 && tipoAbbonamento.equals(Abbonamento.POMERIGGIO)) {
			costoAbbonamento = 25 * 12;
			// System.out.println("\ntipologia abbonamento: "+ tipoAbbonamento + " costo: "
			// + costoAbbonamento);
		}
		if (eta > 18 && eta < 65 && tipoAbbonamento.equals(Abbonamento.OPEN)) {
			costoAbbonamento = 30 * 12;
			// System.out.println("\ntipologia abbonamento: "+ tipoAbbonamento + " costo: "
			// + costoAbbonamento);
		}
		if (eta > 65 && tipoAbbonamento.equals(Abbonamento.SENIOR)) {
			costoAbbonamento = 19 * 12;
			// System.out.println("\ntipologia abbonamento: "+ tipoAbbonamento + " costo: "
			// + costoAbbonamento);
		}
		return costoAbbonamento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", eta=" + eta + ", tipoAbbonamento=" + tipoAbbonamento + "]";
	}

}
