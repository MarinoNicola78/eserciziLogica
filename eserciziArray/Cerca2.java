/* Scrivere il programma Cerca che crea e 
inizializza un array di int contenete 10 valori a
piacere (usando il comando di inizializzazione che prevede 
la lista dei valori tra parentesi graffe), 
chiede all’utente di inserire un numero e stampa Presente se 
il numero `e presente nell’array, oppure Assente
se il numero non `e presente. */

package eserciziArray;

import java.util.Iterator;
import java.util.Scanner;

public class Cerca2 {

	public static void main(String[] args) {

		int[] arrayNum = { 18, 9, 20, 211, 22, 0, -12, -83, 29, 5 };
		Scanner scNum = new Scanner(System.in);

		System.out.println("insert num to find: ");
		int numToFind = scNum.nextInt();
		int index = 0;

		while (index <= arrayNum.length-1) {
			if(numToFind == arrayNum[index]) {
				System.out.println(numToFind + " found!!");
				return;
			}
			index++;
		}
		System.out.println(numToFind + " not found!!");
	}
}
