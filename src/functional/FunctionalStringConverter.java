package functional;

import java.util.List;

/*Scrivi una classe che, seguendo l'approccio della programmazione funzionale,
accetti una lista di stringhe e restituisca una nuova lista contenente le stringhe trasformate
secondo la seguente regola: aggiungere "!" alla fine di ogni stringa.
*/
public class FunctionalStringConverter {
    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "orange", "grape", "kiwi", "mango")
                .stream()
                .map(str -> str + "!")
                .toList();
        System.out.println(words);


    }
}
