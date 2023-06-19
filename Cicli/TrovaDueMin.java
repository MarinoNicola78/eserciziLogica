/*Scrivere una classe java che contenga al suo interno un metodo main,
nel quale si chiede all'utente di inserire
un vettore di numeri reali V e si calcolano il valore minimo e 
il secondo minimo, stampandoli sullo schermo.
*/

package Cicli;

public class TrovaDueMin {

	public static void main(String[] args) {
		
		//VAR usate
		int indexPrimoMin;
		int indexSecondoMin = 0;
		
		//creato e popolato subito il mio Array di tipo int chimato numeriReali 
		int[] numeriReali = {4,3,69,2,55,22,45,56,78,12,46,76};
		
		indexPrimoMin = numeriReali[0];
		
		//primo FOR trovo il primo MIN
		for (int i = 0; i < numeriReali.length; i++) {
			if (indexPrimoMin > numeriReali[i]) {
				indexPrimoMin = numeriReali[i];
			}		
		}
		//secondo FOR serve per inizializzare la VAR indexSecondoMin altrinenti vale 0
		for (int i = 0; i < numeriReali.length; i++) { 
			if (indexSecondoMin < numeriReali[i]) {
						indexSecondoMin = numeriReali[i];
					}
				}
		//terzo FOR serve per trovare il secondo numero MIN 
		//tramite IF trovo quando indexSecondoMin è piu piccolo di indexPrimoMin e contemporaneamente diverso da lui 
		for (int i = 0; i < numeriReali.length; i++) {
			if (indexSecondoMin > numeriReali[i] && numeriReali[i] != indexPrimoMin) {
				indexSecondoMin = numeriReali[i];									  	
			} 
		}
		System.out.println("primo minimo trovato del nostro Array numeriReali: " + indexPrimoMin + " secondo minimo trovato del nostro Array numeriReali : " + indexSecondoMin);

	}

}









