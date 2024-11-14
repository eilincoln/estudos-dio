public class MinhaClasse {
    public static void main (String [] args) {
        System.out.println("Hello World");

        String nomeCarro = "Mercedes";

        int anoFabricacao = 2022;

        System.out.printf("O marca do carro é %s e seu ano de fabricação é %d \n", nomeCarro, anoFabricacao);

        //Usando o outro método que coloquei
        String primeiroNome = "Lincoln";
        String segundoNome = "Berto";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    // Outro método para testar
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
