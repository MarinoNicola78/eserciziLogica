package lamba;

import java.util.Arrays;

import java.util.List;

public class SommaQuadrati {

	// prende in input una lista di numeri interi e restituisce la somma dei
	// quadrati di questi numeri.
	public static void calcolaSommaQuadrati(List<Integer> numeri) {
	
		System.out.println("Stampo il quadrono di ogni numero: ");
		numeri.forEach((numero) -> {
			int quad = (numero * numero);
			System.out.print(" " + quad);
		});
	}

	public static void main(String[] args) {

		List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		calcolaSommaQuadrati(numeri);
	}
}
