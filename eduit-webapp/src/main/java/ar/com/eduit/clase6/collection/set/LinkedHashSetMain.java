package ar.com.eduit.clase6.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {

	public static void main(String[] args) {

		// HashSet no mantiene el orden

		// crear
		Set<Integer> edades = new LinkedHashSet<Integer>();

		edades.add(10);
		edades.add(20);

		for (Integer edad : edades) {
			System.out.println(edad);
		}

	}

}
