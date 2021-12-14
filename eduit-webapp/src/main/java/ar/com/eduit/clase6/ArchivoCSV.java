package ar.com.eduit.clase6;

public class ArchivoCSV extends ArchivoBase implements IConvertible {

	@Override
	public String convertir() {
		//Titulo; otro titulo; etc..
		//abc; cde; etc...
		
		StringBuffer csv = new StringBuffer();
		csv.append("titulo;").append("\n");
		csv.append(this.nombre);
		
		String resultado = csv.toString();
		return resultado;
	}

}
