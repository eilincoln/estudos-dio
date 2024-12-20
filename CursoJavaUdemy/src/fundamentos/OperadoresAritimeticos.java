package fundamentos;

public class OperadoresAritimeticos {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 423;
		
		//Operadores: + - * %
		int soma = num1 + num2 + num3;
		System.out.println(soma);
		
		//Cuidado com a precedência
		System.out.println(num1 + num2 / 2 * num3);
		System.out.println((num1 + num2) / 2 * num3);
		
		//Módulo
		System.out.println(num1 % num2);
		
	}
}
