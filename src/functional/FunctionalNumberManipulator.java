package functional;/*
Scrivi una classe che, seguendo l'approccio della programmazione funzionale,
accetti una lista di numeri interi e restituisca una nuova lista contenente
i numeri incrementati del doppio se sono pari e decrementati del triplo se sono dispari.
 */

import java.util.List;

public class FunctionalNumberManipulator {
    public static void main(String[] args) {

        List<Long> listNum = List.of(55, 5, 25, 60, 60, 40, 15, 70, 45)
                .stream()
                .distinct()
                .mapToLong(n -> {
                    if (n % 2 == 0) {
                        return n += n * 2;
                    }
                    return n -= n * 3;
                })
                .boxed()
                .toList();

        System.out.println(listNum);

    }
}
