/*Descrizione: Crea una classe Java che contiene un metodo per trovare
una sequenza specifica all'interno di un array di numeri interi. Ad esempio,
l'array potrebbe essere [1, 2, 3, 4, 5, 6, 7] e la sequenza da trovare potrebbe essere [3, 4, 5].
Il metodo dovrebbe restituire true se la sequenza è presente nell'array e false altrimenti.
* */

package javaLogicExercise;

public class TrovaSequenza {

    public static void main(String[] args) {
        int[] numsToCheck = {4, 5, 6};
        trovaSequenza(numsToCheck);
    }

    public static void trovaSequenza(int[] numsToCheck) {
        int[] numsList = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int i = 0; i < numsList.length; i++) {
            for (int j = 0; j < numsToCheck.length; j++) {
                if (numsList[i] == numsToCheck[j]) {
                    System.out.println(numsToCheck[j]);

                }
            }
        }
    }
}
