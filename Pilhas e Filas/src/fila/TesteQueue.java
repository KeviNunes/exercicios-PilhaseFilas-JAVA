package fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
	//Testa a classe Queue do JAVA
	public static void main(String[] args) {
		//Cria a fila, nome de fila
		Queue<String> queue = new LinkedList<String>();
		
		//Adiciona elementos na fila
		queue.add("Primeiro");
		queue.add("Segundo");
		queue.add("Terceiro");
		
		//Mostra a fila completa
		System.out.println(queue);
		
		//Remove o último elemento da fila
		System.out.println("Saiu: "+queue.poll());
		
		//Mostra a fila completa
		System.out.println(queue);

	}
}