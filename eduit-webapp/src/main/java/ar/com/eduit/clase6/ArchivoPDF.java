package ar.com.eduit.clase6;

public class ArchivoPDF extends ArchivoBase implements IConvertible {

	@Override
	public String convertir() {
		// TODO Auto-generated method stub
		return this.nombre + ".pdf";
	}

}
