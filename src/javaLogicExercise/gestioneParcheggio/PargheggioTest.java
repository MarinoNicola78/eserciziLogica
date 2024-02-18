package javaLogicExercise.gestioneParcheggio;

import java.util.ArrayList;
import java.util.List;

public class PargheggioTest {
    public static void main(String[] args) {

        Veicolo veicolo1 = new Veicolo("ds123dx");
        Veicolo veicolo2 = new Veicolo("gh764of");
        Veicolo veicolo3 = new Veicolo("fg833gm");
        Veicolo veicolo4 = new Veicolo("gh698dj");
        Veicolo veicolo5 = new Veicolo("rd567ew");
        Veicolo veicolo6 = new Veicolo("io542lb");

        List<Veicolo> parcheggio = new ArrayList<>();
        GestioneParcheggioVeicoli gestioneParcheggioVeicoli = new GestioneParcheggioVeicoli(5);

        gestioneParcheggioVeicoli.statoParcheggio();
        System.out.println("############################");

        gestioneParcheggioVeicoli.aggiungiVeicolo(veicolo1);
        gestioneParcheggioVeicoli.statoParcheggio();
        System.out.println("############################");

        gestioneParcheggioVeicoli.aggiungiVeicolo(veicolo2);
        gestioneParcheggioVeicoli.statoParcheggio();
        System.out.println("############################");

        gestioneParcheggioVeicoli.aggiungiVeicolo(veicolo3);
        gestioneParcheggioVeicoli.statoParcheggio();
        System.out.println("############################");

        gestioneParcheggioVeicoli.aggiungiVeicolo(veicolo4);
        gestioneParcheggioVeicoli.statoParcheggio();
        System.out.println("############################");

        gestioneParcheggioVeicoli.aggiungiVeicolo(veicolo5);
        gestioneParcheggioVeicoli.statoParcheggio();
        System.out.println("############################");

        gestioneParcheggioVeicoli.aggiungiVeicolo(veicolo6);
        gestioneParcheggioVeicoli.statoParcheggio();
        System.out.println("############################");



//        gestioneParcheggioVeicoli.rimuoviVeicolo(veicolo1);
//        gestioneParcheggioVeicoli.statoParcheggio();
//        System.out.println("############################");




    }
}
