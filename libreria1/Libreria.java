package libreria1;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

	private List<Libro> listLibri = new ArrayList<>();
	
	

	public void addBook(Libro libro) {
		this.listLibri.add(libro);
		System.out.println("libro aggiunto corretamente alla libreria");
		System.out.println("la nuova disponibilita della libreria e: " + listLibri.size());
	}

	public void removoBook(Libro libro) {
		this.listLibri.remove(libro);
		System.out.println("libro rimosso corretamente alla libreria");
		System.out.println("la nuova disponibilita della libreria e: " + listLibri.size());
	}

	public void getLibri() {
		System.out.println("la libreria contiene i seguemnti libri: \n");

		for (int i = 0; i < this.listLibri.size(); i++) {
			System.out.println(this.listLibri.get(i));
		}
	}

	public List<Libro> getListLibri() {
		return listLibri;
	}

	public void setListLibri(List<Libro> listLibri) {
		this.listLibri = listLibri;
	}
}
