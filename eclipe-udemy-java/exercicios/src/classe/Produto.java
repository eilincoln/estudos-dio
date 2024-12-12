package classe;

public class Produto {
	
	//atributos da minha classe
	String nome;
	double preco;
	double desconto;
	
	Produto(){
		
	}
	
	//Contrutor para poder iniciar o meu objeto
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);	
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
}
