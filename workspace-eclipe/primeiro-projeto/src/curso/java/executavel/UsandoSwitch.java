package curso.java.executavel;

public class UsandoSwitch {
	public static void main(String[] args) {
		// Exemplo: Seleção de uma fruta com base em um número
        int opcao = 2; // Pode alterar esse valor para testar outros casos

        System.out.println("Escolha uma fruta:");

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Maçã.");
                break;
            case 2:
                System.out.println("Você escolheu Banana.");
                break;
            case 3:
                System.out.println("Você escolheu Laranja.");
                break;
            default:
                System.out.println("Opção inválida. Escolha entre 1, 2 ou 3.");
                break;
        }
	}
}
