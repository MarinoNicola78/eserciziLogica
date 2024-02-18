package functional;

import java.util.List;

public class FunctionalStringProcessor1 {

    public static void main(String[] args) {

        List<String> listWords = List.of("Java", "python", "C++", "Ruby", "HTML", "CSS", "JavaScript")
                .stream()
                .filter(str -> str.length() == 3
                        && Character.isUpperCase(str.charAt(0))
                        && str.substring(1).equals(str.substring(1).toLowerCase()))
                .toList();
        System.out.println(listWords);
    }
}
