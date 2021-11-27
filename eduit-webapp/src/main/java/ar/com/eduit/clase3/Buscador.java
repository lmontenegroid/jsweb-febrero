package ar.com.eduit.clase3;

public class Buscador {
	
	//Atributos
	private String claveBusqueda;
	private Articulo[] resultados;
	private Integer total;
	
	// no se va a poder modificar la forma de buscar 
	public final void buscar() {
		
		//SIMULAR la busqueda en la db, excel, nube, etc
		
		//LIBRO
		//padre p = new hijo
		Articulo resultado1 = new Libro("Tony Stark ART..", 760f, "SLOT, DANN", "0598765");
		//PELICULA
		Articulo resultado2 = new Pelicula("EL INVENCIBLE IRON MAN", 1325f, "BENDIS BRIAN MICHAEL", "THE WALT", "Marvel blablabla");
		//PASATIEMPO
		Articulo resultado3 = new Pasatiempo("IRON MAN 15 CM", 1171.99f, "" ,"hasbro");
		//musica
		String[] temas = new String[] {"Thunderstruck", "Back in black"}; 
		Articulo resultado4 = new Musica("IRON MAN 2 (STANDARD)", 1033f, "ac/dc", temas,"Sony music");
		
		
		// VECTORES, ARRAY
		this.resultados = new Articulo[4];
		
		this.resultados[0] = resultado1;
		this.resultados[1] = resultado2;
		this.resultados[2] = resultado3;
		this.resultados[3] = resultado4;
		
		
		this.total = this.resultados.length;
		
	}
	
	
	//Gets n Sets
	public String getClaveBusqueda() {
		return claveBusqueda;
	}
	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
	public Articulo[] getResultados() {
		return resultados;
	}
	
	public Integer getTotal() {
		if(this.total == null) {
			this.total = 0;
		}
		return this.total;
			
	}
	
	
}
