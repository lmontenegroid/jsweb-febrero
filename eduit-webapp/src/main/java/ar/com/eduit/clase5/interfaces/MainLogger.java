package ar.com.eduit.clase5.interfaces;

import java.util.Scanner;

public class MainLogger {

	public static void main(String[] args) {

		/*ConsoleLog cl = new ConsoleLog();
		
		EmailLogger el = new EmailLogger("alguien@gmail.com");
		
		FileSystemLog fl = new FileSystemLog();*/
		
		System.out.println("Ingrese un tipo de log "
				+ "1 - console"
				+ "2 - email "
				+ "3 - file system");
		Scanner teclado = new Scanner(System.in);
		
		Integer opcion = teclado.nextInt();

		ILogger logger;
		switch(opcion) {
		case 1:
			logger = new ConsoleLog();
			break;
		case 2:
			logger = new EmailLogger("alguien@gmail.com");
			break;
		case 3:
			logger = new FileSystemLog();
			break;
		default:
			logger = new ConsoleLog();
			break;
		}
		
		logger.log();
		logger = new EmailLogger("alguien@gmail.com");
		
		logger.log();
	}

}
