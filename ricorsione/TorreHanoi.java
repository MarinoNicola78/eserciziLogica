package ricorsione;

public class TorreHanoi {

	static void hanoi(int n, String start, String mezzo, String destinazione) {
		// caso base con un solo disco da spostare
		if (n == 1) {
			System.out.println(n + " da CB " + start + " --> " + destinazione);
		} else {
			hanoi(n-1, start, destinazione, mezzo);
			System.out.println(n + " da " + start + " --> " + destinazione);
			hanoi(n-1, mezzo, start, destinazione);
		}
		
	}

	public static void main(String[] args) {
		
		hanoi(3, "PalettoA", "PalettoB", "PalettoC");
	}
}
