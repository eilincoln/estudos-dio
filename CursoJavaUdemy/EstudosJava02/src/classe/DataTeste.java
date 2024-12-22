package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data nascimento = new Data(06, 07, 1998);
//		nascimento.dia = 19;
//		nascimento.mes = 11;
//		nascimento.ano = 1987;
		
		Data casamento = new Data();
		casamento.dia = 13;
		casamento.mes = 12;
		casamento.ano = 2027;
		
		System.out.println("Data do nascimento: " + nascimento.formatar());
		System.out.println("Data do casamento: " + casamento.formatar());
	}
}
