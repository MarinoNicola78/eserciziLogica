/*
 * Scrivi una classe che, seguendo l'approccio della programmazione funzionale,
 * accetti una lista di stringhe e restituisca la somma delle lunghezze delle stringhe che
 * iniziano con la lettera 'a' e contengono la lettera 'e'.
 * */
package functional;

import java.util.List;

public class FunctionalStringLengthAnalyzer {

    public static void main(String[] args) {

        Integer words = List.of("elefante", "macchina", "al", "topo", "ali")
                .stream()
                .filter(str -> str.startsWith("a"))
                .mapToInt(str -> str.length())
                .sum();

        System.out.println(words);

    }
}
