package curso.java.executavel;

public class OperacoesLogicas {
	public static void main(String[] args) {
		
		int mediaAluno = 90;
		String nome = "Alex";
		
		if(mediaAluno >= 70 && nome.equals("Carlos")) {
			System.out.println("APROVADO");
		} else if (mediaAluno < 70){
			System.out.println("REPROVADO");
		} else {
			System.out.println("Aluno não encontrado");
		}
		
		 
	}
}
