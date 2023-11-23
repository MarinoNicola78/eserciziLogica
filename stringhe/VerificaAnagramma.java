/*prende in input due stringhe e restituisce true se sono anagrammi, e false altrimenti. 
 * Due parole sono anagrammi se contengono le stesse lettere, indipendentemente dall'ordine.*/

package stringhe;

import java.util.Arrays;

public class VerificaAnagramma {

	public static String isAnagramma(String parola1, String parola2) {
		
		// trasformo la oarola in char[]
		
		char[] arrayParola1 =parola1.toCharArray();
		char[] arrayParola2 =parola2.toCharArray();
		
		char[] arrayParola1a = parola1.replaceAll("\\s", "").toCharArray();
		char[] arrayParola2a = parola2.replaceAll("\\s", "").toCharArray();

		Arrays.sort(arrayParola1);
		Arrays.sort(arrayParola2);
		
		Arrays.sort(arrayParola1a);
		Arrays.sort(arrayParola2a);
		
		System.out.println("parola1: " + Arrays.toString(arrayParola1));
		System.out.println("parola2: " + Arrays.toString(arrayParola2));
		
		System.out.println();
		
		System.out.println("parola1a: " + Arrays.toString(arrayParola1a));
		System.out.println("parola2a: " + Arrays.toString(arrayParola2a));
		
		
		if (Arrays.equals(arrayParola1, arrayParola2)) {
			 
			 return "le due parole sono anagrammi";
			
		}else

		return "le due parole NON sono anagrammi";
	}

	public static void main(String[] args) {

		String parola1 = "amor";
		String parola2 = "romi";

		String res = isAnagramma(parola1, parola2);
		System.out.println(res);
	}

}
