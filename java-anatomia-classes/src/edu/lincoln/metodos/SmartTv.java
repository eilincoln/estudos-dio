package edu.lincoln.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 3;
    int volume = 10;

    /*
     * Sempre lembrar que os métodos da classe vão dentro dela, e não fora.
     */

    // Ligar e desligar a TV.
    public void ligar(){
        ligada = true;
        System.out.println("A TV ligou!");
    }
    public void desligar(){
        ligada = false;
        System.out.println("A TV desligou!!");
    }

    // Parte de aumentar e diminuir o volume da TV.
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    //Parte para troca de canais
    public void sumirCanal(){
        canal++;
        System.out.println("Mudando de canal para: " + canal);
    }

    public void descerCanal(){
        canal--;
        System.out.println("mudando de canal para: " + canal);
    }

    public void mudarCanal(int numeroCanal){
        canal = numeroCanal;
        System.out.println("Mudando de canal para: " + canal);
    }
}
