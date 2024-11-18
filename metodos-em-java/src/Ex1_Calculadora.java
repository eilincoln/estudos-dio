public class Ex1_Calculadora {

    public static void main(String[] args) {
        // Chamando o método somar e passando dois valores de exemplo
        somar(5.5, 3.3);
        subtrair(10, 5);
    }

    /*
     * Lembrar que não posso criar métodos dentro do método "main". O JAVA não aceita isso.
    */
    public static void somar(double numero1, double numero2) {
        double soma = numero1 + numero2;
        System.out.printf("A soma de %.2f + %.2f é: %.2f%n", numero1, numero2, soma);
    }
    public static void subtrair(int n1, int n2){
        int subtrair = n1 - n2;
        System.out.printf("A subtração de %d - %d = %d", n1, n2, subtrair);
    }
}
