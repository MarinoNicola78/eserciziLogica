package gestioneBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		//creati con la libreria
		Libro libro1 = new Libro("i sette nani","pippo pallo", 1984);
		Libro libro2 = new Libro("goal del calcio","antonio rossi", 2020);
		Libro libro3 = new Libro("la programmazione","nicola marino", 2022);
		//aggiunto successivamente
		Libro libro4 = new Libro("il meteo","mario rossi", 1968);
		
		List<Libro> listaLibri = new ArrayList<>();
		
		listaLibri.add(libro1);
		listaLibri.add(libro2);
		listaLibri.add(libro3);
		
		Biblioteca biblioteca = new Biblioteca(listaLibri);
		
		biblioteca.addBook(libro4);
		
		System.out.println("############");
	
		biblioteca.allBooks();
		
		System.out.println("############");
		biblioteca.searchBookTitolo("goal del calcio");
		System.out.println("############");
		biblioteca.searchBookAutore("mario rossi");
		
		

	}

}
