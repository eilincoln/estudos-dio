package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double somaNotas = 0;
		double nota = 0;
		int quantidadeNotas = 0;
		
		
		do {
			System.out.print("Digite a nota do aluno: ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				somaNotas += nota;
				quantidadeNotas++;
			}
		}while (nota != -1);
		
		double media = somaNotas / quantidadeNotas;
		System.out.println("Média é: " + media);
		
		
		entrada.close();
	}
}
