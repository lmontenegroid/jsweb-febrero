package ar.com.eduit.clase3;

public class Libro extends Articulo{

	//Atributo
	private String isbn; //atributos de instancia
	
	public static String TABLA = "TBL_LIBRO"; //atributos de clase
	
	
	//Constructores heredados
	public Libro(String titulo, Float precio, String autor,String isbn) {
		
		//primero nace el padre
		super(titulo, precio, autor);
		
		//luego el hijo
		this.isbn = isbn;
		
	}

	// Gets n sets
	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	//cambia el comportamiento del padre
	public void informar() {
		super.informar();
		System.out.println("ISBN: " +this.isbn);
	}
	
	
	
}
