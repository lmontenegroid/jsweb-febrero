package ar.com.eduit.clase5.exceptions;

import ar.com.eduit.clase5.interfaces2.Espanol;
import ar.com.eduit.clase5.interfaces2.Hombre;
import ar.com.eduit.clase5.interfaces2.Mujer;
import ar.com.eduit.clase5.interfaces2.Persona;

public class ExceptionsMain {

	public static void main(String[] args) {
		/*
		 * String saludo = null;
		 * 
		 * System.out.println(saludo.length()); --> NullPointerException
		 * 
		 * int a = 10; int b = 0; int c = a/b; --> AritmethicException
		 * 
		 * 
		 * Persona maria = new Mujer("JUAN", "PEREZ", "generoX", new Espanol());
		 * 
		 * //tiempo de compilacion Mujer h = (Mujer) maria;
		 * 
		 * // Hombre h2 = (Mujer) maria; --> ClassCastException (las 3 son
		 * uncheckedException
		 * 
		 * System.out.println(h.getApellido());
		 */

		Calculadora c = new Calculadora(1, 0);

		// dentro pongo la logica que quiero que suceda de manera exitosa
		try {
			c.dividir();
			System.out.println(c.getResultado());
		} 
		
		/*catch (MiException e | LogException le) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}catch(LogException le){ ya no hace falta esto porque está contemplado en la linea de arriba
			le.printStackTrace();
			System.err.println(le.getMessage());*/
		
		catch(Exception e){
			e.printStackTrace();
			System.err.println(e.getMessage()); 
		} finally {
			System.out.println("Siempre se ejecuta este código");
		}
		System.out.println("Fin");

	}

}
