package operadoresLogicosCondicionaisRepeticao;

public class EstruturaWhile {
	public static void main(String[] args) {
		
		int numero = 0;
		
		while (numero <= 10) {
			
			System.out.println("Numero: " + numero);
			
			numero++;
		}
		
		
		/*Existe tamb�m o while que � quase a mesma coisa
		 * 
		 * S� que o DO WHILE executa pelo menos uma vez.
		 * */
		
		int numero2 = 0;
		
		do {
			System.out.println("Numero2 = " + numero);
			
			numero2++;
		}while(numero2 <= 20);
		
		
		
		
		
		
		
		
	}
}
