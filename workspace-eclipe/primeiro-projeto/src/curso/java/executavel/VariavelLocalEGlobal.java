package curso.java.executavel;

public class VariavelLocalEGlobal {
	
	static int maiorIdadeGlobal = 30; //Isso � uma var global, todo o c�digo pode ter acesso a ela.
	
	public static void main(String[] args) {
		
		int maiorIdadeLocal = 18; // Aqui j� � uma var local, s� o main vai poder acessar a mesma.
		
		metodo2();
		
		System.out.println("Valor da var local: " + maiorIdadeLocal);
	}

	
	public static void metodo2() {
		System.out.println("Valor da var global: " + maiorIdadeGlobal);
	}
}
