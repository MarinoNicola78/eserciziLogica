package collezioniEndMappe;

public class Trinagolo {

	public static void main(String[] args) {
		
		
		int[] righa = {1,2,3,4,5,6,7,8,9,10};
		//int[] colonna = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < righa.length; i++) { // numero righe
			
			
			for (int j = 0; j <= i; j++) // numero colonne
				
				System.out.print(righa[j]); // stampa la righa
				System.out.println(); // a capo per iniziare altra righa
			
		}

	}
}
