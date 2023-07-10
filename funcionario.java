package heranca_aula10;

public class funcionario extends Pessoa {
	private String setor;
	private String funcao;
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public void trocarSetor() {
		this.setSetor(setor);
	}
}
