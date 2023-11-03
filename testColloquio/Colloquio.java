package testColloquio;

import java.util.Arrays;

public class Colloquio {

	// metodo per rimuovere i duplicati, sara richiamato nel MAIN
	public static void rimuoviDuplicato(int a[], int n) { // parametri da passare al metodo
		int j = 0;
		Arrays.sort(a); // metodo .sort, mi ordina array prima di passare nel FOR
		System.out.println("nuovo array ordinato e senza doppioni: ");

		// ciclo FOR per scorrere tutto array ed eliminare i doppiani
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];

			}
		}

		// aggiungo ultima posizione altrimenti non stampa ultimo numero del Array
		a[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {

		// inizializzo le mie variabili
		int[] arrayTest = { 5, 2, 3, 27, 5, 9, 5, 3, 58, 90, 90, 2, 1, 34, 78 };
		int n = arrayTest.length;

		// richiamo il metodo e gli passo gli argomenti
		rimuoviDuplicato(arrayTest, n);

	}
}
