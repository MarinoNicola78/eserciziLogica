package functional;

import java.util.Arrays;
import java.util.List;

public class FunctionalWordLengthProcessor {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList("nicola", "federica", "albero", "case", "pianta")
                .stream()
                .filter(str -> str.contains("e"))
                .map(String::length)
                .toList();

        System.out.println(list);
    }
}
