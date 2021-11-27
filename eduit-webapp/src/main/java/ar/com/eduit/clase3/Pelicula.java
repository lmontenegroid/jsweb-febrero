package ar.com.eduit.clase3;

public class Pelicula extends Articulo{

	//Atributo
	private String productora;
	private String sinopsis;
	
	
	//Constructores heredados
	public Pelicula(String titulo, Float precio, String autor,String productora, String sinopsis ) {
		
		//primero nace el padre
		super(titulo, precio, autor);
		
		//luego el hijo
		this.productora = productora;
		this.sinopsis = sinopsis;
		
	}

	// Gets n sets
	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	

	//cambia el comportamiento del padre
	public void informar() {
		super.informar();
		System.out.println("Productora: " +this.productora);
		System.out.println("Sinopsis: " +this.sinopsis);
	}

	
	
}
