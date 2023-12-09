/*L'obiettivo è calcolare la somma degli elementi in un array e 
 * restituire true se la somma è pari e false se è dispari.*/

package eserciziArray;

public class SommaPari {

	public static boolean isSommaPari(int[] array) {

		boolean res = false;
		int somma = 0;
		for (int i = 0; i < array.length; i++) {
			somma += array[i];
		}
		if (somma % 2 == 0) {
			System.out.print("la somma dei num array e pari, return: ");
			return res = true;

		} else
			System.out.print("la somma dei num array e dispari, return: ");

		return res;

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 1, 1, 3 };
		boolean res = isSommaPari(array);

		System.out.print(res);

	}

}
