/*Scrivere una classe Esercizio1 che contenga al suo interno un metodo main, nel quale si chiede
all'utente di inserire un vettore di numeri reali V e si calcoli la media degli elementi di valore
pari, stampandola sullo schermo.
*/

package Cicli;

public class MediaPari {

	public static void main(String[] args) {
		
		//VAR
		int media = 0;
		int numPari = 0;
		int count = 0;
		
		//creato e popolato Array di tipo int chimato numeriReali
		int[] numeriReali = {4,3,69,2,55,22,45,56,78,12,46,76};
		
		//FOR per trovare i numeri pari tramite operatore % (modulo), poi divido per la VAR count che si incrementa di 1 ogni giro
		for (int i = 0; i < numeriReali.length; i++) {
			if (numeriReali[i] % 2 == 0) {
				numPari += numeriReali[i];
				count++;
				media = numPari / count;
			}
		}
		System.out.println(media);
	}

}
