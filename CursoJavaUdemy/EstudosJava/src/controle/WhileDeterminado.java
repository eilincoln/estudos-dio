package controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double somaNota = 0;
		double nota = 0;
		
		int indice = 0;
		while(indice < 3) {
			System.out.print("Digite a nota do aluno: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				somaNota += nota;
				indice++;
			}
		}
		
		System.out.println("Média é: " + somaNota / 3);
		
		entrada.close();
	}
}
