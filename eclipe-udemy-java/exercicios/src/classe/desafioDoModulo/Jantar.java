package classe.desafioDoModulo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoaUm = new Pessoa("Lincoln", 90.0);
		System.out.println("Peso original da pessoa " + pessoaUm.nomePessoa + " é:"  + pessoaUm.pesoPessoa);

		Comida comidaUm = new Comida("Banana", 0.200);
		Comida comidaDois = new Comida("Prato de macarrão", 1.0);
		
		pessoaUm.comer(comidaUm);
		pessoaUm.comer(comidaDois);
		System.out.println("Peso depois de comer: " + pessoaUm.pesoPessoa);
		
		
		
	}
}
