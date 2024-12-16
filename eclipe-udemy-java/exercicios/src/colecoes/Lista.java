package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		//Posso criar
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lis"));
		lista.add(new Usuario("Lincoln"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // Aqui eu consigo acessar pelo índice
		
		System.out.println(">>>>>>>>" + lista.remove(1)); 
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lincoln")));
		
		
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}
}
