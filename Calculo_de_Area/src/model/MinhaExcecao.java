package model;

//EXCEÇÃO PERSONALIZADA para evitar os erros que explodem de forma abrupta no console
public class MinhaExcecao extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public MinhaExcecao(String msg) {
		super(msg);
	}
}