package gestionePalestra;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Test {

	public static void main(String[] args) {

		// Creazione di una data specifica senza utilizzare il timestamp
		Calendar calendar = Calendar.getInstance();
		calendar.set(2024, 11, 31);
		// definisco formato della Data
		SimpleDateFormat formatData = new SimpleDateFormat(" dd/MM/yyyy");
		// Formatto la data
		String data1 =  formatData.format(calendar.getTime());

		Cliente cliente1 = new Cliente("Nicola Marino", Abbonamento.OPEN, 30, data1);
//		Cliente cliente2 = new Cliente("Fede Micheletti", Abbonamento.SENIOR, 70, today);
//		Cliente cliente3 = new Cliente("Marco Marino", Abbonamento.POMERIGGIO, 15, today);
//		Cliente cliente4 = new Cliente("Fabio Marino", Abbonamento.POMERIGGIO, 15,today);
//		Cliente cliente5 = new Cliente("Dexter Marino", Abbonamento.OPEN, 30, today);

		Palestra palestra = new Palestra();

		palestra.aggiungiCliente(cliente1);
//		palestra.aggiungiCliente(cliente2);
//		palestra.aggiungiCliente(cliente3);
//		palestra.aggiungiCliente(cliente4);
//		palestra.aggiungiCliente(cliente5);

		palestra.stampaClienti();
		System.out.println();
		palestra.stampaClientiDataScadenzaAbbonamento();

		System.out.println("\n\ncosti Tot gestione palestra: " + palestra.calcolaCostiTotali());

	}

}
