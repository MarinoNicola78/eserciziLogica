package gestioneContatti;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RubricaTelefonica {

    private List<Contatto> rubrica = new ArrayList<>();

    public List<Contatto> getRubrica() {
        return rubrica;
    }

    public RubricaTelefonica() {
        this.rubrica = rubrica;
    }

    public void setRubrica(List<Contatto> rubrica) {
        this.rubrica = rubrica;
    }

    public void aggiungiContatto() {

        Scanner scNome = new Scanner(System.in);
        Scanner scCognome = new Scanner(System.in);
        Scanner scEta = new Scanner(System.in);
        Scanner scCategoria = new Scanner(System.in);
        Scanner scExit = new Scanner(System.in);
        String nomeToRubrica = "";
        String cognomeToRubrica = "";
        int etaToRubrica = 0;
        String categoriaoRubrica = "";

        Contatto contatto = new Contatto();

        int exit = 1;

        while (exit != 0) {

            try {
                System.out.println("immettere nome: ");
                nomeToRubrica = scNome.next();

                System.out.println("immettere cognome: ");
                cognomeToRubrica = scCognome.next();

                contatto.setEta(0);
                System.out.println("immettere eta: ");
                etaToRubrica = Integer.parseInt(scEta.next());

                System.out.println("immettere categoria: ");
                categoriaoRubrica = scCategoria.next();

                contatto = new Contatto(nomeToRubrica, cognomeToRubrica, etaToRubrica, Categorie.valueOf(categoriaoRubrica.toUpperCase()));
                this.rubrica.add(contatto);
            } catch (InputMismatchException e) {
                System.out.println("immessa ETA non valida!!");
                System.out.println("ETA default: 0 + CATEGORIA default: INDEFINITA, da moddificare!!");
                contatto.setEta(etaToRubrica);
                contatto = new Contatto(nomeToRubrica, cognomeToRubrica, contatto.getEta(), Categorie.INDEFINITA);
                this.rubrica.add(contatto);
            } catch (IllegalArgumentException e) {
                System.out.println("immessa CATEGORIA non valida!!");
                System.out.println("CATEGORIA default: INDEFINITA, da moddificare!!");
                contatto = new Contatto(nomeToRubrica, cognomeToRubrica, etaToRubrica, Categorie.INDEFINITA);
                this.rubrica.add(contatto);
            } finally {
                System.out.println("0 per uscire 1 per creare nuovo contatto:");
                exit = scExit.nextInt();
            }
        }
    }

    public void elencoContatti() {
        if (rubrica.isEmpty()) {
            System.out.println("rubrica vuota!!");
        } else
            System.out.println("Elenco Contatti Rubrica: ");
        this.rubrica.forEach(c -> System.out.println(c));
    }

    public List<Contatto> ricercaContatti() {
        Scanner scCognomeRicerca = new Scanner(System.in);
        System.out.println("Immattere il COGNOME da cercare nella rubrica:");
        String cognomeRicerca = scCognomeRicerca.next();
        System.out.println("inizio ricerca cognome.........");
        List<Contatto> contattoTrovato = this.rubrica
                .stream()
                .filter(c -> c.getCognome().equals(cognomeRicerca))
                .collect(Collectors.toList());

//        Contatto contatto = new Contatto();
//        contattoTrovato.forEach(c -> {
//            contatto.setNome(c.getNome());
//            contatto.setCognome(c.getCognome());
//            contatto.setEta(c.getEta());
//            contatto.setCategoria(c.getCategoria());
//        });

        if (!contattoTrovato.isEmpty()) {
            System.out.print("Contatto trovato:\n");
            contattoTrovato.forEach(c -> System.out.println(c));
        } else {
            System.out.println("Immettere un cognome valito o cognome inesistente");
        }
        return contattoTrovato;
    }

//    public void cancellaContatto() {
//        Scanner scCognomeEliminare = new Scanner(System.in);
//        Scanner scNomeEliminare = new Scanner(System.in);
//        System.out.println("Immattere il COGNOME da eliminare:");
//        String cognomeRicerca = scCognomeEliminare.next();
//        System.out.println("Immattere il NOME da eliminare:");
//        String nomeRicerca = scNomeEliminare.next();
//        this.rubrica.stream()
//                .filter(c -> c.getCognome().equals(cognomeRicerca) && c.getNome().equals(nomeRicerca))
//                .toList();
//
//        Contatto contattoDaEliminare = ricercaContatti(cognomeRicerca);
//        System.out.println(this.rubrica.remove(contattoDaEliminare));
//        System.out.println("cancellazione contatto eseguita");
//    }

//    public void modificaContatto() {
//        Scanner sModifica = new Scanner(System.in);
//        Scanner sContatto = new Scanner(System.in);
//
//        System.out.println("immettere il cognome del contatto da modificare: ");
//        String cognome = sContatto.next();
//        Contatto contatto = ricercaContatti(cognome);
//        System.out.println("cosa vuoi modificare: \n 1 nome \n 2 cognome \n 3 eta \n 4 categoria");
//        int scelta = sModifica.nextInt();
//
//
//        switch (scelta) {
//            case 1:
//                System.out.println("Immetere il nuovo NOME: ");
//                Scanner scNome = new Scanner(System.in);
//                String nomeTmp = scNome.next();
//                contatto.setNome(nomeTmp);
//                this.rubrica.add(contatto);
//                System.out.println(this.rubrica.stream().filter(c -> c.equals(contatto)).toList());
//                System.out.println("update nome fatto!!");
//                break;
//
//            case 2: {
//                System.out.println("Immetere il nuovo COGNOME: ");
//                Scanner scCognome = new Scanner(System.in);
//                String cognomeTmp = scCognome.next();
//                contatto.setCognome(cognomeTmp);
//                this.rubrica.add(contatto);
//                System.out.println(this.rubrica.stream().filter(c -> c.equals(contatto)).toList());
//                System.out.println("update COGNOME fatto!!");
//                break;
//            }
//            case 3: {
//                System.out.println("Immetere nuova ETA: ");
//                Scanner scEta = new Scanner(System.in);
//                Integer etaTmp = scEta.nextInt();
//                contatto.setEta(etaTmp);
//                this.rubrica.add(contatto);
//                System.out.println(this.rubrica.stream().filter(c -> c.equals(contatto)).toList());
//                System.out.println("update ETA fatto!!");
//                break;
//            }
//            case 4: {
//                try {
//                    System.out.println("Immetere nuova CATEGORIA tra LAVORO - FAMIGLIA - PALESTRA: ");
//                    Scanner scCategoria = new Scanner(System.in);
//                    String categoriaTmp = scCategoria.next();
//                    contatto.setCategoria(Categorie.valueOf(categoriaTmp.toUpperCase()));
//                    this.rubrica.add(contatto);
//                    System.out.println(this.rubrica.stream().filter(c -> c.equals(contatto)).toList());
//                    System.out.println("update CATEGORIA fatto!!");
//                } catch (IllegalArgumentException e) {
//                    System.out.println("immessa categoria non valida");
//                } finally {
//                    System.out.println("catedgoria default: INDEFINITA, da moddificare!!");
//                    contatto.setCategoria(Categorie.INDEFINITA);
//                }
//                break;
//            }
//            default:
//                System.out.println("Scegliere un opzione corretta!!");
//                break;
//        }
//    }
//
//    public void cancellaTotaleRubrica() {
//        this.rubrica.clear();
//    }
}
