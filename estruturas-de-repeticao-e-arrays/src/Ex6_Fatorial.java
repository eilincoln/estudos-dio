import java.util.Scanner;

public class Ex6_Fatorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numeroFatorial = entrada.nextInt();

        System.out.printf("Fatorial de %d! é: %d",numeroFatorial, fatorial(numeroFatorial));
    
        entrada.close();
    }

    public static int fatorial(int n){
        if(n == 0){
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
