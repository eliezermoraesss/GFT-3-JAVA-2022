package model;

import model.util.AreaCalculavel;

public class Circulo implements AreaCalculavel {
	
	private static final Double PI = Math.PI;
	private Double raio;
	
	public Circulo() {
	}

	public Circulo(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "A área do círculo é " + String.format("%.2f", area()) + ".";
	}

	@Override
	public double area() {
		return PI * Math.pow(raio, 2);
	}
	
	
	
}
