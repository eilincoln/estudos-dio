package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		 // Declaração de variáveis booleanas
        boolean verdadeiro = true;
        boolean falso = false;

        // Operador AND Lógico (&&)
        // Retorna true se ambas as condições forem verdadeiras
        boolean resultadoAnd = verdadeiro && falso;
        System.out.println("AND (&&): " + resultadoAnd); // Saída: false

        // Operador OR Lógico (||)
        // Retorna true se pelo menos uma das condições for verdadeira
        boolean resultadoOr = verdadeiro || falso;
        System.out.println("OR (||): " + resultadoOr); // Saída: true

        // Operador NOT Lógico (!)
        // Inverte o valor lógico
        boolean resultadoNot = !verdadeiro;
        System.out.println("NOT (!): " + resultadoNot); // Saída: false

        // Operador XOR Lógico (^)
        // Retorna true se uma condição for verdadeira e a outra falsa
        boolean resultadoXor = verdadeiro ^ falso;
        System.out.println("XOR (^): " + resultadoXor); // Saída: true

        // Operadores lógicos com expressões
        int idade = 20;
        boolean maiorDeIdade = idade >= 18;
        boolean menorDe25Anos = idade < 25;

        // Exemplo com AND lógico
        boolean resultadoCombinadoAnd = maiorDeIdade && menorDe25Anos;
        System.out.println("Maior de 18 e menor de 25: " + resultadoCombinadoAnd); // Saída: true

        // Exemplo com OR lógico
        boolean resultadoCombinadoOr = maiorDeIdade || menorDe25Anos;
        System.out.println("Maior de 18 ou menor de 25: " + resultadoCombinadoOr); // Saída: true

        // Exemplo com NOT lógico
        boolean naoMaiorDeIdade = !maiorDeIdade;
        System.out.println("Não maior de idade: " + naoMaiorDeIdade); // Saída: false
	}
}
