package ar.com.eduit.clase5.interfaces;

public class EmailLogger implements ILogger {

	private String email;
	
	public EmailLogger(String email) {
		//no necesito llamar al constructor del padre
		this.email = email;
	}
	
	@Override
	public void log() {
		// crear un archivo en el file system
		System.out.println("Enviando un email a: " +this.email);

	}

}
