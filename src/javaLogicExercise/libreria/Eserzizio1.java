package javaLogicExercise.libreria;

public class Eserzizio1 {

    public static void main(String[] args) {

        String[] listaIndirizzi = {"Senago,129,20030,milano",
                "Calderara,4,20027,milano",
                "Varedo,10,20956,MonzaBrianza"};

        for (int i = 0; i < listaIndirizzi.length; i++) {
            String indirizzo = listaIndirizzi[i];
            String[] ind = indirizzo.split(",");
            String paese = ind[0];
            String civico = ind[1];
            String cap = ind[2];
            String provincia = ind[3];



        }

    }


}
