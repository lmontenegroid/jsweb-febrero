package ar.com.eduit.parsers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivosMain {

	public static void main(String[] args) {

		// ctrl+shift+i para recompilar el codigo en ejecución
		String path = "c:\\data\\productos.csv";

		// File
		File nuevosProductos = new File(path); // crea el puente al archivo

		boolean existe = nuevosProductos.exists(); // si existe el archivo

		if (existe) {
			// abrir
			boolean isFile = nuevosProductos.isFile(); // chequea que sea un archivo

			if (isFile) {

				try {
					FileReader fileReader = new FileReader(nuevosProductos);// lector de files

					int unCaracter;

					// leer (el read recorre char a char hasta que no tenga mas)
					while ((unCaracter = fileReader.read()) != -1) {
						// mientras existan datos

						System.out.print((char) unCaracter); // imprimo caracter a caracter
					}
					fileReader.close();
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				} catch (IOException e) {
				}

				// segui leyendo
				
			} else {
				System.err.println("No es un archivo conocido");
			}
			
		}else {
			System.err.println("No existe el archivo");
		}
		
	}
}
