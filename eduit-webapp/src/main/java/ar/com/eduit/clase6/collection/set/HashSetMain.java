package ar.com.eduit.clase6.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ar.com.eduit.clase6.ArchivoCSV;
import ar.com.eduit.clase6.ArchivoPDF;
import ar.com.eduit.clase6.ArchivoXLS;
import ar.com.eduit.clase6.IConvertible;

public class HashSetMain {

	public static void main(String[] args) {
		//Crear: no mantienen un orden
		Set<Integer> edades = new HashSet<Integer>();
		
		//Agregar elementos al set(Hashset)
		edades.add(10);
		edades.add(20);
		
		//Cantidad de elementos guardados en el set
		int cantidad = edades.size();
		
		
		//Recorro
		for(Integer edad: edades) {
			System.out.println(edad);
		}
		
		//-----
		Set<IConvertible> convertibles = new HashSet<IConvertible>();
		IConvertible p = new ArchivoPDF();
		
		//Agregar
		convertibles.add(p);
		
		p = new ArchivoCSV();
		convertibles.add(p);
		
		p = new ArchivoXLS();
		convertibles.add(p);
		
		//recorrer e ir eliminando elementos
		Iterator<IConvertible> itIConvertible = convertibles.iterator();
		while(itIConvertible.hasNext()) {
			IConvertible convertibleParticular = itIConvertible.next();
			String resultado = convertibleParticular.convertir();
			System.out.println(resultado);
			
			itIConvertible.remove();
		}
		
		
	}
}
