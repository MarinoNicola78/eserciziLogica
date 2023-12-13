/*Scrivi un programma che, dato un numero intero positivo, determini se è un numero perfetto. 
 * Un numero perfetto è un numero intero positivo che è uguale alla somma dei suoi divisori positivi (escludendo se stesso). 
 * Ad esempio, 28 è un numero perfetto perché i suoi divisori (1, 2, 4, 7, 14) sommano a 28.*/

package logicaNumeriPerfetti;

public class NumeroPerfettoChecker {

	public static void numeroPerfettoChecker(int n) {

		int divMax = n / 2;
		int div = 1;
		int divSum = 0;

		do {

			if (n % div == 0) {
				System.out.println(div);
				divSum += div;
			}
			div++;

		} while (div != divMax + 1);
		
		if (divSum == n) {
			System.out.println("num perfetto");
		} else {
			System.out.println("num NON perfetto");

		}

	}

	public static void main(String[] args) {

		numeroPerfettoChecker(4);
	}

}
