package POO;

public class ClasseParaObjeto {
	public static void main(String[] args) {
		
		
		//Isso s�o construtores de objetos
		//Aqui � uma instancia (uma cria��o de objeto)
		Aluno aluno1 = new Aluno(); //Construtores padr�es.
		aluno1.setNome("Karen da Silva");
		aluno1.setIdade(30);
		aluno1.setDataNascimneto("18/10/1987");
		aluno1.setRegistroGeral("36.756.789-10");
		aluno1.setNumeroCpf("454.564.891-23");
		aluno1.setNomeMae("Fabiana Semiano");
		aluno1.setNomePai("Dennis da Silva");
		aluno1.setDataMatricula("09/12/2024");
		aluno1.setNomeEscola("USF");
		aluno1.setSerieMatriculado("5");
		
		System.out.println("Nome �: " + aluno1.getNome());
		System.out.println();
		
		
		/*================================================================*/
		
		
		System.out.println("Nome do aluno: " + aluno1.getNome());
		
		
	  //Classe   referencia    instanciar para cria��o
		Aluno    aluno2 =      new Aluno();
		
		Aluno aluno3 = new Aluno("Lincoln"); //Esse aluno j� vem com um nome padr�o
		
		Aluno aluno4 = new Aluno("Kamilly", 20); // Vem com um novo padr�o igual criado na classe.
		
		
	}
}
