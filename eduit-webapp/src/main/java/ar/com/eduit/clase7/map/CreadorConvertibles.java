package ar.com.eduit.clase7.map;

import java.util.Map;
import java.util.TreeMap;

import ar.com.eduit.clase6.ArchivoCSV;
import ar.com.eduit.clase6.ArchivoPDF;
import ar.com.eduit.clase6.ArchivoXLS;
import ar.com.eduit.clase6.Formato;
import ar.com.eduit.clase6.IConvertible;

public class CreadorConvertibles {

	public static Map<Formato, IConvertible> construirConvertibles() {
		
		
		// crear un map Formato/ Interfaces i = new Class();
		Map<Formato, IConvertible> map = new TreeMap<>(new FormatoComparatorPorOrdinal());

		map.put(Formato.CSV, new ArchivoCSV());

		map.put(Formato.PDF, new ArchivoPDF());

		map.put(Formato.XLS, new ArchivoXLS());
		
		return map;
	}
}
