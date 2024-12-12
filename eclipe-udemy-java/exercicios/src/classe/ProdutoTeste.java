package classe; //dentro do pacote 

public class ProdutoTeste { // nome da classe 
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto(); // como criar um produto novo
		produto1.nome = "iPhone 15";
		produto1.preco = 1500.97;
		produto1.desconto = 0.25;

		
		Produto produto2 = new Produto();
		produto2.nome = "Notebook";
		produto2.preco = 4356.98;
		produto2.desconto = 0.50;
		
		
		System.out.println("O nome do produto 1 é: " + produto1.nome);
		System.out.println("O nome do produto 2 é: " + produto2.nome);
		
		double precoFinal1 = produto1.preco * (1 - produto1.desconto); 
		System.out.printf("Preço do produto 1 com desconto: %.2f\n", precoFinal1);
	}
}
