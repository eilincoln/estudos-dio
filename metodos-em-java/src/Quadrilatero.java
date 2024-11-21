public class Quadrilatero {
    public static void main(String[] args) {
        // main
        System.out.println("Exercício quadrilátero");
        area(10);
        area(10, 20);
        area(10, 5, 20);
    }

    // parte para métodos.

    /*
     * Exemplos de sobrecarga para métodos.
     * Usando sempre o mesmo nome e mudando os parâmetros. Quando isso acontece, muda a assinatura.
     * Lembrando que não é só o nome que faz mudar. É o tipo de dado e quantidade parâmetros.
    */
    public static void area(double lado){
        System.out.println("Área do quadrado: " + lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

}
