package ar.com.eduit.clase2;

import ar.com.eduit.clase3.Vehiculo;

public class Auto extends Vehiculo{

	//atributos
	String marca;
	private String modelo;
	Integer anio;
	Long chasis;
	String color;
	Float velocidad;
	Float velocidadMaxima;
	Float canidadCombustible;
	Boolean encendido;	//false o null
	
	//contructor/es
	public Auto() {
		velocidadMaxima = 220f;
		velocidad = 0f;
	}
	Auto(Float velocidadMaximaParametros  ) {
		velocidadMaxima = velocidadMaximaParametros;
		velocidad = 0f;
	}
	
	//m�todos
	void encender() {
		encendido = true;
	}
	void apagar() {
		encendido = Boolean.FALSE;
	}
	
	boolean puedeAcelerar() {
		return encendido && velocidad < velocidadMaxima && canidadCombustible > 0;
	}
	
	void acelerar() {
		//si est� vivo el atributo enendido y si es true
		/*if(Boolean.TRUE.equals(encendido)) {
			
			if(velocidad < velocidadMaxima) {
				
				if(canidadCombustible > 0) {				
					velocidad++;
					canidadCombustible--;
				}else {
					System.out.println("No hay mas combustible");					
				}
			}else {
				System.out.println("Ha llegado a la velocidad m�xima");
			}
		}else {
			System.out.println("Auto apagado, no es posible acelerar");
		}*/
		
		if(puedeAcelerar()) {
			velocidad++;
			canidadCombustible--;
		}
	}
	void frenar() {
		//velocidad = velocidad - 1;
		velocidad--;
	}
	void informar() {
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("A�o:" + anio);
		System.out.println("Chasis:" + chasis);
		System.out.println("Color:" + color);
		System.out.println("Combustible:" + canidadCombustible + " Litros");
		System.out.println("Encendido:" + encendido);
		System.out.println("Velocidad M�xima:" + velocidadMaxima);
		System.out.println("Velocidad:" + velocidad);
	}
	
	// GETTER/SETTER
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		if(marca != null) {
			this.marca = marca;
		}else
			System.out.println("No se registr� una marca");
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}

