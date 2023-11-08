/*Crea un programma per la gestione di un controcorrente gestito dalla classe CC. 
 * Il programma deve essere in grado di effettuare versamenti, prelievi e
 * di restituire il saldo e di effettuare la lista degli ultimi 5 movimenti .*/

package classi.contocorrente;

public class ContoCorrente {

	private int saldo;
	private int[] ultimiCinqueMovimenti = new int[5];

	public ContoCorrente(int saldo) {
		super();
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public int[] getUltimiCinqueMovimenti() {
		return ultimiCinqueMovimenti;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setUltimiCinqueMovimenti(int[] ultimiCinqueMovimenti) {
		this.ultimiCinqueMovimenti = ultimiCinqueMovimenti;
	}

	public String versamento(int versamento) {

		int saldoPiuPrelievo = this.saldo + versamento;
		setSaldo(saldoPiuPrelievo);
		// shift array verso destra e mi tiene sempre lo storico dei movimenti
		// modello FIFO (first in first out)
		for (int i = this.ultimiCinqueMovimenti.length - 1; i >= 1; i--) {
			this.ultimiCinqueMovimenti[i] = this.ultimiCinqueMovimenti[i - 1];
		}
		this.ultimiCinqueMovimenti[0] = versamento;

		return "Versamento Ok";
	}

	public void prelievo(int prelievo) {
		int positiveVal = prelievo;
		int negativeVal = Math.negateExact(positiveVal);
		versamento(negativeVal);
		//int saldoMenoPrelievo = this.saldo - prelievo;
		//setSaldo(saldoMenoPrelievo);
	}

	public void listaMovimenti() {
		for (int i = 0; i < this.ultimiCinqueMovimenti.length; i++) {
			if (this.ultimiCinqueMovimenti[i] < 0) {
				System.out.println("prelievo: " + this.ultimiCinqueMovimenti[i]);
			} else
				System.out.println("versamento: " + this.ultimiCinqueMovimenti[i]);

		}
	}

}
