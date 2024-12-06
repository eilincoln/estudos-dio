package curso.java.executavel;

public class VariavelLocalEGlobal {
	
	static int maiorIdadeGlobal = 30; //Isso é uma var global, todo o código pode ter acesso a ela.
	
	public static void main(String[] args) {
		
		int maiorIdadeLocal = 18; // Aqui já é uma var local, só o main vai poder acessar a mesma.
		
		metodo2();
		
		System.out.println("Valor da var local: " + maiorIdadeLocal);
	}

	
	public static void metodo2() {
		System.out.println("Valor da var global: " + maiorIdadeGlobal);
	}
}
