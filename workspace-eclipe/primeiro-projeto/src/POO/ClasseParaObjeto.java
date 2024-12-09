package POO;

public class ClasseParaObjeto {
	public static void main(String[] args) {
		
		
		//Isso são construtores de objetos
		//Aqui é uma instancia (uma criação de objeto)
		Aluno aluno1 = new Aluno(); //Construtores padrões.
		
	  //Classe   referencia    instanciar para criação
		Aluno    aluno2 =      new Aluno();
		
		Aluno aluno3 = new Aluno("Lincoln"); //Esse aluno já vem com um nome padrão
		
		Aluno aluno4 = new Aluno("Kamilly", 20); // Vem com um novo padrão igual criado na classe.
		
		
	}
}
