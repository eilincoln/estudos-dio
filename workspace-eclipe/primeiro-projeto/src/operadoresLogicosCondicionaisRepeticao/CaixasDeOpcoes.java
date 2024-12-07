package operadoresLogicosCondicionaisRepeticao;

import javax.swing.JOptionPane;

public class CaixasDeOpcoes {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoasNumero);
		double resto = carroNumero % pessoasNumero;
		
		//System.out.println("Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carro(s)");
		
		int resposta = JOptionPane.showConfirmDialog(null, "deseja ver o resultado da divisão?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao para pessoas deu: " + divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "deseja ver o que sobra?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "sobrou: " + resto);
		}
	}
}
