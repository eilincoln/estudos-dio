import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual número você quer saber a tabuada? ");
        int numeroTabuada = entrada.nextInt();
        
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", i, numeroTabuada, (numeroTabuada * i));
        }


        entrada.close();
    }
}
