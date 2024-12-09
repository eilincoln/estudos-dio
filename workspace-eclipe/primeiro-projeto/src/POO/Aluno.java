package POO;

//Minha primeira classe/objeto que representa um aluno.
public class Aluno {

		/*
		 * Esses são os atributos da classe.
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
		

		public Aluno() {/*Isso é feito sozinho quando eu crio um aluno lá fora da classe*/
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
