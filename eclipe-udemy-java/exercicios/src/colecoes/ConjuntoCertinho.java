package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoCertinho {

	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new HashSet<String>();
		Set<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Lincoln");
		listaAprovados.add("Fabiana");
		listaAprovados.add("Dennis");
		listaAprovados.add("Kamilly");
		listaAprovados.add("Anna");		
		
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		
		//criando outra para poder fazer um teste
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		nums.add(456);
		
		for(Integer numeros: nums) {
			System.out.println(numeros);
		}
	}
}
