/*Descrizione: La classe CalcolatoreMedia dovrebbe essere progettata per calcolare la media
di un insieme di numeri interi. La classe dovrebbe includere almeno due metodi principali:
uno per aggiungere un numero all'insieme e l'altro per calcolare la media di tutti i numeri aggiunti finora.
Inoltre, la classe dovrebbe gestire correttamente la situazione in cui nessun numero è stato aggiunto
(calcolando la media come zero).
 */

package javaLogicExercise;

import java.util.ArrayList;
import java.util.List;

public class CalcolatoreMedia {

    private List<Integer> listaNumeri;

    public List<Integer> getListaNumeri() {
        return listaNumeri;
    }

    public void setListaNumeri(List<Integer> listaNumeri) {
        this.listaNumeri = listaNumeri;
    }

    public void stampaLista() {
        System.out.println(getListaNumeri());
    }

    public void calcolaMedia(List<Integer> listaNumeri) {
        try {
            Integer sumNum = getListaNumeri()
                    .stream()
                    .mapToInt(n -> n)
                    .sum();
            System.out.print("media listaNumeri: ");
            System.out.println(sumNum / listaNumeri.size());
        } catch (NullPointerException e) {
            e.getCause();
            System.out.println("non posso fare la media di 0, devi aggiungere dei numeri");
        }
    }

    public void aggiungiNumero(int n) {
        try {
            setListaNumeri(new ArrayList<>(getListaNumeri()));
            getListaNumeri().add(n);
        }catch (NullPointerException e){
            e.getCause();
            System.out.println("non posso fare la media di 0, devi aggiungere dei numeri");
        }


    }

    public static void main(String[] args) {

        CalcolatoreMedia calcolatoreMedia = new CalcolatoreMedia();

        calcolatoreMedia.setListaNumeri(List.of(5, 6, 7, 3, 2, 87, 9, 12));
        calcolatoreMedia.stampaLista();
        calcolatoreMedia.calcolaMedia(calcolatoreMedia.getListaNumeri());


        System.out.println("#######################################");

        calcolatoreMedia.aggiungiNumero(10);
        calcolatoreMedia.stampaLista();
        calcolatoreMedia.calcolaMedia(calcolatoreMedia.getListaNumeri());


        ;
    }
}
