package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data nascimento = new Data();
		nascimento.dia = 19;
		nascimento.mes = 11;
		nascimento.ano = 1987;
		
		System.out.printf(nascimento.formatar());
	}
}
