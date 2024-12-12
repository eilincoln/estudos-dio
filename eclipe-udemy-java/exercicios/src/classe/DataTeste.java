package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data primeiraData = new Data();
		primeiraData.dia = 06;
		primeiraData.mes = 07;
		primeiraData.ano = 1998;
		
		Data segundaData = new Data();
		segundaData.dia = 04;
		segundaData.mes = 02;
		segundaData.ano = 2022;
		
		System.out.println("A primeira data: " + primeiraData.formatarData());
		System.out.println("A segunda data: " + segundaData.formatarData());
		
		Data diaTeste = new Data();
		System.out.println(diaTeste.formatarData());
		
		Data diateste2 = new Data(06, 07, 1997);
		System.out.println("O dia do meu niver é: " + diateste2.formatarData());
	}
}
