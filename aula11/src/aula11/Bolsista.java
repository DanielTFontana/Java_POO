package aula11;

public class Bolsista extends Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Bolsa renovada");
	}
	
	@Override
	public void pagarMesalidade() {
		System.out.println("Desconto de bolsista aplicado");
	}

	@Override
	public String toString() {
		return "Bolsista [bolsa=" + bolsa + "]";
	}
	
}
