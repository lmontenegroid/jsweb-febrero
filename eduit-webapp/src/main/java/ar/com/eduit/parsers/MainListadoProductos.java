package ar.com.eduit.parsers;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Collection;
import java.util.List;

import ar.com.eduit.domain.Producto;
import ar.com.eduit.service.ProductoService;
import ar.com.eduit.service.impl.ProductoServiceImpl;

public class MainListadoProductos {

	public static void main(String[] args) throws Exception {

		ProductoService ps = new ProductoServiceImpl();
		
		Collection<Producto> productos = ps.obtenerTodos();
		
		IFileParser fileParser = new CSVFileParser(null);
		
		List<String> lineas =  fileParser.parse(productos);
		
		String outPath = "c:/data/ext/";
		String fileName = "lineas.csv";
		
		File outputFile = new File(outPath);
		
		if(!outputFile.exists()) {
			Files.createDirectories(outputFile.toPath());
		}
		
		outputFile = new File(outPath + fileName);
		
		
		FileWriter fr = new FileWriter(outputFile);
		
		for (String linea : lineas) {
			fr.write(linea);
			System.out.println("ok");
		}
		
		fr.close();

	}

}
