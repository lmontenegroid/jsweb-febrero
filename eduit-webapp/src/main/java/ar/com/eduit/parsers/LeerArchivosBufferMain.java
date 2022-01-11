package ar.com.eduit.parsers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import ar.com.eduit.domain.Producto;

public class LeerArchivosBufferMain {

	public static void main(String[] args) {

		// ctrl+shift+i para recompilar el codigo en ejecución
		String path = "c:\\data\\productos.csv";

		// File
		File nuevosProductos = new File(path); // crea el puente al archivo

		boolean existe = nuevosProductos.exists(); // si existe el archivo

		
		Collection<Producto> productos = new ArrayList<Producto>();
		if (existe) {
			// abrir
			boolean isFile = nuevosProductos.isFile(); // chequea que sea un archivo

			if (isFile) {

				try {
					FileReader fileReader = new FileReader(nuevosProductos);// lector de files
					
					BufferedReader bufferReader = new BufferedReader(fileReader); // crea una manera mas linda de leer
					
					//Descarto la primer linea
					String unaLinea = bufferReader.readLine();
					System.out.println(unaLinea);
					
					// leer (el readLine recorre hasta el salto de linea)
					while ((unaLinea = bufferReader.readLine()) != null) {
						String[] datos = unaLinea.split(";");
						String titulo = datos[0];
						String precio = datos[1];
						String codigo = datos[2];
						String tipoProducto = datos[3];
						
						Producto producto = new Producto(titulo, Float.parseFloat(precio), unaLinea, Long.parseLong(tipoProducto));
						productos.add(producto);
						
					}
					fileReader.close();
					
					//Informar la lista de productos parseados del archivo
					for (Producto producto : productos) {
						System.out.println(producto);
					}
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
