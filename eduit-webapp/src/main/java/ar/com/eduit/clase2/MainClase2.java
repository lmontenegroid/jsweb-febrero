package ar.com.eduit.clase2;

public class MainClase2 {

	//UPPER CAMEL CASE
	//ClaseMaMeMiMo
	
	//LOWER
	//claseMaMeMiMo: atributos y m�todos
	
	//punto de entrada
	public static void main(String[] args) {
				
		//INSTANCIAR UN OBJETO DE LA CLASE AUTO
		Auto clioVerde = new Auto();
		//f6 linea a linea
		//f5 entrar al m�todos
		//f7 volver hacia quien invoc�
		//f8 a partir de la linea donde este "parado" ejecuta hasta el final o el pr�ximo break point
		
		//a partir de ac�, el objeto clioVerde est� vivo
		
		//asignar valor a los atributos del objeto clioVerder
		clioVerde.anio = 2020;//f6
		clioVerde.canidadCombustible = 10f;
		clioVerde.chasis=123456789l;
		clioVerde.color="verde";
		clioVerde.setMarca("renault");
		clioVerde.setModelo("clio");
		clioVerde.velocidad=0f;
				
		System.out.println(clioVerde.anio);
	}//f8

}
