package eserciziArray;

public class ArrayBubbleSort {

	public static void main(String[] args) {

		int[] array = { 3, 20, 16, 1 };
		arrayBubbleSort(array);

		System.out.println("array ordinato con Algoritmo Bubble Sort: ");

		for (int num : array) {
			System.out.print(" " + num);
		}
	}

	public static void arrayBubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			boolean exit = false;
			for (int j = 0; j < array.length - 1; j++) {
				// logica algoritmo Bubble Sort, scambia i num se
				// verificata utenza
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					exit = true;
				}
			}
			// esci perche non ci sono piu elementi da iterare
			if (!exit)
				break;
		}

	}

}
