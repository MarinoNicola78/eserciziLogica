/*
 * La classe GestoreLibreria dovrebbe simulare un sistema di gestione di una libreria.
 * Ogni libro nella libreria avrà un titolo, un'autore, un numero di pagine e un numero di copie disponibili.
 * La classe dovrebbe permettere di aggiungere nuovi libri alla libreria, prenotare o restituire una copia di un libro,
 * e ottenere informazioni sullo stato attuale della libreria (ad esempio, quanti libri sono disponibili di un
 * determinato titolo).*/

package javaLogicExercise.libreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private List<Libro> libreria = new ArrayList<>();

    public List<Libro> getLibreria() {
        return libreria;
    }

    public void setLibreria(List<Libro> libreria) {
        this.libreria = libreria;
    }

    public void aggiungiLibro(Libro libro) {
        setLibreria(new ArrayList<>(getLibreria()));
        getLibreria().add(libro);
        System.out.println("Nuovo Libro aggiunto alla Libreria");
    }

    public void getNumeroCopieDisponibili(List<Libro> libreria, String titolo) {
        Libro libro = new Libro();
        libro.setTitolo(titolo);
        libreria.forEach(l -> System.out.println(l.getTitolo().equals(libro.getTitolo())));
        System.out.println("nessuna co");
    }


}
