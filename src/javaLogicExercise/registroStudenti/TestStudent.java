package javaLogicExercise.registroStudenti;

public class TestStudent {

    public static void main(String[] args) {

        RegistroStudenti registroStudenti = new RegistroStudenti();

        System.out.println(registroStudenti.insertStudent(new Student("nicola","marino",10)));
        System.out.println(registroStudenti.insertStudent(new Student("marco","marino",9)));
        System.out.println(registroStudenti.insertStudent(new Student("fabio","marino",9)));
        System.out.println(registroStudenti.insertStudent(new Student("fede","micheletti",8)));

        registroStudenti.listStudent();
        registroStudenti.updateVotoStudente();
        registroStudenti.listStudent();
        registroStudenti.deleteStudent();

    }
}
