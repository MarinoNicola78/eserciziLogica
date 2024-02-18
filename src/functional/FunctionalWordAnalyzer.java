/*
Scrivi una classe che, seguendo l'approccio della programmazione funzionale,
accetti una lista di parole (stringhe) e restituisca una mappa contenente la lunghezza di ciascuna parola
come chiave e quante volte quella lunghezza appare come valore.
*/
package functional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalWordAnalyzer {
    public static void main(String[] args) {

        //Map<Integer, Integer> wordsMap =
        Map<Integer, Long> wordsMap = List.of("uno", "due", "tre", "quattro")
                .stream()
                .collect(Collectors.groupingBy(str -> str.length(), Collectors.counting()));

        System.out.println(wordsMap);

    }
}
