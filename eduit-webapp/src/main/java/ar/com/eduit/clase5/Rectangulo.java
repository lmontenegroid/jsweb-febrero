package ar.com.eduit.clase5;

//HIJO DE FIGURA 
//PADRE DE CUADRADO
public class Rectangulo extends Figura{

	private Float lado1;
	private Float lado2;
	
	//constructor
	public Rectangulo(Float lado1, Float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
	public void calcularArea() {
		setArea(lado1 * lado2);
	}
	
	//polimorfimos con redefinicion
	public void informarArea() {
		System.out.println("Calculando el area de un cuadrado de lado1=" +this.lado1+" y lado2="+this.lado2);
		//el padre tiene area como protected -> private
		System.out.println(getArea());
	}

	//get/set
	public Float getLado1() {
		return lado1;
	}

	public void setLado1(Float lado1) {
		this.lado1 = lado1;
	}

	public Float getLado2() {
		return lado2;
	}

	public void setLado2(Float lado2) {
		this.lado2 = lado2;
	}

}	
