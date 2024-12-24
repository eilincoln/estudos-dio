package classe;

public class FuncionaioTeste {
	public static void main(String[] args) {
	
		Funcionario func1 = new Funcionario();
		func1.nome = "Licoln Santos";
		func1.salario = 2200;
		func1.funcao = "Programador Front-End";
		
		Funcionario func2 = new Funcionario("Kamilly", 3500, "Progradora Backend");
		
		System.out.println(func1.informacaoFunc());
		System.out.println();
		System.out.println(func2.informacaoFunc());
	}
}
