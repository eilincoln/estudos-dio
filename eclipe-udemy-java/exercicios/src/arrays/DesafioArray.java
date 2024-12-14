package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas v�o ser inseridas? ");
		int quantidadeNotas = entrada.nextInt();
		
		double notas[] = new double[quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d� nota: \n", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		double soma = 0;
		for(double nota: notas) {
			soma += nota;
		}
		
		double media = soma / notas.length;
		
		System.out.printf("A m�dia do aluno(a) �: %.1f\n", media);
		System.out.println("Nota original: " + media);
		
				
		entrada.close();
	}
}
