package threadsEsercizio;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskSequence {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Long> fa = executorService.submit(new MyNumeriiPrimi1(1, 1000000));
        executorService.submit(() -> {
            try {
                fa.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                executorService.shutdown();
            }
            System.out.println("\nthreads conpletato!!");
        });


    }
}
