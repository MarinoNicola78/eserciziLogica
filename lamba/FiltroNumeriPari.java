package lamba;

import java.util.Arrays;
import java.util.List;

public class FiltroNumeriPari {

	// prende in input una lista di numeri interi e stampa a console solo i numeri
	// pari.
	public static void filtraEStampaPari(List<Integer> numeri) {

		numeri.forEach((numero) -> {
			if (numero % 2 == 0) {
				System.out.print(" " + numero);
			}
		});

	}

	public static void main(String[] args) {

		List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		filtraEStampaPari(numeri);
	}

}
