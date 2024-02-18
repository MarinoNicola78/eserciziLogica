package streamEsercizio;

import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // filtra e stampa solo le stringhe che finiscono solo per numero, voglio solo la prima dispinibile
        Stream.of("alfa", "c1", "kappa", "c2")
                .filter(s -> Character.isDigit(s.charAt(s.length() - 1)))
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("------------");
        // filtra e stampa solo le stringhe che iniziano per "a"
        Stream.of("a1", "a3", "a2", "a8", "a5", "b", "c")
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase) // metodo intermedio
                .sorted() // statefull perche deve conoscere tutto il flusso iniziale. Influisce sulle prestazioni
                .forEach(System.out::println); // metodo terminale

        System.out.println("------------");

        // TODO esercizio da fare
        Stream.of("alfa", "c1", "kappa")
                .filter(s -> Character.isDigit(s.charAt(s.length() - 1)));



    }
}
