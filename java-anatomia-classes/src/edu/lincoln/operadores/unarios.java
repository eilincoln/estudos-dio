package edu.lincoln.operadores;

public class unarios {
    public static void main(String[] args) {
    int numero = 5;
            
    //Imprimindo o numero negativo
    System.out.println(- numero);

    //incrementando numero em mais 1 numero, imprime 6
    //É para que não fique repetindo código, assim ajudando a otimizar os padrões.
    numero ++;
    System.out.println(numero);

    //incrementando numero em mais 1 numero, imprime 7
    System.out.println(numero ++);// ops algo de errado não está certo

    System.out.println(numero);// agora sim, numero virou 7

    //ordem de precedencia conta aqui
    System.out.println(++ numero);

    boolean verdadeiro = true;

    System.out.println("Inverteu " + !verdadeiro);
    }
}
