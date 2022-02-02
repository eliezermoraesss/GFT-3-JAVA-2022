package model;

import model.util.AreaCalculavel;

public class Retangulo implements AreaCalculavel {
	
	private Double largura;
	private Double altura;
	
	public Retangulo() {
	}

	public Retangulo(Double largura, Double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "A área do retângulo é " + String.format("%.2f", area()) + ".";
	}

	@Override
	public double area() {
		return largura * altura;
	}
}
