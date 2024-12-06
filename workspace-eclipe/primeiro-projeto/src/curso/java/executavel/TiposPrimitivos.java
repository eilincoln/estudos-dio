package curso.java.executavel;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipos primitivos em Java são os tipos de dados mais básicos,
		// usados para armazenar valores simples. Eles não são objetos, 
		// o que os torna mais leves e rápidos para processamento.

		// Existem 8 tipos primitivos em Java:

		// 1. byte: Armazena números inteiros pequenos (8 bits)
		byte idade = 25; // Exemplo: -128 a 127

		// 2. short: Armazena números inteiros de tamanho médio (16 bits)
		short ano = 2024; // Exemplo: -32.768 a 32.767
		System.out.printf("Estamos no ano: %d\n", ano);

		// 3. int: O tipo inteiro mais comum (32 bits)
		int populacao = 100000; // Exemplo: -2^31 a 2^31-1
		System.out.println("Temos a seguinte população: " + populacao);

		// 4. long: Para números inteiros maiores (64 bits)
		long distanciaEstrelas = 150000000000L; // Exemplo: -2^63 a 2^63-1
		System.out.println("Distancia: " + distanciaEstrelas);
		// Note que adicionamos 'L' no final para indicar que é long.

		// 5. float: Armazena números decimais com precisão simples (32 bits)
		float altura = 1.75f; // Exemplo: Precisa do 'f' no final

		// 6. double: Armazena números decimais com precisão dupla (64 bits)
		double preco = 19.99; // Mais preciso que o float

		// 7. char: Armazena um único caractere (16 bits - Unicode)
		char inicial = 'A'; // Sempre entre aspas simples
		System.out.println("Inicial do nome dele(a): " + inicial);

		// 8. boolean: Armazena verdadeiro ou falso (1 bit)
		boolean ativo = true; // true ou false

		// Os tipos primitivos são "imutáveis", ou seja, seu valor não muda 
		// diretamente, mas podem ser substituídos com atribuição.

		// Exemplos de como usar os tipos primitivos:
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Preço: R$" + preco);
		System.out.println("Está ativo? " + ativo);

		// Diferente dos objetos, os tipos primitivos não possuem métodos 
		// ou comportamentos associados, tornando-os mais simples e diretos.

	}
}
