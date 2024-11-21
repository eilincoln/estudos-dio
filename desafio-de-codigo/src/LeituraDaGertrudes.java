import java.util.Scanner;

public class LeituraDaGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        //Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

        int diasParaFinalizar = paginas / paginasLidas;
        
        System.out.println(diasParaFinalizar + " dias");
        
        leitor.close();
    }
}
