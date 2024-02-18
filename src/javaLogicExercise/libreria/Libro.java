package javaLogicExercise.libreria;

public class Libro {

    private String titolo, autore;

    private int numeroPagine, numeroCopieCisponibili;


    public Libro() {
    }

    public Libro(String titolo, String autore, int numeroPagine, int numeroCopieCisponibili) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
        this.numeroCopieCisponibili = numeroCopieCisponibili;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public int getNumeroCopieCisponibili() {
        return numeroCopieCisponibili;
    }

    public void setNumeroCopieCisponibili(int numeroCopieCisponibili) {
        this.numeroCopieCisponibili = numeroCopieCisponibili;
    }

    public void prenotaLibro(Libro libro) {
        if (numeroCopieCisponibili > 0) {
            numeroCopieCisponibili--;
            System.out.println("Libro prenotato correttamente");
        } else
            System.out.println("Libro non disponibile per la prenotazione");
    }

    public void restituisciLibro() {
        numeroCopieCisponibili++;
        System.out.println("Libro restituito correttamente");
    }
}
