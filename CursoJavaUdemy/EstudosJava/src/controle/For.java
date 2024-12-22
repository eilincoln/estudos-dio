package controle;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double somaNota = 0;
		double nota = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				somaNota += nota;
			}
		}
		
		System.out.println("Média das notas: " + somaNota / 3);
		
		
		entrada.close();
	}
}
