package classi.contocorrente;

import java.util.Scanner;

public class ContoCorrenteTest {

	public static void main(String[] args) {

		ContoCorrente contoCorrente = new ContoCorrente(5000);

		Scanner scVersamento = new Scanner(System.in);
		Scanner scPrelievo = new Scanner(System.in);
		Scanner scScelta = new Scanner(System.in);

		System.out.println("BENVENUTO NELLA BANCA NICOLA");

		int scelta = -1;
		int versamento = 0;
		int prelievo = 0;

		while (scelta != 9) {

			System.out.println("MENU OPERAZIONI: ");
			System.out.println("##########################################");
			System.out.println("1 - Versamento");
			System.out.println("2 - Prelievo");
			System.out.println("3 - Lista Movimenti");
			System.out.println("4 - Saldo");
			System.out.println("9 - Termina programma");
			System.out.println("##########################################");
			scelta = scScelta.nextInt();

			switch (scelta) {
			case 1: {
				System.out.println("inserire la somma da versare: ");
				versamento = scVersamento.nextInt();
				contoCorrente.versamento(versamento);
			}
				break;
			case 2: {
				System.out.println("inserire la somma da prelevare: ");
				prelievo = scPrelievo.nextInt();
				contoCorrente.prelievo(prelievo);
			}
				break;
			case 3: {
				System.out.println("Lista ultimi 5 movimenti: ");
				System.out.println("##########################################");
				contoCorrente.listaMovimenti();
				System.out.println("##########################################");
				System.out.println("premere enter to continue..........");
				Scanner scInvio = new Scanner(System.in);
				String invio = "";
				invio = scInvio.nextLine();
			}
				break;
			case 4: {
				System.out.println("Saldo presente sul conto: " + contoCorrente.getSaldo());
				System.out.println("##########################################");
				System.out.println("premere enter to continue..........");
				Scanner scInvio = new Scanner(System.in);
				String invio = "";
				invio = scInvio.nextLine();
			}
				break;

			}

		}

	}

}
