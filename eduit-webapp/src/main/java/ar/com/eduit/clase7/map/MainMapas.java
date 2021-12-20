package ar.com.eduit.clase7.map;

import java.util.HashMap;
import java.util.Map;


public class MainMapas {

	public static void main(String[] args) {
		
		// crear un mapa
		// Interfaces i = new Class();
		Map<Integer, String> diaSemana = new HashMap<>();
		
		//cargar una clave - valor
		diaSemana.put(1, "Lunes");
		diaSemana.put(2, "Martes");
		diaSemana.put(3, "Miercoles");
		diaSemana.put(4, "Jueves");
		diaSemana.put(5, "Viernes");
		diaSemana.put(6, "Sabado");
		diaSemana.put(7, "Domingo");
		diaSemana.put(8, "Domingo"); //sobre escribo la clave del valor Domingo
		
		System.out.println(diaSemana);
		
		//eliminar un elemento
		diaSemana.remove(2);
		
		System.out.println(diaSemana);
		
		//obtener un valor dado su clave
		String dia = diaSemana.get(3);
		
		System.out.println("Key:" + 3 + " value: "+ dia);
		
		//remove por k y v
		diaSemana.remove(3, "Miercoles");
		
		System.out.println(diaSemana);
		
		//crear un mapa a partir de otro
		Map<Integer, String> otroMapa = new HashMap<>();
		otroMapa.putAll(diaSemana);
		
		System.out.println(otroMapa);
		

	}

}
