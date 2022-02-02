package model.entities;

public class Vendedor extends Funcionario {
	
	public Vendedor() {
	}
	
	public Double bonificacao() {
		return getSalario() + 3000;
	}
	
	@Override
	public String toString() {
		return "Vendedor - R$ " + bonificacao();
	}
}
