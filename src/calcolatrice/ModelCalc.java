package calcolatrice;

import java.util.HashMap;
import java.util.Set;

public class ModelCalc {

    private HashMap<String, OperatoreBinario> calc = new HashMap<>();

    public ModelCalc (){
        calc = initCalc();
    }

    // private perche NON voglio che dall'esterno si modificaano la logica della Calc
    private HashMap<String, OperatoreBinario> initCalc() {

        HashMap<String, OperatoreBinario> calc = new HashMap<>();
        calc.put("+", (Integer::sum));
        calc.put("-", ((opt1, opt2) -> opt1 - opt2));
        calc.put("/", ((opt1, opt2) -> opt1 / opt2));
        calc.put("*", ((opt1, opt2) -> opt1 * opt2));
        calc.put("^", ((opt1, opt2) -> (int) Math.pow(opt1, opt2)));
        return calc;
    }

    // metodi pubblici che mi permettono di ottere dati senza modificare il cuore della Calc
    public OperatoreBinario getOperator(String opSymbol){
        return calc.get(opSymbol);
    }

    public Set<String> getOperatorSymbol(){
        return calc.keySet();
    }
}
