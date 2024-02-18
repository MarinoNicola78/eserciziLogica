/*Crea un programma Java che gestisca un registro di studenti utilizzando una struttura dati HashMap.
Ogni studente è identificato da un numero di matricola (chiave) e ha associati almeno il nome e il voto*/
package javaLogicExercise.registroStudenti;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class RegistroStudenti {

    // FunctionalInterface da usare come iteratore
    public BiConsumer mappaStudentiIterata = (k, s) -> System.out.printf("\nmatricola: " + "%d " + "-->" + " %s", k, s);


    private static int count = 0;
    HashMap<Integer, Student> mappaStudenti = new HashMap<>();

    public RegistroStudenti() {
        this.mappaStudenti = new HashMap<>();
    }

    public String insertStudent(Student student) {
        mappaStudenti.put(++count, student);
        return String.format("studente aggiunto");
    }

    public void listStudent() {
        if (!mappaStudenti.isEmpty()) {
            System.out.println("Stampo registro Studenti: ");

            // forEach su HasMap
            mappaStudenti.forEach(mappaStudentiIterata);
//            mappaStudenti.forEach((k, s) -> System.out.printf("\nmatricola: " + "%d " + "-->" + " %s", k, s));

            // itero HasMap
//            for (Map.Entry<Integer, Student> kv : mappaStudenti.entrySet()) {
//                System.out.printf("\nmatricola: " + "%d " + "-->" + " %s", kv.getKey(), kv.getValue());
//            }
        } else
            System.out.println("registro Studenti vuoto!!");
    }

    public Student searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInnserire matricola da cercare:");
        int matricola = sc.nextInt();

        if (mappaStudenti.containsKey(matricola)) {
//            System.out.printf("\n%s: ", mappaStudenti.get(matricola));
            return mappaStudenti.get(matricola);
        } else
            return new Student();

    }

    public void updateVotoStudente() {

        Student student = searchStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInnserire il nuovo voto");
        int votoToUpdate = sc.nextInt();
        student.setVoto(votoToUpdate);
        Scanner scK = new Scanner(System.in);
        System.out.println("\nInnserire la matricola utente to update: ");
        int k = scK.nextInt();
        mappaStudenti.replace(k, student);
        System.out.println("nuovo voto aggiornato");
        System.out.println(mappaStudenti.get(k));
    }

    public void deleteStudent(){

        Scanner scK = new Scanner(System.in);
        System.out.println("\nInnserire la matricola utente to delete: ");
        int k = scK.nextInt();
        mappaStudenti.remove(k);
        System.out.println("utente delete!!");
        listStudent();

    }


}
