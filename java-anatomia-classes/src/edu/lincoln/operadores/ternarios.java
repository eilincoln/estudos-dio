package edu.lincoln.operadores;

public class ternarios {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 5;

        //Operador ternário! true OU false
        String resultado = a == b ? "VERDADEIRO" : "FALSO";

        int resultado2 = a == b ? 1 : 0;

        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
