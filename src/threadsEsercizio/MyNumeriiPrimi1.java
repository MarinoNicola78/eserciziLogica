package threadsEsercizio;

import java.util.concurrent.Callable;

public class MyNumeriiPrimi1 implements Callable<Long> {

    long start, end, nPrimes;
    String nTask;

    public MyNumeriiPrimi1(String nTask, long start, long end) {
        this.nTask = nTask;
        this.start = start;
        this.end = end;
    }

    public MyNumeriiPrimi1(long start, long end) {

        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() {
        for (long i = start; i <= end; i++) {
            if (isPrime(i))
                nPrimes++;
        }
        System.out.printf("\n[%d - %d]: %d", start, end, nPrimes);
        return nPrimes;
    }

    public static boolean isPrime(long n) {
        if (n == 2) {
            return true;
        }
        if (n <= 1 || n % 2 == 0) {
            return false;
        }

        long iMax = (long) Math.sqrt(n); // serve per semplificare il range da controllare se n è numero primo

        // implementazione per trovare il nemero primo
        for (long i = 3; i < iMax; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
