package fundamentos;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		 int a = 5;  // 0101 em binário
	        int b = 3;  // 0011 em binário
	        int resultadoAnd = a & b;  // 0001 em binário = 1
	        System.out.println("AND: " + resultadoAnd); // Saída: 1

	        // Operador OR Bitwise (|)
	        int resultadoOr = a | b;  // 0111 em binário = 7
	        System.out.println("OR: " + resultadoOr); // Saída: 7

	        // Operador XOR Bitwise (^)
	        int resultadoXor = a ^ b;  // 0110 em binário = 6
	        System.out.println("XOR: " + resultadoXor); // Saída: 6

	        // Operador de Complemento Bitwise (~)
	        int resultadoComplemento = ~a;  // 1010 em binário (complemento de dois) = -6
	        System.out.println("Complemento: " + resultadoComplemento); // Saída: -6

	        // Operador de Shift para a Esquerda (<<)
	        int resultadoShiftEsquerda = a << 1;  // 1010 em binário = 10
	        System.out.println("Shift Esquerda: " + resultadoShiftEsquerda); // Saída: 10

	        // Operador de Shift para a Direita (>>)
	        int resultadoShiftDireita = a >> 1;  // 0010 em binário = 2
	        System.out.println("Shift Direita: " + resultadoShiftDireita); // Saída: 2

	        // Operador de Shift para a Direita com Zero (>>>)
	        int c = -5;  // Representado como número negativo em binário
	        int resultadoShiftDireitaZero = c >>> 1;  
	        System.out.println("Shift Direita com Zero: " + resultadoShiftDireitaZero); 
	        // Saída: Depende do sistema, mas será um número positivo
		
	}
}
