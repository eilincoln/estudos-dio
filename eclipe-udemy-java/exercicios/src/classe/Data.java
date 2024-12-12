package classe;

public class Data {
	
	//caracteristicas
	int dia;
	int mes;
	int ano;
	
	//construtor
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial , int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	
	//método
	String formatarData() {
		String dataFormatada = dia + "/" + mes + "/" + ano;
		return dataFormatada;
	}
}
