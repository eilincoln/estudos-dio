public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        int inteiro1 = 10;
        int inteiro2 = 20;

        float numeroReal1 = 4.5f;
        float numeroReal2 = 3.5f;
        double numeroReal3 = 59.6d;

        char char1 = 'x';
        char char2 = 'y';

        String string1 = "Fulano";
        String string2 = "Fulano";
        String string3 = "Cicrano";

        boolean b1 = true;
        boolean b2 = false;

        long long1 = 1597L;
        long long2 = 89997L;

        byte y1 = 1;
        short h1 = 25;

        // Comparações com inteiros
        System.out.println("inteiro1 == inteiro2: " + (inteiro1 == inteiro2)); // false
        System.out.println("inteiro1 != inteiro2: " + (inteiro1 != inteiro2)); // true
        System.out.println("inteiro1 < inteiro2: " + (inteiro1 < inteiro2));   // true
        System.out.println("inteiro1 > inteiro2: " + (inteiro1 > inteiro2));   // false

        // Comparações com números reais
        System.out.println("numeroReal1 == numeroReal2: " + (numeroReal1 == numeroReal2)); // false
        System.out.println("numeroReal1 != numeroReal2: " + (numeroReal1 != numeroReal2)); // true
        System.out.println("numeroReal1 < numeroReal3: " + (numeroReal1 < numeroReal3));   // true
        System.out.println("numeroReal3 >= numeroReal2: " + (numeroReal3 >= numeroReal2)); // true

        // Comparações com caracteres
        System.out.println("char1 == char2: " + (char1 == char2)); // false
        System.out.println("char1 != char2: " + (char1 != char2)); // true
        System.out.println("char1 > char2: " + (char1 > char2));   // false, pois 'x' tem menor valor Unicode que 'y'

        // Comparações com Strings
        System.out.println("string1 == string2: " + (string1 == string2));       // true, pois referenciam o mesmo objeto
        System.out.println("string1.equals(string2): " + string1.equals(string2)); // true, verifica o conteúdo
        System.out.println("string1.equals(string3): " + string1.equals(string3)); // false

        // Comparações com booleanos
        System.out.println("b1 == b2: " + (b1 == b2)); // false
        System.out.println("b1 != b2: " + (b1 != b2)); // true

        // Comparações com longs
        System.out.println("long1 == long2: " + (long1 == long2)); // false
        System.out.println("long1 < long2: " + (long1 < long2));   // true
        System.out.println("long1 != long2: " + (long1 != long2)); // true

        // Comparações entre byte e short
        System.out.println("y1 == h1: " + (y1 == h1));   // false, pois 1 != 25
        System.out.println("y1 != h1: " + (y1 != h1));   // true
        System.out.println("y1 < h1: " + (y1 < h1));     // true

    }
}
