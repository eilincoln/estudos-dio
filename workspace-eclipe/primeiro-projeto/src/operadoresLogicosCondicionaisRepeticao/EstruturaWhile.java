package operadoresLogicosCondicionaisRepeticao;

public class EstruturaWhile {
	public static void main(String[] args) {
		
		int numero = 0;
		
		while (numero <= 10) {
			
			System.out.println("Numero: " + numero);
			
			numero++;
		}
		
		
		/*Existe também o while que é quase a mesma coisa
		 * 
		 * Só que o DO WHILE executa pelo menos uma vez.
		 * */
		
		int numero2 = 0;
		
		do {
			System.out.println("Numero2 = " + numero);
			
			numero2++;
		}while(numero2 <= 20);
		
		
		
		
		
		
		
		
	}
}
