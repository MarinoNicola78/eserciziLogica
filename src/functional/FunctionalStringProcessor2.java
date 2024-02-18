package functional;

import java.util.List;

/*Scrivi una classe che, seguendo l'approccio della programmazione funzionale,
accetti una lista di stringhe e restituisca una nuova lista contenente solo le stringhe
che contengono la lettera 'a' e hanno una lunghezza inferiore a 5 caratteri.
*/
public class FunctionalStringProcessor2 {

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "orange", "grape", "kiwi", "mango", "mela")
                .stream()
                .filter(str -> str.contains("a") && str.length() < 5)
                .toList();
        System.out.println(words);

    }


}
