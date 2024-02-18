// scopo: gestire un contatore comune al mio progetto
package threadsEsercizio;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class OggettoComune {
    public static void main(String[] args) throws Exception {

        }
        ExecutorService executorServiceIngressi = Executors.newFixedThreadPool(10);
        ExecutorService executorServiceUscita = Executors.newFixedThreadPool(10);
        ContaPersone contaPersone = new ContaPersone();

        IntStream.range(0, 10000)
                .forEach(v -> executorServiceIngressi.submit(contaPersone::incrementaPersone));
        IntStream.range(0, 5000)
                .forEach(v -> executorServiceUscita.submit(contaPersone::decrementaContapPersone));

        executorServiceIngressi.shutdown();
        executorServiceUscita.shutdown();
        executorServiceIngressi.awaitTermination(60, TimeUnit.SECONDS);
        executorServiceUscita.awaitTermination(60, TimeUnit.SECONDS);
        // quando arrivo a questo punto del codice il task è stato completato, infatti o cone ritiorno 10000
        System.out.printf("\n numero persone entrate sono: %d", contaPersone.getCount());


    }
}
