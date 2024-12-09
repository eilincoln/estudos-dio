package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Hello World".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "######");
		
		System.out.println(s.startsWith("Boa"));//true
		System.out.println(s.startsWith("boa"));//false
		System.out.println(s.length());//9
		System.out.println(s.equalsIgnoreCase("boa tarde"));//true
		
		String nome = "Lincoln";
		String sobrenome = "Berto";
		int idade = 33;
		double salario = 12345.967;
		
		System.out.printf("Nome: %s %s tem %d anos e ganha %.2f", nome, sobrenome, idade, salario);
		String frase = String.format("\nNome: %s %s tem %d anos e ganha %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);//vai dar o mesmo resultado da de cima
	
	
	
	}
}
