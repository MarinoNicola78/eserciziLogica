package javaLogicExercise;

import java.util.HashMap;
import java.util.Map;

public class JavaEsercizi {
    public static void contaCifre(Integer numero){
        System.out.println(Integer.toString(numero).length());
    }
    public static void convertiStringa(String str){

        System.out.println(Integer.parseInt(str));
        System.out.println(Double.parseDouble(str));
        System.out.println(Integer.valueOf("123"));
    }

    public static void main(String[] args) {
        contaCifre(100);
        convertiStringa("12345");
        mappe();
    }

    public static void mappe(){
        Map<Integer, String> tabella = new HashMap<>();
        tabella.put(1,"nicola");
        tabella.put(2,"fede");
        tabella.put(3,"fabio");
        tabella.put(4,"marico");

        System.out.println(tabella.get(1));
        System.out.println(tabella.values());

    }


}
