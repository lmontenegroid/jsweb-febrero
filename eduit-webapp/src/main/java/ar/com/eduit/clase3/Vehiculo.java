package ar.com.eduit.clase3;

public class Vehiculo {

	protected String marca;
	
	//contructor
	
	//m�todos/get/set
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		if(marca != null) {
			this.marca = marca;
		}else {
			System.out.println("La marca no puede ser NULL");
		}
	}
}
