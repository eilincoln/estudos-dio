package POO;

public class ClasseParaObjeto {
	public static void main(String[] args) {
		
		
		//Isso s�o construtores de objetos
		//Aqui � uma instancia (uma cria��o de objeto)
		Aluno aluno1 = new Aluno(); //Construtores padr�es.
		
	  //Classe   referencia    instanciar para cria��o
		Aluno    aluno2 =      new Aluno();
		
		Aluno aluno3 = new Aluno("Lincoln"); //Esse aluno j� vem com um nome padr�o
		
		Aluno aluno4 = new Aluno("Kamilly", 20); // Vem com um novo padr�o igual criado na classe.
		
		
	}
}
