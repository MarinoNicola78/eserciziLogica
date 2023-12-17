package programmazzioneFunzionale;
import java.util.Arrays;
import java.util.List;

public class FunctionalStringProcessor {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("anna", "casa", "nicola", "amore", "azzo")
                .stream()
                .filter(str -> str.startsWith("a") && str.length() == 4)
                .map(String::toUpperCase)
                .toList();
        System.out.println(list);
    }

}
