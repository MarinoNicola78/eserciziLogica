package calcolatrice;

import java.util.Scanner;

public class AppCalc {


    public static void main(String[] args) {

        ModelCalc model = new ModelCalc();

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("inserire il primo Operatore: ");
        int opt1 = sc1.nextInt();
        System.out.println("inserire il secondo Operatore: ");
        int opt2 = sc2.nextInt();

        String operatore = null;
        OperatoreBinario op = null;

        // TODO test
        while (op == null){
            System.out.print("\nInserire Operatore Binario: ");
            operatore = sc3.next();
            op = model.getOperator(operatore);
            if (op == null) {
                // opzioni possibili:
                System.out.print("operazioni disponibili:");
                model.getOperatorSymbol().forEach( k -> System.out.print("\n" + k));
            }
        }

        int res = op.evaul(opt1, opt2);

        System.out.printf("%d %s %d = %d", opt1, operatore, opt2, res);

    }
}
