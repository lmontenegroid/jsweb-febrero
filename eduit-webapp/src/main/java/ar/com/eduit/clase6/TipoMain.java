package ar.com.eduit.clase6;

public class TipoMain {

	public static void main(String[] args) {
		
		// Quiero ver el nombre del enum
		Formato tpdf = Formato.PDF;
		
		TiposValidos tv = new TiposValidos();
		tv.mostrarValorEnum(tpdf);
		
		Formato tcsv = Formato.CSV;
		tv.mostrarValorEnum(tcsv);
		
		Formato txls = Formato.XLS;
		tv.mostrarValorEnum(txls);
		
		
		//Recorrer todos los valores del enum definido en Formato
		Formato[] tipos = Formato.values();
		
		for(Formato tipo : tipos) {
			tv.mostrarValorEnum(tipo);
		}
	}

}
