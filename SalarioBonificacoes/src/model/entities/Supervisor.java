package model.entities;

public class Supervisor extends Funcionario {
	
	public Supervisor() {
	}
	
	public Double bonificacao() {
		return getSalario() + 5000;
	}
	
	@Override
	public String toString() {
		return "Supervisor - R$ " + bonificacao();
	}
}
