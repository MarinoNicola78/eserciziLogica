/*prende in input una stringa e restituisce true se la parola è un isogramma,
 *  e false altrimenti. Un isogramma è una parola in cui non ci sono lettere ripetute.*/

package stringhe;

import java.util.Arrays;

public class VerificaIsogramma {

	public static String isIsogramma(String parola) {
		
		char[] array = parola.toCharArray();
		Arrays.sort(array);
		
		int count = 0;
		char chTmp = array[0];
		for (int i = 0; i < array.length-1; i++) {
			
				if(array[i] == array[i+1]) {
					chTmp = array[i+1];
					System.out.println("chTmp: " + chTmp);
					count ++;
				}
		}
		if (count == 0) {
			return "parola isogramma";
		}
		
		return "parola NON isogramma";
	}

	public static void main(String[] args) {

		String parola = "nlicola";

		System.out.println(isIsogramma(parola));
	}

}
