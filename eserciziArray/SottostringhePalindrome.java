/*Scrivi un programma Java che trovi e stampi tutte le sottostringhe 
 * palindrome di una stringa data. 
 * Una sottostringa è una sequenza di caratteri consecutivi, 
 * e una parola palindrome è una parola che si legge allo stesso modo i
 * n entrambi i sensi (es. "radar", "level").*/

package eserciziArray;

public class SottostringhePalindrome {
//
//	public static void main(String[] args) {
//		
//		String input = "radar";
//        System.out.println("Stringa originale: " + input);
//        System.out.println("Sottostringhe palindrome:");
//        for (int i = 0; i < input.length(); i++) {
//        	for (int j = i+1; j < input.length(); j++) {
//    			if (input.charAt(i) == input.charAt(j) ) {
//					System.out.println(input.charAt(i) + " = " + input.charAt(j));
//				}
//    		}
//		}
//	}
	
	
	    public static void main(String[] args) {
	        String input = "radar";

	        System.out.println("Stringa originale: " + input);

	        trovaEStampaSottostringhePalindrome(input);
	    }

	    public static void trovaEStampaSottostringhePalindrome(String input) {
	        System.out.println("Sottostringhe palindrome:");

	        for (int i = 0; i < input.length(); i++) {
	            for (int j = i + 1; j <= input.length(); j++) {
	                String sottostringa = input.substring(i, j);
	                if (isPalindrome(sottostringa)) {
	                    System.out.println(sottostringa);
	                }
	            }
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }

	        return true;
	    }
	}

	
	
	
	
	
	
	
	
	
	


