package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String formatarData() {
		String dataFormatada = dia + "/" + mes + "/" + ano;
		return dataFormatada;
	}
}
