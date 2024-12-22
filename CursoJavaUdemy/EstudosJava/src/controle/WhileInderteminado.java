package controle;

import java.util.Scanner;

public class WhileInderteminado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		while(nota != -1) {
			System.out.print("Digite a nota do aluno: ");
			nota = scanner.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}
		}
		
		
		double media = somaDasNotas / numeroDeNotas;
		
		System.out.println("A média é: " + media);
		
		scanner.close();
	}
}
