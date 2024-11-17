import java.util.Scanner;

public class Ex1_nomeEIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        @SuppressWarnings("unused")
        int idade;
        do{
            System.out.print("Nome: ");
            nome = entrada.next();

            System.out.print("Idade: ");
            idade = entrada.nextInt();
        } while ((nome == "0"));

        entrada.close();
    }
}