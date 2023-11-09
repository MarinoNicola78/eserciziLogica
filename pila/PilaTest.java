package pila;

public class PilaTest {

	public static void main(String[] args) {

		Pila pila = new Pila(5);
		
		System.out.println("dimensioni inizali PILA: " + pila.size());
		
		System.out.println("add piu elementi nella PILA");
		
		pila.push(10);
		pila.push(34);
		pila.push(45);
		pila.push(45);
		pila.push(90);
		pila.push(100);
		pila.push(200);
		
		System.out.println("dimensioni PILA: " + pila.size());
		System.out.println("elemento in cima alla PILA: " + pila.peek());
		
		System.out.println("remove ultimo elemento nella PILA");
		pila.pop();
		System.out.println("dimensioni PILA: " + pila.size());
		System.out.println("elemento in cima alla PILA: " + pila.peek());
	}

}
