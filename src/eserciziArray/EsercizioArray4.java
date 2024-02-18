/*Scrivete un programma Java per trovare il più piccolo e il secondo più piccolo
elemento di un dato array.*/
package eserciziArray;

import java.util.Arrays;

public class EsercizioArray4 {

    // approccio imperativo
    public static void method1(int[] numeri) {
        int minimo = Integer.MAX_VALUE;
        int secondoMinimo = Integer.MAX_VALUE;

        for (int numero : numeri) {
            if (numero < minimo) {
                // Se trovo un nuovo minimo, aggiorno anche il secondo minimo
                secondoMinimo = minimo;
                minimo = numero;
            } else if (numero < secondoMinimo && numero != minimo) {
                // Aggiorno solo il secondo minimo se trovo un valore diverso dal minimo
                secondoMinimo = numero;
            }
        }

        System.out.println("primo minimo approccio imperativo: " + minimo);
        System.out.println("secondop minimo approccio imperativo: " + secondoMinimo);
        System.out.println();
    }

    public static void methid2(int[] numeri) {
        int minimo = Integer.MAX_VALUE;
        int secondoMinimo = Integer.MAX_VALUE;

        minimo = Arrays.stream(numeri)
                .min().getAsInt();

        int finalMinimo = minimo;
        secondoMinimo = Arrays.stream(Arrays.stream(numeri)
                        .filter(n -> n != finalMinimo)
                        .toArray())
                .min().getAsInt();
        System.out.println("primo minimo approccio funzionale: " + minimo);
        System.out.println("primo minimo approccio funzionale: " + secondoMinimo);


    }

    public static void main(String[] args) {
        int[] numeri = {2, 11, 12, 3, 22, 24, 2};
        method1(numeri);

        methid2(numeri);
    }
}
