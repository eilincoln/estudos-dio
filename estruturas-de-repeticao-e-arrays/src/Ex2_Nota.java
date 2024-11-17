import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("A nota do aluno é: " + nota);
        scanner.close();
    }
}
