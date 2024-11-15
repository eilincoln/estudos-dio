package edu.lincoln.metodos;
/* 
 * -> O nome deve sempre ser em verbo
 * -> Usar o estilo camelCase
 * -> Não fazer duas coisas ao mesmo tempo no método, faça sempre somente uma.
 * -> Métodos devem sempre ser feitos dentro de uma classe, não exite global.
 * */
public class aula1 {
    public static void main(String[] args) {
        //Exercicio SmartTV
        // Aqui é meu usuário

        SmartTv smartTv = new SmartTv();

        //Ligando e desligando
        smartTv.ligar();
        smartTv.desligar();
        smartTv.ligar();

        //Aumentando e baixando o volume da TV
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        // Trocando de canal
        smartTv.mudarCanal(55);
        smartTv.sumirCanal();
        smartTv.descerCanal();

        //Separação
        System.out.println("-------------------------------------------");
        System.out.println("A TV está ligada: " + smartTv.ligada);
        System.out.println("O canal da TV Atualmente: " + smartTv.canal);
        System.out.println("O volume da TV Atualmente: " + smartTv.volume);
    }
}
