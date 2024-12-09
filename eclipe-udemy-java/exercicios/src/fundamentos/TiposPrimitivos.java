package fundamentos;

public class TiposPrimitivos {
	//informações do funcionario
	
	public static void main(String[] args) {
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 32765;
		int id = 56789;
		long pontosAcumulados = 3_234_845_233L; // posso colocar o numero dessa forma que fica fácil de ver
		
		float salario = 11_445.44F;
		double vendasComuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = false; //true

		char status = 'A'; //ativo
		
		System.out.println(anosDeEmpresa * 365);
		
		System.out.println(numerosDeVoos / 2);
		
		System.out.println(pontosAcumulados / vendasComuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status: " + status);
	}
	
	
}
