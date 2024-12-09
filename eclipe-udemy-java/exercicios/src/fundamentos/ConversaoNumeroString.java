package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println("Quantos numeros tem: " + num1.toString().length());
		
		int num2 = 100000;
		System.out.println("Quantos tem no int: " + Integer.toString(num2).length());
		
	}
}
