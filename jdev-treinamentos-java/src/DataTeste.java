import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Data primeiraData = new Data();
		primeiraData.dia = entrada.nextInt();
		primeiraData.mes = entrada.nextInt();
		primeiraData.ano = entrada.nextInt();
		
		Data segundaData = new Data();
		segundaData.dia = entrada.nextInt();
		segundaData.mes = entrada.nextInt();
		segundaData.ano = entrada.nextInt();
		
		System.out.printf("A primeira data: %d/%d/%d", primeiraData.dia, primeiraData.mes, primeiraData.ano);
		System.out.printf("A segunda data: %d/%d/%d", segundaData.dia, segundaData.mes, segundaData.ano);
		
		entrada.close();
	}
}
