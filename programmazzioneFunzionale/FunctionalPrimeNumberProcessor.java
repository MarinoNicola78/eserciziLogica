package programmazzioneFunzionale;
import java.util.Arrays;
import java.util.List;

public class FunctionalPrimeNumberProcessor {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        /*
         ciclo FOR di supporto per trovare il numero primo
         condizione limite Math.sqrt(n) per ottimizzare il ciclo
        */
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 49, 3, 6, 8, 11, 13, 1, 7, 13, 20, 49, 19, 3, 2)
                .stream()
                .sorted()
                .distinct()
                .filter(n -> isPrime(n))
                .toList();

        System.out.println(list);


    }
}
