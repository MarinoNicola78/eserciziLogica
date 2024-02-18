package threadsEsercizio;

public class MyNumeriPrimi implements Runnable {


    long start, end, nPrimes;
    String nTask;

    public MyNumeriPrimi(String nTask, long start, long end) {
        this.nTask = nTask;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        Chrono chrono = new Chrono();
        chrono.start();
        System.out.println("Chrono START: " + nTask);
        for (long i = start; i <= end; i++) {
            if (isPrime(i)) {
                nPrimes++;
            }
        }
        System.out.printf("\n[%d - %d]: %d", start, end, nPrimes);
        chrono.stop();
        System.out.println("\nchrono STOP Threads: " + nTask+ " " + chrono.elapsedTime());
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
