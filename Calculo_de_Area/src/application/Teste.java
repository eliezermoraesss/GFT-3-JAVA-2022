package application;

import java.util.Locale;
import java.util.Scanner;

import model.Circulo;
import model.MinhaExcecao;
import model.Quadrado;
import model.Retangulo;

public class Teste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Selecione a geometria que deseja calcular a área");
			System.out.print("Digite 'q' para quadrado, 'r' para retângulo e 'c' para círculo: ");
			char ch = sc.next().charAt(0);

			if (ch == 'q') {
				System.out.println("Digite o lado 1: ");
				double lado1 = sc.nextDouble();
				System.out.println("Digite o lado 2: ");
				double lado2 = sc.nextDouble();
				Quadrado quadrado = new Quadrado(lado1, lado2);
				System.out.println(quadrado);
			} else if (ch == 'r') {
				System.out.println("Digite a largura: ");
				double largura = sc.nextDouble();
				System.out.println("Digite a altura: ");
				double altura = sc.nextDouble();
				Retangulo retangulo = new Retangulo(largura, altura);
				System.out.println(retangulo);
			} else if (ch == 'c') {
				System.out.println("Digite o raio: ");
				double raio = sc.nextDouble();
				Circulo circulo = new Circulo(raio);
				System.out.println(circulo);
			} else {
				System.out.println("Seleção inválida!");
			}

		} catch (MinhaExcecao e) {
			System.out.println("Erro inesperado!");
		} finally {
			sc.close();
		}
	}
}
