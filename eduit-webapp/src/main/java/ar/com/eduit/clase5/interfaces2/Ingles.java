package ar.com.eduit.clase5.interfaces2;

public class Ingles implements IIdioma {

	@Override
	public void hablar(String palabra) {
		System.out.println("Hi " + palabra);
	}
}
