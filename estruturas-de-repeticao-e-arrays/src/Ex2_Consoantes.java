import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] consoantes = new String[6];
        @SuppressWarnings("unused")
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.print("Letra: ");
            String letra = entrada.next();

            // Aqui estou usando o "!" para negar, falando que se for alguma dessas letras eu não quero. Então vai dar false.
            if(!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))){
                    consoantes[count] = letra;
                    quantidadeConsoantes++;
            }

            count++;
        } while(count < consoantes.length);

        for (String elemento : consoantes) {
            if(elemento != null){
                System.out.printf("%s ", elemento);
            }
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

        entrada.close();
    }
}
