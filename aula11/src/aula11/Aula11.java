package aula11;

public class Aula11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitante v1 = new Visitante();
		v1.setIdade(30);
		v1.setNome("Daniel");
		v1.setSexo("M");
		
		System.out.println(v1.toString());
		
		//
		
		Aluno a1 = new Aluno();
		a1.setMatricula("12344");
		a1.setCurso("T.I");
		a1.setNome("Daniel");
		System.out.println(a1.toString());
		
		//
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Aderbal");
		b1.setCurso("Gemologia");
		b1.pagarMesalidade();
		System.out.println(b1.toString());
		
	}

}
