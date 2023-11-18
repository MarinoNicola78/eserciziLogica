package studente;

import java.util.ArrayList;
import java.util.List;

public class TestStudente {

	public static void main(String[] args) {
		
		List<Double> votiNicola = new ArrayList<>();
		List<Double> votiFede = new ArrayList<>();
		
		Studente studenteNicola = new Studente("Nicola","Marino", votiNicola);
		Studente studenteFede = new Studente("Fede","Micheletti", votiFede);
		
		studenteNicola.aggiungiVoto(8.0);
		studenteNicola.aggiungiVoto(6.0);
		studenteNicola.aggiungiVoto(7.5);
		studenteNicola.aggiungiVoto(9.0);
		
		studenteFede.aggiungiVoto(6.9);
		studenteFede.aggiungiVoto(2.0);
		studenteFede.aggiungiVoto(5.6);
		studenteFede.aggiungiVoto(3.0);
		
		
		System.out.println(studenteNicola);
		System.out.println(studenteFede);
		
		System.out.println("il voto medio di Nicola: " + studenteNicola.calcolaMedia(votiNicola));
		System.out.println("il voto medio di Nicola: " + studenteFede.calcolaMedia(votiFede));

		
	}

}
