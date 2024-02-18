/*Scrivere un programma Java per rimuovere gli elementi duplicati di un dato array e restituire
la nuova lunghezza dell'array.*/
package eserciziArray;

import java.util.Arrays;
import java.util.List;

public class EsercizioArray {

    public static void removeDuplicati(int[] numeri){
        List<Integer> nuovoArray=  Arrays.stream(numeri)
                .distinct()
                .boxed()
                .toList();
        System.out.println(nuovoArray);

        int lunghezzaArray=  Arrays.stream(numeri)
                .distinct()
                .toArray()
                .length;
        System.out.println(lunghezzaArray);
    }

    public static void main(String[] args) {

        int [] numeri = {20, 20, 30, 40, 50, 50, 50};
        removeDuplicati(numeri);
    }
}
