package gestioneContatti;

public class Contatto {

    private String nome, cognome;
    private Integer eta;

    private Categorie categoria;

    public Categorie getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorie categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public Contatto(String nome, String cognome, int eta, Categorie categoria) {
        this.cognome = cognome;
        this.nome = nome;
        this.eta = eta;
        this.categoria = categoria;
    }
    public Contatto() {

    }

    public String toString(){
        String contatto = "nome: " +getNome()+"\n"+"cognome: "+getCognome()+"\n"+"eta: "+getEta()+"\n"+"categoria: "+getCategoria()
                    +"\n"+"###################################";
        return  contatto;
    }
}
