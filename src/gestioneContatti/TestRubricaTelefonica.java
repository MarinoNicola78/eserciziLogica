package gestioneContatti;

import java.util.Scanner;

public class TestRubricaTelefonica {

    public static void main(String[] args) {

        Scanner scScelta = new Scanner(System.in);

        RubricaTelefonica rubrica = new RubricaTelefonica();

        int exitWhile = 1;

        while (exitWhile != 0) {

            System.out.println("MENU RUBRICA - SCEGLI OPZIONE:\n1)Aggiungi Contatti \n2)Visualizza tutti Contatti \n" +
                    "3)Ricerca Contatti \n4)Rimozione Contatti \n5)Modifica Contatti");

            int scelta = scScelta.nextInt();

            switch (scelta) {
                case 1: {
                    rubrica.aggiungiContatto();
                    break;
                }
                case 2: {
                    rubrica.elencoContatti();
                    break;
                }
                case 3: {
                    rubrica.ricercaContatti();
                    break;
                }
                case 4: {
//                    rubrica.cancellaContatto();
                    break;
                }

                case 5: {
//                    rubrica.modificaContatto();
                    break;
                }

            }
            Scanner scExitWhile = new Scanner(System.in);
            System.out.println("0 per uscire 1 per tornare al MENU:");
            exitWhile = scExitWhile.nextInt();

        }
    }
}
