package curso.java.executavel;

public class UsandoSwitch {
	public static void main(String[] args) {
		// Exemplo: Sele��o de uma fruta com base em um n�mero
        int opcao = 2; // Pode alterar esse valor para testar outros casos

        System.out.println("Escolha uma fruta:");

        switch (opcao) {
            case 1:
                System.out.println("Voc� escolheu Ma��.");
                break;
            case 2:
                System.out.println("Voc� escolheu Banana.");
                break;
            case 3:
                System.out.println("Voc� escolheu Laranja.");
                break;
            default:
                System.out.println("Op��o inv�lida. Escolha entre 1, 2 ou 3.");
                break;
        }
	}
}
