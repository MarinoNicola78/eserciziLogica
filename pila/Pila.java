/*
Quando top è -1 (pila vuota), top + 1 restituirà 0.
Quando top è 0 (un elemento in cima alla pila), top + 1 restituirà 1.
Quando top è 1 (due elementi in cima alla pila), top + 1 restituirà 2.
*/

package pila;

import java.util.EmptyStackException;

public class Pila implements IPila {

	private int top; // indice dell'elemento in cima alla pila
	private int capienza; // grandezza della PILA
	private int[] stack; // array PILA

	public Pila(int capienza) {
		this.capienza = capienza;
		this.stack = new int[capienza];
		this.top = -1; // pila inizialmente vuota con indice a -1
	}

	@Override
	public void push(int n) {
		if(isFull()) {
			System.out.println("La PILA e piena e non POSSO piu aggiungere elementi");
		}else 
		this.stack[++top] = n;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else
			return stack[top--];
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	@Override
	public boolean isFull() {
		return (top == capienza - 1); // +1 perche top è un indice e quindi comincia da zero
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}else 
		return this.stack[top];
	}
	
	

}
