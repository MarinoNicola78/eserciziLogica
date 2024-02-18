/*Scrivere un programma Java per trovare tutte le coppie di elementi in un array
la cui somma è uguale a un numero specificato*/
package eserciziArray;

public class EsercizioArray1 {

    public static void checkArray(int[] numeri, int sommaToFoud) {
        for (int i = 0; i < numeri.length -1; i++) {
            for (int j = i + 1; j < numeri.length; j++) {
                if ((numeri[i] + numeri[j]) == sommaToFoud) {
                    System.out.println(numeri[i] + "+" + numeri[j] + " = " + sommaToFoud);
                }
            }
        }
    }

    public static void main(String[] args) {
        int sommaToFoud = 60;
        int[] numeri = {20, 30, 40, 50, 30};
        checkArray(numeri, sommaToFoud);
    }
}
