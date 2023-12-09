/*esercizio che coinvolge la verifica se una stringa è un palindromo o meno.*/

package verificaStringhe;

import java.util.Scanner;

public class VerificaPalindromo {
	
	
	public static void verificaPalindromo(String str) {
		
		char[] array = str.toCharArray();
		String strInv= ""; 
		for (int i = array.length -1 ; i >= 0; i--) {
			strInv += array[i];
		}
		
		if(str.equals(strInv)) {
			System.out.println("palindromo");
		}
		else System.out.println("non palindromo");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserire una stringa da veificare: ");
		
		String str = sc.next();
		
		verificaPalindromo(str);
		
	}

}
