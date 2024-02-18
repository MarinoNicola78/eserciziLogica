/*scrivi una stringa che contata tutte le lettere e le stampa in seguenza con il nummero di volte, non
* contare gli spazi e ignora le maiuscole*/

package javaLogicExercise;

import java.util.HashMap;
import java.util.Map;

public class FreqCaratteri {

    public static void main(String[] args) {
        String str = "Nicola nicola Big big";

        freqCaratteri(str);
    }
    public static void freqCaratteri(String str){

        HashMap<String, Integer> mapCaratteri = new HashMap<>();
        for (char ch : str.replaceAll("\\s", "").toLowerCase().toCharArray()){
            if(mapCaratteri.containsKey("" + ch)){
                int count = mapCaratteri.get("" + ch);
                mapCaratteri.put("" + ch, count +1);
            }else {
                mapCaratteri.put("" + ch, 1);
            }
        }

        for(Map.Entry<String, Integer> kv : mapCaratteri.entrySet())
            System.out.printf("\n%s......%d",kv.getKey(),kv.getValue());

    }
}
