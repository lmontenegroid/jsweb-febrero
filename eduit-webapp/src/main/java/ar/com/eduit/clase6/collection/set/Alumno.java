package ar.com.eduit.clase6.collection.set;

public class Alumno implements Comparable<Alumno>{
	
	
	private Long id;
	private String nombre;
	

	public Alumno(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int compareTo(Alumno otro) {
		return this.id.compareTo(otro.getId());
	}
	
	
	
}
