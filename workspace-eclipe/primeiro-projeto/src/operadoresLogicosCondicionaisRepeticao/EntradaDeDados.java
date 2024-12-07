package operadoresLogicosCondicionaisRepeticao;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoasNumero);
		double resto = carroNumero % pessoasNumero;
		
		System.out.println("Divisão para pessoas deu " + divisao + " carros e sobrou " + 
				resto + " carro(s)");
	}
}
