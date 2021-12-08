package ar.com.eduit.clase5.exceptions;

public class Calculadora {

	//Atributo
	private int valor1;
	private int valor2;
	private int resultado;
	
	//Constructor
	public Calculadora(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	//Getters y Setters
	public int getValor1() {
		return valor1;
	}


	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}


	public int getValor2() {
		return valor2;
	}


	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public int getResultado() {
		return resultado;
	}
	
	//Método con excepción 
	public void dividir() throws MiException, LogException{
		if(this.valor1 == 0) {
			LogException le = new LogException("No se puede calcular un log negativo");
			throw le;
		}
		
		
		if(this.valor2 != 0) {
			this.resultado = valor1 / valor2;
		}else {
			//Creo MiException con un mensaje
			MiException checkedException = new MiException("No se puede dividir por cero");
			//Lanzar
			throw checkedException;
		}
	}
}
