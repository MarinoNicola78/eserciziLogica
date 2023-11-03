package agendaTelefonica;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int scelta = 0;
		System.out.println("dimensionare la Rubrica telefonica, immetere un numero > 0: ");
		Scanner scDim = new Scanner(System.in);
		int dim = scDim.nextInt();
		AgendaTelefonica agendaTelefonica = new AgendaTelefonica(dim);

		while(scelta !=4) {
		System.out.println("scegliore un opzione dal MENU: ");
		System.out.println();
		System.out.println("1. Inserimento di una nuova utenza nell’agenda");
		System.out.println("2. Ricerca di una nuova utenza nell’agenda");
		System.out.println("3. Visualizzazione di tutte le utenze dell’agenda sullo standard output");
		System.out.println("4. Uscita dal menù");

		Scanner scScelta = new Scanner(System.in);
		scelta = scScelta.nextInt();

		
			switch (scelta) {
			
			case 1: {
				System.out.println("inserire il nome: ");
				Scanner scNome = new Scanner(System.in);
				String nome = scNome.next();

				System.out.println("inserire il cognome: ");
				Scanner scCognome = new Scanner(System.in);
				String cognome = scCognome.next();

				System.out.println("inserire il numero di telefono: ");
				Scanner scNumTel = new Scanner(System.in);
				String numTel = scNumTel.next();

				if (agendaTelefonica.inserisci(nome, cognome, numTel)) {
					System.out.println("UTENZA INSERITA");
				} else
					System.out.println("AGENDA PIENA");
				break;

			}

			case 2: {
				System.out.println("inserire il nome: ");
				Scanner scNome = new Scanner(System.in);
				String nome = scNome.next();

				System.out.println("inserire il cognome: ");
				Scanner scCognome = new Scanner(System.in);
				String cognome = scCognome.next();

				if (agendaTelefonica.trova(nome, cognome) != null) {
					System.out.print("numero trovaro: ");
					System.out.println(agendaTelefonica.trova(nome, cognome));
				} else
					System.out.println("numero NON trovaro");
				break;
			}
			case 3: {
				System.out.println("lista utenze: ");
				agendaTelefonica.listaUtenze();
				break;
			}

			}
		}
		}

	}


