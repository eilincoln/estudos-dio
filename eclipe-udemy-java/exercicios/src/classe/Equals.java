package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Lincoln Berto", "lincoln.santos@usf.edu.br");
		Usuario u2 = new Usuario("Lincoln Berto", "lincoln.santos@usf.edu.br");
		
		System.out.println(u1 == u2); // false -> comparando endere�o de mem�ria
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		
	}
}
