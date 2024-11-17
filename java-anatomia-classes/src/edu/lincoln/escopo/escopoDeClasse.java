package edu.lincoln.escopo;

public class escopoDeClasse {
    // Escopo de variável de classe (ou variável de instância)
    // Esta variável é acessível em toda a classe.
    private static int variavelClasse = 10;
 
    public static void main(String[] args) {
        // Escopo de variável local (dentro do método main)
        // Esta variável existe apenas dentro deste método.
        int variavelLocal = 20;

        // Exibe o valor da variável de classe e da variável local
        System.out.println("Variável de classe: " + variavelClasse);
        System.out.println("Variável local: " + variavelLocal);

        // Chamada para um método que cria uma variável com escopo de bloco
        exibirEscopoBloco();
    }

    public static void exibirEscopoBloco() {
        // Variável com escopo de bloco, declarada dentro do bloco 'for'
        for (int i = 0; i < 5; i++) {
            int variavelBloco = i * 2;
            System.out.println("Variável de bloco dentro do loop: " + variavelBloco);
        }
        // 'variavelBloco' não é acessível aqui fora do bloco 'for'
        // System.out.println(variavelBloco); // Isto causaria um erro de compilação
    }
}