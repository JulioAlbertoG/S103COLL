package nivell1exercici3;

public class Generadora {
	/*
	 * Creo la clase generadora con el método seguentpersonatge. Declaro e inicializo en 0 el índice
	 * y con el condicional if compruebo que la posición del índice no supere a los elementos del
	 * array, el -1 es necesario porque los índices comienzan en el 0 y el método lenght no lo contempla.
	 * Si el i es menor que 6(tamaño del array-1) aumentamos el valor del índice, y así se recorre el array
	 * cada que se invoca el método. Pero cuando el índice iguale el tamaño del array-1, el valor volverá a 0
	 * y con un return devolvemos el nombre del personaje. Por parámetro pasaremos el array para que el
	 * método trabaje con él. 
	 */
	private static int i = 0;
	
	public static String seguentPersonatge(String[] personatges) {
		
		String personatge = personatges[i];
		
			if(i<personatges.length-1) {
			i++;
		}
		else {
			i=0;
		}		
				
		return personatge;
		
	}

}
