package POO;

import java.util.Scanner;

public class TesteCarroObjeto {
	
	public static void main(String[] args) {
		//Entrada de dados
		Scanner scanner = new Scanner(System.in);
		
		//Criando o objeto que recebera as infos
		Carro carro1 = new Carro();
		
		carro1.setNome("Uno");
		carro1.setAno(2002);
		carro1.setModelo("RET");
		carro1.setMarca("Fiat");
		
		System.out.println("Nome do carro: " + carro1.getNome());
		System.out.println("Ano de fabricação: " + carro1.getAno());
		System.out.println("Modelo do carro: " + carro1.getModelo());
		System.out.println("Marca do carro: " + carro1.getMarca());
		
		/*=======================================*/
		
		
		scanner.close();
	}
}
