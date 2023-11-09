package libreria1;

public class LibroTest {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("ioRobot","NicolaMarino", 2023, 89 );
		Libro libro2 = new Libro("gatto con gli stivali","FedeMicheletti", 2020, 90 );
		Libro libro3 = new Libro("il cane","FedeMicheletti", 2023, 190 );
		Libro libro4 = new Libro("il bodybuilding","NicolaMarino", 2000, 200 );
		Libro libro5 = new Libro("il calcio","FebioMarino", 2021, 20 );
		
		
		Libreria libreria = new Libreria();
		
		libreria.addBook(libro1);
		libreria.addBook(libro2);
		libreria.addBook(libro3);
		libreria.addBook(libro4);
		libreria.addBook(libro5);
		
		libreria.getLibri();
		
		libreria.removoBook(libro5);
		libreria.removoBook(libro1);
		
		libreria.getLibri();

	}

}
