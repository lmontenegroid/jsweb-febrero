package ar.com.eduit.clase6;

public class ArchivoXLS extends ArchivoBase implements IConvertible {

	@Override
	public String convertir() {
		// TODO Auto-generated method stub
		return this.nombre + ".xls";
	}

}
