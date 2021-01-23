package fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {
	//Cria a lista encadeada
	List<Object> fila = new LinkedList<Object>();
		
	//Método que adiciona elementos na fila
	public void add(Object elemento) {
		fila.add(elemento);
	}

	//Método que remove os elementos da fila
	public Object remove() {
		return fila.remove(0);
	}

	//Método que verifica se a fila está vazia
	public boolean empty() {
		return fila.isEmpty();
	}

	public String toString() {
		return fila.toString();
	}
}
