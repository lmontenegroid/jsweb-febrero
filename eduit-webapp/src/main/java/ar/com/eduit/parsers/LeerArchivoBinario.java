package ar.com.eduit.parsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class LeerArchivoBinario {

	public static void main(String[] args) throws Exception {
		
		File sourceFile = new File("c:/data/btc.png");
		
		File outputFile = new File("c:/data/ext/btc.png");
		
		InputStream is = new FileInputStream(sourceFile);
		
		OutputStream os = new FileOutputStream(outputFile);
		
		
		//guardo los bytes parciales
		byte[] buffer = new byte[1024];
		
		
		//va a guardar lo que pudo leer
		int length;
		
		
		while((length = is.read(buffer)) > 0 ) {
			os.write(buffer, 0, length); //acá lo va trasladando
		}
		
		is.close();
		os.close();

	}

}
