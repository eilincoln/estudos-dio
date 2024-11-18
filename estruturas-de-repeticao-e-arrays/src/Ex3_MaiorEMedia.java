import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int coutnMedia = 0;
        
        int count = 0; //Variável contadora.
        do{
            System.out.print("Número: ");
            numero = scan.nextInt();
            if (numero > maior){
                maior = numero;
            }
            coutnMedia+= numero;
            count = count + 1; //Variável contadora.
        } while(count <= 4);

        System.out.println("Maior número: " + maior);
        System.out.println("Média é: " + (coutnMedia / count));

        scan.close();
    }
}
