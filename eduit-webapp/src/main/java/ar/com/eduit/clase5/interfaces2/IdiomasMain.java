package ar.com.eduit.clase5.interfaces2;

public class IdiomasMain {

	public static void main(String[] args) {

		Persona[] personas = crearPersonas();

		for(Persona alguien : personas) {
			
			alguien.hablar("clase5 jsweb");
		}
		
		System.out.println("Fin");
		
	}

	public static Persona[] crearPersonas() {
		// crear el idioma
		Espanol ie = new Espanol();

		// Persona juan = new Persona(); --> no porque Persona es abstracto
		Persona maria = new Mujer("JUAN", "PEREZ", "generoX", ie);
		
		maria.aprender(new Ingles());

		Chino chino = new Chino();
		Mujer juan2 = new Mujer("JUAN", "PEREZ", "generoX", chino);
		
		Persona[] personas = new Persona[] {maria, juan2};
		
		return personas;
	}

}
