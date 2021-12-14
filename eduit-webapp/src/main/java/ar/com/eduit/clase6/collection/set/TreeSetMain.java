package ar.com.eduit.clase6.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain  {

	public static void main(String[] args) {

		Set<String> edades = new TreeSet<>();
		
		edades.add("50");
		edades.add("30");
		edades.add("60");
		
		for (String edad : edades) {
			System.out.println(edad);
		}

		
		//
		Set<Alumno> alumnos = new TreeSet<>();
		alumnos.add(new Alumno(75l, "Exequiel"));
		alumnos.add(new Alumno(15l, "Federico"));
		alumnos.add(new Alumno(50l, "Lucas"));
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getId());
			System.out.println(alumno.getNombre());
			
		}
	}

}
