//trova il numero maggiore
package eserciziArray;

public class MaxNumArray {

	public static void main(String[] args) {

		int[] numeri = { 1, -56, 1000, 3, 10 };
		int tmp = numeri[0];

		for (int i = 0; i < numeri.length - 1; i++) {
			// secambio il verso della condizione trovo il piu piccolo
			if (tmp < numeri[i + 1]) {
				tmp = numeri[i + 1];
			}

		}
		System.out.println("il numero maggiore del Array e: " + tmp);
	}
}
