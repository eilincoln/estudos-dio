package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Lincoln Berto";
		compra1.adicionarItem(new Item("Caneta", 20, 7.45));
		compra1.adicionarItem(new Item("Caderno", 12, 3.89));
		compra1.adicionarItem(new Item("Caneta", 3, 18.79));
		compra1.adicionarItem("Lapis", 2, 2.40);
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		// Isso aqui é só para mostrar a relação bidirecional!!!!!!!!!!!!
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O valor total: R$" + total);
	}
}
