package palindromo;

public class EsercizioPalindromo {
	
	

	public static void main(String[] args) {
		
		String frase = "nicola";
		String frase1 = "anna";
		Integer numero = 123456789;
		
		String fraseNumeroToPalindromo = numero.toString();
		
		System.out.println("frase / numero palindroma: ");
		for (int i = frase.length(); i > 0; i--) {
			
			
			System.out.print(frase.charAt(i-1));
			
		}
	}
}
