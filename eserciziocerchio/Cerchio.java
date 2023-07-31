package eserciziocerchio;

//https://mozart.diei.unipg.it/didimo/terniNew/PDF/E5-Esercizi-Uso-Classi-Oggetti-Java.pdf

/*Scrivere una classe di nome UsoCerchio, avente soltanto il metodo speciale main. Tale metodo
deve svolgere queste azioni:
1. Fare inserire all’utente tramite tastiera i raggi r1 e r2 di due cerchi nel piano.
2. Creare due oggetti Cerchio, c1 e c2, di raggio rispettivamente r1 e r2.
3. Stampare sullo standard output il diametro, il perimetro e l’area dei cerchi rappresentati
da c1 e c2.
4. Creare un terzo oggetto Cerchio c3, che rappresenti un cerchio di raggio pari alla somma
dei raggi dei cerchi rappresentati da c1 e c2.
5. Stampare sullo standard output il diametro, il perimetro e l’area del cerchio rappresentato
da c3.
Al termine della scrittura della classe, compilarla ed eseguirla più volte, provando a variare i
dati di input richiesti dal programma.
 * */

public class Cerchio {

	// Double r = 0.;

	// costruttore per creare un oggetto Cerchio che
	// rappresenta un cerchio di raggio r (si ricordi che il tipo double indica
	// numeri reali).
	public Cerchio(double r) {

	}

	// metodo che restituisce il diametro del cerchio
	// rappresentato dall’oggetto ricevente.
	public double diametro(double r) {
		double diametro = r * 2;
		return diametro;
	}

	// metodo che restituisce il perimetro del cerchio
	// rappresentato dall’oggetto ricevente.
	public double perimetro(double p, double r) {
		double perimetro = 2 * r * Math.PI;
		return perimetro;
	}

	// metodo che restituisce l’area del cerchio rappresentato
	// dall’oggetto ricevente.
	public double area(double r) {
		double area = (r * r) * Math.PI;
		return area;
	}

	// metodo che restituisce un nuovo
	// oggetto Cerchio il cui raggio è la somma dei raggi dei cerchi rappresentati
	// dall’oggetto
	// ricevente e dall’oggetto c.
	public Cerchio sommaRaggio(Cerchio c) {

		return c;
	}
}
