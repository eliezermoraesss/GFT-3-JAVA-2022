package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Funcionario;
import model.entities.Gerente;
import model.entities.Supervisor;
import model.entities.Vendedor;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Eliezer");
		funcionario.setIdade(28);
		funcionario.setSalario(3500.00);
		Gerente gerente = new Gerente();
		Supervisor supervisor = new Supervisor();
		Vendedor vendedor = new Vendedor();
		
		System.out.println("Relatório de bonificações");
		System.out.println(gerente);
		System.out.println(supervisor);
		System.out.println(vendedor);

		sc.close();

	}
}
