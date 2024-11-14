package edu.lincoln.operadores;

public class relacionais {
    public static void main(String[] args) {
        String nomeUm = "Lincoln";
        String nomeDois = "Lincoln";

        if (nomeUm == nomeDois) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        
        
        int numero1 = 1;
        int numero2 = 1;

        if (numero1 == numero2) 
            System.out.println("Numero 1 é igual ao 2");

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");
        }
}
