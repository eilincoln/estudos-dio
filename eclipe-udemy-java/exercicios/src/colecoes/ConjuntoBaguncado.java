package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//vai ser convertido sozinho
		conjunto.add(1.2);// double -> Double
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		System.out.println("O tamanho é: " + conjunto.size());
		
		conjunto.add('X');
		System.out.println("O tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println("O tamanho é: " + conjunto.size());
		
		
		System.out.println(conjunto.contains('X'));
		
		Set numeros = new HashSet();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		System.out.println(conjunto);
		
		conjunto.addAll(numeros);
		
		System.out.println(conjunto);
		
	}
}
