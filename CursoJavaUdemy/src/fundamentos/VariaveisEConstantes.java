package fundamentos;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 4.1416;
		double area = PI * raio * raio;
		
		System.out.println("Área é " + area + "m².");
		System.out.printf("Área é %f m².", area);
		System.out.printf("Área é %.2f m².", area);
	}
}
