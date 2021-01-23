package fila;

public class TesteFila {
	//Testa a classe Fila
	public static void main(String[] args) {
		//Cria a fila, nome de fila
		Fila fila = new Fila();
		
		//Adiciona elementos na fila
		fila.add("Primeiro");
		fila.add("Segundo");
		fila.add("Terceiro");
		
		//Mostra a fila completa
		System.out.println(fila);
		
		//Remove o último elemento da fila
		System.out.println("Saiu: "+fila.remove());
		
		//Mostra a fila completa
		System.out.println(fila);
		
	}
}