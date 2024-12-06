package curso.java.executavel;

import java.util.Scanner;

public class OperacaoLogicaAninhada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		double nota2 = scanner.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		double nota3 = scanner.nextDouble();
		
		System.out.println("Digite a nota 4: ");
		double nota4 = scanner.nextDouble();
		
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Media do aluno: " + media);

		if(media >= 6) {
			System.out.println("Aluno APROVADO");
			if(media >=9) {
				System.out.println("ALUNO SHOW");
			}
		} else if(media >= 4){
			System.out.println("Aluno de RECUPERAÇÃO");
		} else {
			System.out.println("REPROVADO!");
		}
		
		
		
		scanner.close();
	}
}
