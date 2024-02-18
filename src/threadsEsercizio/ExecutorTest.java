package threadsEsercizio;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> fa = executorService.submit(new MyTask1("a", 10, 10));
        Future<Integer> fb = executorService.submit(new MyTask1("b", 10, 10));
        Future<Integer> fc = executorService.submit(new MyTask1("c", 10, 10));


        try {
            System.out.print("\nRisultati: ");
            System.out.printf("\n\ntask fa %d ", fa.get());
            System.out.printf("\n\ntask fb %d ", fb.get());
            System.out.printf("\n\ntask fc %d ", fc.get());

            System.out.printf("\n\nsomma: %d", fa.get() + fb.get() + fc.get() );
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        System.out.println("\nattività completata!!");
    }
}
