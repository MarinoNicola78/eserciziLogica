package threadsEsercizio;

public class ThreadsTest {

    public static void main(String[] args) {

        System.out.println("avvio programma e nome Thread: "+ Thread.currentThread().getName());
        // sono 2 threads diversi, uno nel main e altro nel Threads creato con la Classe Thread
        Runnable taskA = new MyTask("A", 10, 10);
        Runnable taskB = new MyTask("B", 15, 190);
        Runnable taskC = new MyTask("C", 20, 90);

        // prima viene eseguito tutto il task principale del Main e dopo partono gli altrj Task e procedono in modo
        // asincrono tra di loro
        taskA.run();

        Thread thread = new Thread(taskB); // creazione new Threads dandogli in pasto il taskB come parametro
        thread.start();                    // avvio del new threads

        Thread thread1 = new Thread(taskC);
        thread1.start();

        System.out.println("fine programma e nome Thread:  " +  Thread.currentThread().getName());
    }
}
