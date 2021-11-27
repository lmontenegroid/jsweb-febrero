package ar.com.eduit.clase3;

public class Musica extends Articulo{

	//Atributo
	private String[] temas;
	private String selloDiscografico;
	
	
	//Constructores heredados
	public Musica(String titulo, Float precio, String autor,String temas[], String selloDiscografico ) {
		
		//primero nace el padre
		super(titulo, precio, autor);
		
		//luego el hijo
		this.temas = temas;
		this.selloDiscografico = selloDiscografico;
		
	}

	// Gets n sets
	public String[] getTemas() {
		return temas;
	}

	public void setTemas(String[] temas) {
		this.temas = temas;
	}

	public String getSelloDiscografico() {
		return selloDiscografico;
	}

	public void setSelloDiscografico(String selloDiscografico) {
		this.selloDiscografico = selloDiscografico;
	}
	

	//cambia el comportamiento del padre
	public void informar() {
		super.informar();
		if(this.temas != null) {
			System.out.println("Lista de temas");
			int numero = 1;
			for(String tema : temas) {
				System.out.println((numero++) + "- "+tema);
			}
		}
		System.out.println("Sello Discográfico: " +this.selloDiscografico);
	}
	
	
}
