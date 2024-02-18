package javaLogicExercise.registroStudenti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String nome, cognome;
    int voto;


    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", voto=" + voto +
                '}';
    }

    //    public Student(String nome, String cognome, int voto) {
//        this.nome = nome;
//        this.cognome = cognome;
//
//        this.voto = voto;
//    }

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getCognome() {
//        return cognome;
//    }
//
//    public void setCognome(String cognome) {
//        this.cognome = cognome;
//    }
//
//
//    public int getVoto() {
//        return voto;
//    }
//
//    public void setVoto(int voto) {
//        this.voto = voto;
//    }


}
