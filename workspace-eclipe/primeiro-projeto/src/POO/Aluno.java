package POO;

//Minha primeira classe/objeto que representa um aluno.
public class Aluno {

		/*
		 * Esses s�o os atributos da classe.
		 * */
		String nome;
		int idade;
		String dataNascimneto;
		String registroGeral;
		String numeroCpf;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String nomeEscola;
		String serieMatriculado;
		

		public Aluno() {/*Isso � feito sozinho quando eu crio um aluno l� fora da classe*/
			// TODO Auto-generated constructor stub
		}
		
		public Aluno(String nomePadrao) {
			nome = nomePadrao;
		}
		
		public Aluno(String nomePadrao, int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}
}
