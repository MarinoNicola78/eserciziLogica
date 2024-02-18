package functional;

import java.util.Arrays;

public class FunctionalSumCalculator {

    public static void main(String[] args) {

        /* popolo array, lo strimmo, lo filtro e riduco il tutto */
        int num = Arrays.asList(1, 4, 8, 19).stream().filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(num);
    }


}


