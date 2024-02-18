package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalNumberProcessor {

    public static void main(String[] args) {

        List<Long> listNum = Arrays.asList(4, 5, -7, 8, -2, -9, 10, 3)
                .stream()
                .mapToLong(n -> {
                    if (n > 0) {
                        return (long) Math.pow(n, 2);
                    } else {
                        return (long) Math.pow(n, 3);
                    }
                })
                .boxed()// trasforma in Oggetto input, da primitivo a Oggetto (ed: long -> Long)
                .collect(Collectors.toList());
        System.out.println(listNum);

    }
}
