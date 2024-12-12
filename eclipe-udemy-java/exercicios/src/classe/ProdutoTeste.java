package classe; //dentro do pacote 

public class ProdutoTeste { // nome da classe 
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("iPhone 15", 1000.00, 0.25); // como criar um produto novo
//		produto1.nome = "iPhone 15";
//		produto1.preco = 1000.00;
//		produto1.desconto = 0.25;

		
		Produto produto2 = new Produto("Notebook", 4356.98, 0.50);
//		produto2.nome = "Notebook";
//		produto2.preco = 4356.98;
//		produto2.desconto = 0.50;
		
		
		System.out.println("O nome do produto 1 é: " + produto1.nome);
		System.out.println("O nome do produto 2 é: " + produto2.nome);
		
		double precoFinal1 = produto1.precoComDesconto();
		
		double precoFinalComDescontoGerente = produto1.precoComDesconto();
		System.out.println("Preço com o desconto do gerente: " + precoFinalComDescontoGerente);
		
		
		System.out.printf("Preço do produto 1 com desconto: %.2f\n", precoFinal1);
	}
}
