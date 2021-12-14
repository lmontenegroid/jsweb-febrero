package ar.com.eduit.clase6;


public class MainConvertible {

	
	public static void Main(String[] args) {
		

		String nombre = "Ventas 2021";
		
		String formatoUsuario = "PDF";
		
		Formato formatoValido = Formato.getFormatoByString(formatoUsuario);
		
		if(formatoValido != null) {
			System.out.println(formatoUsuario + " existe como enum");
		}else {
			System.err.println(formatoUsuario + " no es válido");
		}
	
		IConvertible p;
		if(Formato.PDF.equals(formatoValido)) {
			//crear la clase que convierte a PDF
			p = new ArchivoPDF();
		}else if(Formato.CSV.equals(formatoValido)){
			//crear la clase que convierte a CSV
			p = new ArchivoCSV();
		}else{
			//crear la clase que convierte a XLS
			p = new ArchivoXLS();
		}
		
		//up casting
		((ArchivoBase)p).setNombre(nombre);
		
		
	
		String resultado = ((IConvertible)p).convertir();	
		System.out.println(resultado);
	}
	
}
