/*Scrivere un programma che sposta in avanti il numero in un array di interi.
L’ultimo numero prende la posizione 0*/
package eserciziArray;

import java.util.Arrays;

public class EsercizioArray3 {

    public static void method1(int[] numeri) {
        int numeroUltimaPozione = numeri[numeri.length - 1];
        int index = 1;
        System.out.print("array prima del metodo: ");
        Arrays.stream(numeri).forEach(n -> System.out.print(n));
        System.out.println("");

        for (int i = numeri.length - 1; i >= 1; i--) {
            numeri[i] = numeri[i - 1];

        }
        System.out.print("array dopo del metodo: ");
        numeri[0] = numeroUltimaPozione;
        Arrays.stream(numeri)
                .forEach(n -> System.out.print(n));
    }

    public static void main(String[] args) {

        int[] numeri = {1, 2, 3, 4};
        method1(numeri);
    }
}
