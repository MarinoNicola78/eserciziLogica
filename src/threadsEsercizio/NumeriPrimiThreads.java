package threadsEsercizio;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NumeriPrimiThreads {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Chrono c = new Chrono();
        c.start();
//        MyNumeriPrimi pt0 = new MyNumeriPrimi("Main", 1, 5000000);
//        pt0.run();

        Future<Long> fa = executorService.submit(new MyNumeriiPrimi1(1, 1000000));
        Future<Long> fb = executorService.submit(new MyNumeriiPrimi1(1000001, 2000000));
        Future<Long> fc = executorService.submit(new MyNumeriiPrimi1(2000001, 3000000));
        Future<Long> fd = executorService.submit(new MyNumeriiPrimi1(3000001, 4000000));
        Future<Long> fe = executorService.submit(new MyNumeriiPrimi1(4000001, 5000000));

        try {
            System.out.printf("\nsomma: %d", fa.get() + fb.get() + fc.get() + fd.get() + fe.get());
            c.stop();
            c.elapsedTime();
            System.out.printf("\n time: %ss\n", c);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

        System.out.println("\nattività completata!!");


//        Thread t0 = new Thread(task0);
//        Thread t1 = new Thread(task1);
//        Thread t2 = new Thread(task2);
//        Thread t3 = new Thread(task3);
//        Thread t4 = new Thread(task4);
//
//        t0.start();
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();


    }
}
