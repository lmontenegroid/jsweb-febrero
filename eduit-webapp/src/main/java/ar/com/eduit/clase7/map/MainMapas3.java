package ar.com.eduit.clase7.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainMapas3 {

	public static void main(String[] args) {

		// crear un mapa
		// Interfaces i = new Class();
		Map<Integer, String> diaSemana = new TreeMap<>();

		// cargar una clave - valor
		diaSemana.put(1, "Lunes");
		diaSemana.put(2, "Martes");
		diaSemana.put(3, "Miercoles");
		diaSemana.put(7, "Domingo");
		diaSemana.put(4, "Jueves");
		diaSemana.put(5, "Viernes");
		diaSemana.put(6, "Sabado");
		

		// obtengo todas las claves del mapa
		Set<Integer> keys = diaSemana.keySet();
		System.out.println("Claves del mapa");
		for (Integer key : keys) {
			System.out.println(key);
		}

		// obtener todos los valores
		Collection<String> values = diaSemana.values();
		System.out.println("Valores del mapa");
		System.out.println(values);

		// sabiendo las claves (keySet) obtengo los valores
		System.out.println("sabiendo las claves (keySet) obtengo los valores");
		for (Integer key : keys) {
			String value = diaSemana.get(key);
			System.out.println("Key: " + key + "=" + value);
		}

		// EntrySet
		Set<Map.Entry<Integer, String>> entries = diaSemana.entrySet();

		// for
		for (Map.Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + "=" + value);
		}
	}

}
