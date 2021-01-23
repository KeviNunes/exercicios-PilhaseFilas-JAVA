package pilha;

public class TestePilha {
	// Testa a classe Pilha
	public static void main(String[] args) {
		//Cria a pilha, nome de stack
		Pilha pilha = new Pilha();
		
		//Adiciona elementos na pilha
		pilha.push("Kevin");
		pilha.push("Nunes");
		
		//Mostra a pilha completa
		System.out.println(pilha);
		
		//Remove o último elemento da pilha
		pilha.pop();
		
		//Mostra a pilha completa
		System.out.println(pilha);
		
		//Adiciona elementos na pilha
		pilha.push("Programação");
		pilha.push("JAVA");
		
		//Mostra o último elemento da pilha
		System.out.println(pilha.peek());
		
		//Verifica se a pilha está vazia
		System.out.println(pilha.isEmpty());

	}
}