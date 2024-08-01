package colecoes;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		Stack<String> livros = new Stack<>();
		livros.push("Book 1");
		livros.push("Book 2");
		livros.push("Book 3");		
		
		for (String unidadeLivros: livros) {
			System.out.println(unidadeLivros);

		}
		
		System.out.println("");
		System.out.println(livros.peek());

		System.out.println("");
		livros.pop();
		System.out.println(livros.peek());

		
		System.out.println("");		
		if (!livros.isEmpty()) {
			System.out.println("Not empty");
		} 
		
		livros.clear();

		if (livros.isEmpty()) {
			System.out.println("Empty");
		};
	}
}
