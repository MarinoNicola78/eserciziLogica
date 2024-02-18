/*La classe CifreRipetute si occupa di analizzare un numero intero alla ricerca di cifre ripetute.
Il suo compito è fornire metodi per inserire un numero, identificare se ci sono cifre che si ripetono e, eventualmente,
restituire un elenco delle cifre ripetute. Può anche includere un metodo per contare quante volte ciascuna cifra si ripete.
La classe dovrebbe essere progettata per essere flessibile e trattare sia numeri positivi che negativi.
*
* */

package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class VerificaPresenzaNumeroLambda {

    public static void verificaPresenzaNumero1(List<Integer> numList, Predicate<Integer> condizione) {

        List<Integer> listafilter = numList.stream()
                .filter(condizione)
                .toList();

        System.out.println("lista filtrata per condizione: ");
        System.out.println(listafilter);
    }

    public static void verificaPresenzaNumero(List<Integer> numList, Integer numero, Predicate<Integer> condizione1, Predicate<Integer> condizione2) {

        boolean res1 = numList
                .stream()
                .anyMatch(condizione1.and(condizione2.or(n -> n == numero)));

        System.out.println("risultato: " + res1);

//        boolean res2 = numList
//                .stream()
//                .anyMatch(condizione.or(n -> n == numero));
//
//        System.out.println("risultato con OR: " + res2);
    }

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Predicate<Integer> condizione1 = n -> n > 0;
        Predicate<Integer> condizione2 = n -> n % 2 == 0;


        System.out.println("immetere un numero da esaminare: ");
        int numero = sc1.nextInt();
        List<Integer> numList = new ArrayList<>(List.of(2, 5, -6, 3, 2, 1, -43));

        verificaPresenzaNumero(numList, numero, condizione1, condizione2);
//        verificaPresenzaNumero1(numList, condizionePositivo);

    }
}
