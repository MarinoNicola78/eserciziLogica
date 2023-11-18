/*rovaMassimo(int[] array) che prende in input un array di interi e restituisce l'elemento massimo.
trovaMinimo(int[] array) che prende in input un array di interi e restituisce l'elemento minimo.
*/

package eserciziArray;

public class TrovaMinMaxArray {

	public static int trovaMassimo(int[] array) {
		int tmpMax = array[0];
		for (int i = 0; i < array.length; i++) {
			// logica per trovare il num Max
				if (tmpMax < array[i]) {
					tmpMax = array[i];
				
			}
		}
		return tmpMax;
	}
	
	public static int trovaMinimo(int[] array) {
		int tmpMin = array[0];
		for (int i = 0; i < array.length; i++) {
			// logica per trovare il num Max
				if (tmpMin > array[i]) {
					tmpMin = array[i];
				
			}
		}
		return tmpMin;
	}
	
	

	public static void main(String[] args) {
		
		int[] array = { 2, 6, 8, 3, 89, 4 };
		int Max = trovaMassimo(array);
		int Min = trovaMinimo(array);
		
		
		System.out.println("il numero Max è " + Max);
		System.out.println("il numero Max è " + Min);
	}

}
