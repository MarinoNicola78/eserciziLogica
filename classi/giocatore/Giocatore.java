package classi.giocatore;

public class Giocatore {

	private String nome;
	private boolean capitano;
	private int goal, goalNazionale;

	
	public Giocatore() {
	}

	public Giocatore(String nome, boolean capitano, int goal, int goalNazionale) {
		super();
		this.nome = nome;
		this.capitano = capitano;
		this.goal = goal;
		this.goalNazionale = goalNazionale;
	}

	public String getNome() {
		return nome;
	}

	public boolean isCapitano() {
		return capitano;
	}

	public int getGoal() {
		return goal;
	}

	public int getGoalNazionale() {
		return goalNazionale;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCapitano(boolean capitano) {
		this.capitano = capitano;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public void setGoalNazionale(int goalNazionale) {
		this.goalNazionale = goalNazionale;
	}

	@Override
	public String toString() {
		return "Giocatore [nome=" + nome + ", capitano=" + capitano + ", goal=" + goal + ", goalNazionale="
				+ goalNazionale + "]";
	}
	
	
	public int calcolaGoalTotali() {
		
		
		int somma= this.goalNazionale + this.goal;
		
		return somma;
	}

}
