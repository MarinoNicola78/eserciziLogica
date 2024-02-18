/*
* Scrivi una classe che, seguendo l'approccio della programmazione funzionale,
* accetti una lista di numeri interi e restituisca una nuova lista contenente solo i numeri dispari,
* elevati al quadrato, e solo se sono maggiori di 5.
*/
package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalListProcessor {

    public static void main(String[] args) {

       List<Integer> nums = Arrays.asList(7, 8, 3)
                .stream()
                .filter(n -> n > 5)
                .map( n -> {
                    if(n % 2 !=0){
                        return (int) Math.pow(n,2);
                    }
                    return 0;
                } )
                .collect(Collectors.toList());

        System.out.println(nums);
    }
}
