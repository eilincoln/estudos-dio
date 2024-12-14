package classe;

public class Data {
	
	//caracteristicas
	int dia;
	int mes;
	int ano;
	
	//construtor
	Data(){
		this(01, 01, 1970);
//		dia = 01;
//		mes = 01;
//		ano = 1970;
        //posso usar como um construtor dentro do this
		//só posso usar o this construtor dentro de outro construtor
	}
	Data(int dia , int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	//método
	String formatarData() {
		String dataFormatada = dia + "/" + mes + "/" + ano;
		return dataFormatada;
	}
}
