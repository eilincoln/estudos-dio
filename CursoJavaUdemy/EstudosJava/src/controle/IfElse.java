package controle;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota do aluno: ");
		double nota = entrada.nextDouble();

		if (nota >= 7) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}

		entrada.close();
	}

}
