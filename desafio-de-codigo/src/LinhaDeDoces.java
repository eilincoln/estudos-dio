import java.util.Scanner;

public class LinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        
        //Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        
        int retornoDoces = dinheiro * 2;
        
        System.out.println("O cliente obteve " + retornoDoces + " doces");
        
        leitor.close();
    }
}
