
public class Aula011 {
	public static void main(String[] args) {
		/*Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setSexo("Masculino");
		System.out.println(v1.toString());*/
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudinei");
		a1.setMatricula(1111);
		a1.setCurso("ADS");
		a1.setIdade(21);
		a1.setSexo("Masculino");
		a1.pagarMensalidade();
		
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Hernesto Honesto");
		b1.setMatricula(1112);
		b1.setCurso("Direito");
		b1.setIdade(24);
		b1.setSexo("Masculino");
		b1.setBolsa(12.5f);
		b1.pagarMensalidade();
	}
}
