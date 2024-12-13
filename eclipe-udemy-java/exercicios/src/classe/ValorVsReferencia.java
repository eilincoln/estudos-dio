package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		//Atribuição por valor.
		double a = 2;
		double b = a;
		
		a++;
		b--;
		System.out.println(a + " - " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribuição por referência. (Como eu trabalho com objeto é por referência mesmo.)
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.formatarData());
		System.out.println(d2.formatarData());
		
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.formatarData());
		System.out.println(d2.formatarData());
		/*
		 * Por estar como uma referência vai mudar os dois e isso vai ficar duplicado.
		 * 
		 * */
		
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao (Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
