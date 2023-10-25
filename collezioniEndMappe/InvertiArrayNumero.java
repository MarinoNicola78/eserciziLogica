package collezioniEndMappe;

public class InvertiArrayNumero {

	public static void main(String[] args) {

		int[] numeri = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = numeri.length; i > 0; i--) {

			System.out.print(numeri[i-1] + ", ");

		}
		

	}

}
