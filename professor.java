package heranca_aula10;

public class professor extends Pessoa {
 private String especialidade;
 private float salario;
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}
public float getSalario() {
	return salario;
}
public void setSalario(float salario) {
	this.salario = salario;
}
 
 public void receberAumento(float salario) {
	 this.setSalario(this.getSalario() + salario);
 }
}
