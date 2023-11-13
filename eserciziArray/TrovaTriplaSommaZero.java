package eserciziArray;

import java.util.*;

public class TrovaTriplaSommaZero {
    public static void main(String[] args) {
        int[] array = {0, -1, 2, -3, 1};

        System.out.println("Array originale: " + Arrays.toString(array));

        trovaTriplaSommaZero(array);
    }

    public static void trovaTriplaSommaZero(int[] array) {
        Set<List<Integer>> triple = new HashSet<>();
        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int somma = array[i] + array[left] + array[right];
                if (somma == 0) {
                    List<Integer> triplet = Arrays.asList(array[i], array[left], array[right]);
                    triple.add(triplet);
                    left++;
                    right--;
                } else if (somma < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println("Triple con somma zero:");
        for (List<Integer> triplet : triple) {
            System.out.println(triplet);
        }
    }
}

