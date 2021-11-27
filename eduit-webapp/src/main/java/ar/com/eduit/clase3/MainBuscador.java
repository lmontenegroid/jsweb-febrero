package ar.com.eduit.clase3;

public class MainBuscador {

	public static void main(String[] args) {
		
		// 
		String claveBusquedaIngresadaPorElUsuario = "iron man";
		
		//Crear una instancia de buscador SI
		Buscador buscador = new Buscador();
		buscador.setClaveBusqueda(claveBusquedaIngresadaPorElUsuario); 
		
		//Ejecuto la busqueda
		buscador.buscar();
		
		//mostrar los datos
		Articulo[] resultados = buscador.getResultados();
		
		//estructura
		/*for(int i=0; i<buscador.getTotal(); i++) {
			resultados[i].informar();  
		}*/
		
		for(Articulo resultado : resultados) {
			//libro - musica - pasatiempo - pelicula
			// no los distingue, todos forman parte de articulo 
			System.out.println(Articulo.TIPO);
			resultado.informar();
			System.out.println("--------");
		}
		
	}

}
