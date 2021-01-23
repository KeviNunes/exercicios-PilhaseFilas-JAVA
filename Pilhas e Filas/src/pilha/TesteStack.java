package pilha;

import java.util.Stack;

public class TesteStack {
	//Testa a classe Stack do JAVA
	public static void main(String[] args) {
		//Cria a pilha, nome de stack
		Stack<String> stack = new Stack<String>();
		
		//Adiciona elementos na stack
		stack.push("Kevin");
		stack.push("Nunes");
		
		//Mostra a stack completa
		System.out.println(stack);
		
		//Remove o último elemento da stack
		stack.pop();
		
		//Mostra a stack completa
		System.out.println(stack);
		
		//Adiciona elementos na stack
		stack.push("Programação");
		stack.push("JAVA");
		
		//Mostra o último elemento da stack
		System.out.println(stack.peek());
		
		//Verifica se a stack está vazia
		System.out.println(stack.isEmpty());
		
	}
}