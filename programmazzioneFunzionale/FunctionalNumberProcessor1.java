package programmazzioneFunzionale;
import java.util.List;

public class FunctionalNumberProcessor1 {

    public static void main(String[] args) {

        List<Long> numList = List.of(55, -5, 25, -8, 60, -60, 40, 15, -20, -70, -45)
                .stream()
                .filter(n -> n > -50 && n < 50)
                .map(n -> (long) (n > 0 ? Math.pow(n, 2):Math.pow(n,3)))
                .toList();
        System.out.println(numList);

    }
}
