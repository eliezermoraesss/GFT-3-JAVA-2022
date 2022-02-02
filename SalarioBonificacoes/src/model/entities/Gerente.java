package model.entities;

public class Gerente extends Funcionario {
	
	public Gerente() {
	}
	
	public Double bonificacao() {
		return getSalario() + 10000;
	}

	@Override
	public String toString() {
		return "Gerente - R$ " + bonificacao();
	}
}
