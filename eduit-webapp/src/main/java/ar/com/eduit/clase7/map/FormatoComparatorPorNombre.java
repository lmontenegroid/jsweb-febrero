package ar.com.eduit.clase7.map;

import java.util.Comparator;

import ar.com.eduit.clase6.Formato;

public class FormatoComparatorPorNombre implements Comparator<Formato> {

	@Override
	public int compare(Formato o1, Formato o2) {

		return o1.name().compareTo(o2.name());

		
	}
	

}
