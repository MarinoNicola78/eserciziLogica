//esercizi pdf "esercizi1" traccia 5.1

package collezioniEndMappe;

public class StampaZigZag {

	public static void main(String[] args) {

		int[] stampaNum = { 2, 5, 6, 8, 12, 45, 23, 89, 1, 10 };

		for (int i = 0; i < stampaNum.length; i++) {
			int j = 9 - i;
			System.out.println(stampaNum[i]);
			System.out.println(stampaNum[j]);

		}

	}

}
