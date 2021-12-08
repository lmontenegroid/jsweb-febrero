package ar.com.eduit.clase5;

//PADRE DE RECTANGULO
//ABUELO DE CUADRADO
public abstract class Figura {
	
	protected Float area;
	
	//con esto obliga a las clases hijas a definir si o si la logica de calculo
	public abstract void calcularArea();
		
	
	//getters y setters
	public Float getArea() {
		return this.area;
	}
	
	public void setArea(Float area) {
		this.area = area;
	}
	
	
	public void informarArea() {
		//mostrar el area de la figura
		System.out.println("Area: " + this.area);
	}

}
