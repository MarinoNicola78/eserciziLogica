//esercizi pdf "esercizi1" traccia 2.3

package Cicli;

import java.util.Scanner;

public class PositivoNegativo {
	public static void main(String[] args) {
		
		//VAR
		
		boolean compliance = false;
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("immetere un numero(0 to EXIT):\n");
		int num = sc.nextInt(); 
		
		//Ciclo Do-While
		while (num != 0) {
			int prec = num;
			System.out.print("immetere un altro numero:\n");
			num = sc.nextInt();
			if(prec>0 && num<0) compliance = true;
		}
		if (compliance) {
			System.out.println("Compliance");
		} else {
			System.out.println("EXIT: not comppliance");
		}
		
	}
	
	
}
