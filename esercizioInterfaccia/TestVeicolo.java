package esercizioInterfaccia;

public class TestVeicolo {

	public static void main(String[] args) {
		
		Skoda skodaNicola = new Skoda();
		
		Tmax tmaxNicola = new Tmax();
		
		System.out.println(skodaNicola.rumore()); 
		System.out.println(skodaNicola.velocità());
		System.out.println();
		System.out.println(tmaxNicola.rumore());
		System.out.println(tmaxNicola.velocità());
		
		

	}

}
