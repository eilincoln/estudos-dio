package arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos: ");
		int quantidadeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno: ");
		int quantidadeNotas = entrada.nextInt();
		
		double notasDaTurma[][] = new double[quantidadeAlunos][quantidadeNotas];
		
		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ",j + 1, i + 1);
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.println("M�dia da turma �: " + media);
		
		entrada.close();
	}
}
