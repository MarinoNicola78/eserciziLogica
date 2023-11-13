package ricorsione;

public class ReverseNumber {

	// conto alla rovescia
	public static void reverse1(int n) {
		// condizione di Stop, evita il loop infinito
		if (n == 1) {
			System.out.println(n);
		} else {
			System.out.println(n);
			reverse1(n - 1);
		}
	}

	// conto da n a k
	public static void reverse2int(int n, int k) {
		// condizione di Stop, evita il loop infinito
		if (n == k) {
			System.out.println(n);
		} else {
			System.out.println(n);
			reverse2int(n + 1, k);
		}
	}

	public static void main(String[] args) {

		//reverse1(10);
		reverse2int(0, 10);

	}

}
