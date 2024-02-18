/* Scrivere un programma Java per rimuovere un elemento specifico da un array.*/

package eserciziArray;

import java.util.Arrays;

public class EsercizioArray2 {

    public static void method1(int[] numeri, int numeroRemove) {

        int index = 0;
        int[] nuovoArray = new int[numeri.length - 1];

        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] != numeroRemove) {
                nuovoArray[index] = numeri[i];
                index++;
            }
        }
        System.out.print("method1: ");
        Arrays.stream(nuovoArray).forEach(n -> System.out.print(n  + " "));
    }

    public static void method2 (int[] numeri, int numeroRemove){

        int [] nuovoArray = Arrays.stream(numeri)
                .filter( n -> n != numeroRemove)
                .toArray();
        System.out.print("method2: ");
        Arrays.stream(nuovoArray).forEach(n -> System.out.print(n + " "));
    }

    public static void main(String[] args) {
        int numeroRemove = 20;
        int [] numeri = {20, 30, 40, 50, 30};

        method1(numeri,numeroRemove);
        System.out.println();
        method2(numeri,numeroRemove);
    }
}
