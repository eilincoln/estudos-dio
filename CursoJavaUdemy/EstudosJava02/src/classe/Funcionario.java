package classe;

public class Funcionario {
	String nome;
	double salario;
	String funcao;
	
	Funcionario(){
	}
	
	Funcionario(String nome, double salario, String funcao){
		this.nome = nome;
		this.salario = salario;
		this.funcao = funcao;
	}
	
	String informacaoFunc(){
		String frase = String.format("Funcionario: \nNome: %s\nSalário: %.2f\nFuncao: %s", this.nome, this.salario, this.funcao);
		return frase;
	}
}
;