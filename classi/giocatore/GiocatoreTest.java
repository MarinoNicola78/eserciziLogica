package classi.giocatore;

public class GiocatoreTest {

	public static void main(String[] args) {

		Giocatore totti = new Giocatore("francesco", true, 10, 20);
		Giocatore zanetti = new Giocatore("xavier", false, 20, 30);
		Giocatore delpiero = new Giocatore("alessandro", true, 40, 50);
		
		int tottiGoalFatti = totti.calcolaGoalTotali();
		int zanettiGoalFatti = zanetti.calcolaGoalTotali();
		int delpieroGoalFatti = delpiero.calcolaGoalTotali();
		
		String infoTotti = totti.toString();
		String infoZanetti = zanetti.toString();
		String infoDelPiero = delpiero.toString();
		
		System.out.println("totti goal totali fatti: " + tottiGoalFatti);
		System.out.println("zanetti goal totali fatti: " + zanettiGoalFatti);
		System.out.println("DelPiero goal totali fatti: " + delpieroGoalFatti);
		
		System.out.println("info utili Totti; " + infoTotti);
		System.out.println("info utili Zanetti; " + infoZanetti);
		System.out.println("info utili DelPiero; " + infoDelPiero);
	}

}
