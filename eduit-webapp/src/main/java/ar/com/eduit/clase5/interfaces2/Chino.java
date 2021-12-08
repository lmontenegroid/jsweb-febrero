package ar.com.eduit.clase5.interfaces2;

public class Chino implements IIdioma {

	@Override
	public void hablar(String palabra) {
		System.out.println("Hablando en chino... " + palabra);
	}
}
