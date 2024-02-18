package lambdaEsercizio;

import java.util.function.IntConsumer;

public class LambdaTest {

    public static void main(String[] args) {

        // sto dichiarando le FunctionalInterface per essere usate nei metodi ripeti:


//        Runnable azione = () -> {
//            System.out.println("hello");
//            System.out.println("*");
//        };

        IntConsumer azioneAsterischi = (x) -> {
            for (int k = 0; k <= x; k++) {
                System.out.print("*");
            }
            System.out.println();
        };

//        IntConsumer azione1 = value -> {
//            if (value % 2 == 0) {
//                System.out.printf("\n%d --> pari ", value);
//            }
//        };
//
//        IntConsumerCustom azioneCustom = c -> {
//            if (c % 2 == 0) {
//                System.out.printf("\n%d --> pari ", c);
//            }
//        };

//        ripeti(5, azione);
//        ripeti1(5, azione1);
//        riperi2Cutom(5, azioneCustom);
//        ripeti(5, () -> System.out.println("Nicola grosso"));
        ripetiAsterischi(10, azioneAsterischi);

    }

//    public static void ripeti(int n, Runnable azione) {
//
//        for (int i = 0; i < n; i++) {
//            azione.run();
//        }
//    }
//
//    public static void ripeti1(int n, IntConsumer azione) {
//        for (int i = 0; i < n; i++) {
//            azione.accept(i);
//        }
//    }
//
//    public static void riperi2Cutom(int n, IntConsumerCustom azioneCustom) {
//        System.out.println("FunctionalInterface custom:");
//        for (int i = 0; i < n; i++) {
//            azioneCustom.method(i);
//        }
//    }

    public static void ripetiAsterischi(int n, IntConsumer azione) {
        for (int i = 0; i < n; i++) {
            azione.accept(i);
        }

    }
}
