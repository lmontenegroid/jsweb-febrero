package ar.com.eduit.clase3;

public class Articulo {
	
	//Atributos
	protected String titulo;
	protected String autor;
	protected Float precio;
	protected String imagen;
	
	public static String TIPO = "articulo";
	
	
	//Constructores
	public Articulo(String titulo, Float precio, String autor) {
		this.titulo = titulo;
		this.precio = precio;
		this.autor = autor;
	}
	
	public Articulo(String titulo, Float precio) {
		this.titulo = titulo;
		this.precio = precio;
	}

	

	//Gets n Sets
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
		
	public void informar(){
		System.out.println("Título: " +this.titulo);
		if(this.autor != null)
			System.out.println("Autor: "+this.autor);
		
		System.out.println("Precio: " +this.precio);
		
	}
}
