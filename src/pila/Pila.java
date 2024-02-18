package pila;

public class Pila {


    private static int[] arrayPila;
    private static int size; // dimensione pila
    private static final int maxSize = 5; // dimensione max pila

    public Pila() {
        this.arrayPila = new int[maxSize];
        this.size = 0;
    }

    public int[] getArrayPila() {
        return arrayPila;
    }

    public void setArrayPila(int[] arrayPila) {
        this.arrayPila = arrayPila;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // aggiungi elemento
    public static void push(int elemento) {
        if (size == arrayPila.length) {
            System.out.println("La pila è piena!");
        } else
            arrayPila[size++] = elemento;
    }

    // rimuovi elemento
    public static int pop() {
        if (size == 0) {
            System.out.println("La pila è vuota!");
        }
        return arrayPila[--size];
    }

    // pila vuota
    public static boolean isEmpty() {
        return size == 0;
    }

    // pila piena
    public static boolean isFull() {
        return size == maxSize;
    }


}
