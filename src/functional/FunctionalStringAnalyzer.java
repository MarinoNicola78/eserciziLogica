package functional;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalStringAnalyzer {

    public static void main(String[] args) {


        Map<Character, Long> coutLetters = List.of("Nicola big", "macchina rossa nera", "fede topa")
                .stream()
                .flatMap((str -> str.chars()
                        .filter(c -> !Character.isWhitespace(c))
                        .mapToObj(c -> (char) c)))
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(coutLetters);
    }
}
