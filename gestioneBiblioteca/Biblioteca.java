package gestioneBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Libro> libri = new ArrayList<Libro>();

	public Biblioteca() {
		this.libri = new ArrayList<Libro>();
	}

	public Biblioteca(List<Libro> libri) {
		super();
		this.libri = libri;
	}

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}

	public void addBook(Libro l) {
		try {
			List<Libro> libri = this.libri;
			libri.add(l);
			System.out.println("libro aggiunto alla libreria");
		} catch (Exception e) {
			System.out.println("libro non aggiunto");
		}

	}

	public void searchBookTitolo(String titolo) {
		Libro libro = new Libro();
		libro.setTitolo(titolo);
		boolean res = false;
		System.out.println("Avvio la ricerca per TITOLO: " + titolo);
		for (Libro l : this.libri) {
			if (l.getTitolo().equals(libro.getTitolo())) {
				System.out.println("libro trovato: " + l);
				res = true;
			}
		}
		if (!res) {
			System.out.println("libro NON trovato");
		}
	}

	public void searchBookAutore(String autore) {
		
		Libro libro = new Libro();
		libro.setAutore(autore);
		boolean res = false;
		System.out.println("Avvio la ricerca per AUTORE: " + autore);
		for (Libro l : this.libri) {
			if (l.getAutore().equals(libro.getAutore())) {
				System.out.println("libro trovato: " + l);
				res = true;
			}
		}
		if (!res) {
			System.out.println("libro NON trovato");
		}

		
	}

	public void allBooks() {
		int index = 1;
		if (!this.libri.isEmpty()) {
			for (Libro libro : this.libri) {
				System.out.print(index + " ");
				System.out.println(libro);
				index++;
			}
		} else
			System.out.println("Biblioteca vuota");
	}

}
