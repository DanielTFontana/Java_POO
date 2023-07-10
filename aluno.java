package heranca_aula10;

public class aluno extends Pessoa {
	private boolean matricula;
	private String curso;
	
	
	
	public boolean isMatricula() {
		return matricula;
	}



	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public void cancMatric() {
		this.setMatricula(false);
	}
}
