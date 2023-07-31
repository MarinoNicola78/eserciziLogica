package eserciziocerchio;

import javax.swing.JOptionPane;

public class UsoCerchio {

	public static void main(String[] args) {

		
		//titolo App
		JOptionPane.showMessageDialog(null, "PROGRAMMA CERCHIO");

		//faccio immetere i valoro del raggio r1 e r2
		double r1 = (double) Integer.parseInt(JOptionPane.showInputDialog(
				"Immetere il valore del raggio r1: "));
		
		double r2 = (double) Integer.parseInt(JOptionPane.showInputDialog(
				"Immetere il valore del raggio r2: "));
		
		//creo 2 cerchio con i valori presi r1 e r2
		Cerchio cerchio1 = new Cerchio(r1);
		Cerchio cerchio2 = new Cerchio(r2);
		
		//ricavo diametro, perimetro e area coi rispettivi metodi
		double diametro1 = cerchio1.diametro(r1);
		double diametro2 = cerchio1.diametro(r2);
		
		double perimetro1 = cerchio1.perimetro(diametro1, r1);
		double perimetro2 = cerchio2.perimetro(diametro2, r2);
		
		double area1 = cerchio2.area(r1);
		double area2 = cerchio2.area(r2);
		
		//stampa a video dei risultati
		JOptionPane.showMessageDialog(null, "STAMPO A VIDEO LE PROPRIETA DEI CERCHI 1 E 2: \nDIAMETRO \nPERIMETRO \nAREA");
		
		JOptionPane.showMessageDialog(null, "Diametro Cerchio1: " + diametro1);
		JOptionPane.showMessageDialog(null, "Diametro Cerchio2: " + diametro2);
		
		JOptionPane.showMessageDialog(null, "Perimetro Cerchio1: " + perimetro1);
		JOptionPane.showMessageDialog(null, "Perimetro Cerchio2: " + perimetro2);
		
		JOptionPane.showMessageDialog(null, "Area Cerchio1: " + area1);
		JOptionPane.showMessageDialog(null, "Area Cerchio2: " + area2);
		
		double sommaRaggio = r1 + r2;

		//creo nuovo Cerchio3
		Cerchio cerchio3 = new Cerchio(sommaRaggio);
		
		JOptionPane.showMessageDialog(null, "Creo Cerchio3, con raggio r ottenuto dalla somma del raggio r1 + r2");
		
		double diametro3 = cerchio3.diametro(sommaRaggio);
		double perimetro3 = cerchio3.perimetro(diametro3, sommaRaggio);
		double area3 = cerchio3.area(sommaRaggio);
		
		JOptionPane.showMessageDialog(null, "STAMPO A VIDEO LE PROPRIETA DEI CERCHIO 3: \nDIAMETRO \nPERIMETRO \nAREA");

		JOptionPane.showMessageDialog(null, "Diametro Cerchio3: " + diametro3);
		JOptionPane.showMessageDialog(null, "Perimetro Cerchio3: " + perimetro3);
		JOptionPane.showMessageDialog(null, "Area Cerchio3: " + area3);

		JOptionPane.showMessageDialog(null, "PROGRAMMA TERMINATO");





		
		

		
		
		
		
		
		
		
		
	}

}
