package operadoresLogicosCondicionaisRepeticao;

public class LacoFor {
	public static void main(String[] args) {
		// Usando laço for para estrutura de repetição
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Numero atual: " + i);
		}
		
		//Usando um break
		for(int i = 0; i <= 10; i++) {
			System.out.println("valor de i: " + i );
			if(i == 3) {
			System.out.println("Encontrei o numero 3");
			System.out.println("Estou parando o programa...");
			break;
			}
		}

	}
}
