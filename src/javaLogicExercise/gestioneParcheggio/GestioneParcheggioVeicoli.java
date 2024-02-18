/*Implementa una classe Java per la gestione di un parcheggio di veicoli.
La classe dovrebbe consentire di aggiungere veicoli al parcheggio, rimuoverli, e verificare lo stato attuale
del parcheggio. Ogni veicolo ha un numero di targa univoco e altre informazioni pertinenti
(ad esempio, marca, modello). La classe deve gestire il numero massimo di veicoli che possono essere
parcheggiati e garantire che non vengano aggiunti veicoli con la stessa targa.
Implementa metodi per aggiungere un veicolo, rimuovere un veicolo, e ottenere lo stato corrente del parcheggio.
*
* */

package javaLogicExercise.gestioneParcheggio;


import java.util.ArrayList;
import java.util.List;

public class GestioneParcheggioVeicoli {

    private List<Veicolo> parcheggio;
    private int numeroMassimoVeicoli;

    //Costruttore
    public GestioneParcheggioVeicoli(int numeroMassimoVeicoli) {
        // inizializzo il parcheggio vuoto e fisso il numeroMassimoVeicoli
        this.parcheggio = new ArrayList<>();
        this.numeroMassimoVeicoli = numeroMassimoVeicoli;
    }

    // getter and setter
    public List<Veicolo> getParcheggio() {
        return parcheggio;
    }

    public void setParcheggio(List<Veicolo> parcheggio) {
        this.parcheggio = parcheggio;
    }

    public int getNumeroMassimoVeicoli() {
        return numeroMassimoVeicoli;
    }

    public void setNumeroMassimoVeicoli(int numeroMassimoVeicoli) {
        this.numeroMassimoVeicoli = numeroMassimoVeicoli;
    }

    // metodi per gestione pargheggio
    public void aggiungiVeicolo(Veicolo veicolo) {
        if (this.parcheggio.size() == this.numeroMassimoVeicoli) {
            System.out.println("parcheggio pieno!!, NON posso aggiungere veicoli");
        } else {
            this.parcheggio.add(veicolo);
            System.out.println("veicolo aggiunto al pargheggio");
            if (this.parcheggio.size() == this.numeroMassimoVeicoli) {
                System.out.println("parcheggio Semaforo Rosso!!");

            }
        }
    }

    public void rimuoviVeicolo(Veicolo veicolo) {

        if (this.parcheggio.size() == 0) {
            System.out.println("parcheggio vuoto!!");
        }
        if (this.parcheggio
                .stream()
                .anyMatch(v -> v.equals(veicolo))) {
            this.parcheggio.remove(veicolo);
            System.out.println("veicolo rimosso dal pargheggio");
        } else
            System.out.println("veicolo NON presente nel parcheggio!!");
    }

    public void statoParcheggio() {
        System.out.print("Stato attuale del parcheggio:" + "\n");
        System.out.print("Posti Totali Parcheggio: " + getNumeroMassimoVeicoli() + "\n");
        System.out.print("Posti liberi: " + (getNumeroMassimoVeicoli() - getParcheggio().size()) + "\n");
        System.out.print("Posti Occupati: " + getParcheggio().size() + "\n");
        System.out.print("Veicoli parcheggiati:" + "\n");
        this.parcheggio.forEach(v -> System.out.println("targha veicolo: " + v.getTarga()));

    }

}
