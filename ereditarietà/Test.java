package ereditarietà;

public class Test {

	public static void main(String[] args) {
		
		Persona p1 =  new Persona("nicola", "marino");
		Dipendente d1 = new Dipendente("pippo", "pallo", "1300€");
		
		Persona d2 =  new Dipendente("mauro", "pallino", "2300€");
		
		IInterfaccia c = new Cantante();
		
		System.out.println(p1);
		
		System.out.println(d1.toStringCustom());
		
		System.out.println(d2.toString());

		c.voce();

		
	}

}
