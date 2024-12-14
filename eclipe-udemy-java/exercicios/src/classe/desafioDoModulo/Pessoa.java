package classe.desafioDoModulo;


public class Pessoa {
	public String nomePessoa;
	public double pesoPessoa;
	
	Pessoa (String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	void comer(Comida comida){
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
	}
}
