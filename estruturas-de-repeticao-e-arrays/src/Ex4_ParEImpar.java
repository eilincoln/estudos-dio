import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = 0; // Var que o usuário vai colocar a quantidade de vezes que ele quer que repita
        int numero = 0;
        int numerosImpares = 0;
        int numerosPares = 0;
        
        System.out.print("Quantas vezes o programa vai se repetir: ");
        n = entrada.nextInt();

        int count = 0; //Var contadora.
        do {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            if(numero % 2 == 0){
                numerosPares++;
            } else {
                numerosImpares++;
            }

            count++;
        } while(count <= n - 1);

        System.out.println("Quantidade de números ímpares: " + numerosImpares);
        System.out.println("Quantidade de números pares: " + numerosPares);

        entrada.close();
    }
}
