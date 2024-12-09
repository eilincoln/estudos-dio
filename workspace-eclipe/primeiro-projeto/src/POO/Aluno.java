package POO;

//Minha primeira classe/objeto que representa um aluno.
public class Aluno {

		/*
		 * Esses são os atributos da classe.
		 * */
		public String nome;
		public int idade;
		public String dataNascimneto;
		public String registroGeral;
		public String numeroCpf;
		public String nomeMae;
		public String nomePai;
		public String dataMatricula;
		public String nomeEscola;
		public String serieMatriculado;
		

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

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getDataNascimneto() {
			return dataNascimneto;
		}

		public void setDataNascimneto(String dataNascimneto) {
			this.dataNascimneto = dataNascimneto;
		}

		public String getRegistroGeral() {
			return registroGeral;
		}

		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}

		public String getNumeroCpf() {
			return numeroCpf;
		}

		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}

		public String getDataMatricula() {
			return dataMatricula;
		}

		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		public String getNomeEscola() {
			return nomeEscola;
		}

		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}

		public String getSerieMatriculado() {
			return serieMatriculado;
		}

		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}
		
		
		/*Método SETTERS e GETTERS*/
		// -> SET adiciona
		// -> GET pega essa info
		
		
		
		
		
		
}
