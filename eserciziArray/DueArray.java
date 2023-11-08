/*Dati due array da input (dimensione a scelta dell’utente) visualizza un
terzo array formato dagli elementi in comune ai due array.
*/

package eserciziArray;

public class DueArray {

	public static void main(String[] args) {

		int[] arrayNum1 = { 45, 40, 23, 2, 6};
		int[] arrayNum2 = { 6, 1, 40, 98,4,45};

		int tmp = 0;
		int count = 0;

		for (int i = 0; i < arrayNum1.length; i++) {
			for (int j = 0; j < arrayNum2.length; j++) {
				if (arrayNum1[i] == arrayNum2[j]) {
					tmp = arrayNum1[i];
					count++;
				}
			}
		}

		int[] arrayNum3 = new int[count];
		tmp = arrayNum1[0];
		count = 0;
		for (int i = 0; i < arrayNum1.length; i++) {
			for (int j = 0; j < arrayNum2.length; j++) {
				if (arrayNum1[i] == arrayNum2[j]) {
					arrayNum3[count] = arrayNum1[i];
					count ++;
				} 
			}
		}
		for (int numUguali : arrayNum3) {
			System.out.println("numeri uguale: " + numUguali);
		}
	}

}
