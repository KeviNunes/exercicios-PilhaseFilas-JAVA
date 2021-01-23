package pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	//Cria a lista encadeada
	List<Object> stack = new LinkedList<Object>();
	
	//Método que adiciona elementos na pilha
	public void push(Object elemento) {
		stack.add(elemento);
	}
	
	//Método que remove os elementos da pilha
	public Object pop() {
		return stack.remove(stack.size()-1);
	}
	
	//Método que retorna o último elemento da pilha
	public Object peek() {
		return stack.get(stack.size()-1);
	}
	
	//Método que verifica se a pilha está vazia
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public String toString() {
		return stack.toString();
	}
	
}
