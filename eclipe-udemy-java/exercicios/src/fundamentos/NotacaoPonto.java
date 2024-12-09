package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase().concat("!!!");
		
		System.out.println("Lincoln".concat(" Berto"));
		
		System.out.println(s);
	}
}
