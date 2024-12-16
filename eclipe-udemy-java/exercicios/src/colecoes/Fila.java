package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
//		.add() lançará uma exceção caso a fila esteja cheia.
//		.offer() retorna falso caso a fila esteja cheia.
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		//Obtem o elemento, mas não remove.
		//Vai ocorrer uma diferença quando a lista estiver vazia.
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção.
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
		System.out.println();
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); // gera uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
