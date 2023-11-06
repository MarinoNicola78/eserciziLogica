package libreria;

public class Test {

	public static void main(String[] args) {

		Libro libro1 = new Libro("bodybuilding", "nicola", 45);
		Libro libro2 = new Libro("ciclismo", "fede", 110);
		Libro libro3 = new Libro("calcio", "fabio", 39);
		Libro libro4 = new Libro("sci", "fede", 90);
		Libro libro5 = new Libro("cinofilo", "nicola", 120);

		Libro[] libri = { libro1, libro2, libro3, libro4, libro5 };

		Libreria libreria = new Libreria(libri);

		int res = libreria.trovaLibro("fede", 100);
		String[] resTitoli = libreria.getTitoli("fabio");

		System.out.println("numeri di libri trovati: " + res);
		System.out.println("################################");

		for (String titolo : resTitoli) {
			System.out.println("titoli scritti dall'autore come arg: " + titolo);
		}

	}

}
