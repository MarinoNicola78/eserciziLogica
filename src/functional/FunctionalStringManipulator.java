package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalStringManipulator {

    public static void main(String[] args) {

        List<String> listWord = Arrays.asList("nicola", "pippo", "casa", "macchina", "tavolo")
                .stream()
                .map(str -> str.toUpperCase())
                .map(str -> "WORD_" + str)
                .collect(Collectors.toList());
        System.out.println(listWord);

    }
}
