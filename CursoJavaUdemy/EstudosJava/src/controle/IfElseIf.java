package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota geral do aluno: ");
		double notaAluno = entrada.nextDouble();
		
		if(notaAluno >= 9) {
			System.out.println("APROVADO + Honra");
		} else if(notaAluno >= 6 && notaAluno < 9) {
			System.out.println("APROVADO");
		} else if(notaAluno < 6 && notaAluno >= 5) {
			System.out.println("Aluno de recuperação");
		} else {
			System.out.println("REPROVADO");
		}
		
		entrada.close();
	}
}
