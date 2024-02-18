package threadsEsercizio;

public class ContaPersone {

    private int count = 0;

    public int getCount(){
        return count;
    }

    // uso della keyword "synchronized" per abilitare accesso un threads alla volta, altro è messo in attessa
    synchronized public void incrementaPersone(){
        count++;
    }
    public void decrementaContapPersone(){
        synchronized (this){
            count--;
        }
    }
    public void incrementaPersone1(){
        // solo questa porzione del metodo e stato reso "synchronized"
        synchronized (this){
            count++;
        }

    }

}
