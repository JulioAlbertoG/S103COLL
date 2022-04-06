package nivell1exercici3;

import java.util.*;

public class Ejecutor_e3 {

/*
 * declaro e inicializo el array con los personajes	
 */
	private static  String [] personatges = {"Hannibal","Capitán América", "Jack Torrance","Anakin Skywalker", "El zorro",
			"Joker", "Tony Montana"};

	public static void main(String[] args) {
/*
 *Declaro e inicializo todas las listas y con un bucle for each agrego cada personaje con el método
 *seguentPersonatge, pasando el array como parámetro 		
 */
	try {
		ArrayList<String> arrayList = new ArrayList<String>();
		for(String personatge : personatges){
			arrayList.add(Generadora.seguentPersonatge(personatges));
		}
		
		LinkedList<String> linkedList = new LinkedList<String>();
		for(String personatge : personatges){
			linkedList.add(Generadora.seguentPersonatge(personatges));
		}
		
		HashSet<String> hashSet = new HashSet<String>();
		for(String personatge : personatges){
			hashSet.add(Generadora.seguentPersonatge(personatges));
		}
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		for(String personatge : personatges){
			linkedHashSet.add(Generadora.seguentPersonatge(personatges));
		}
		
		TreeSet<String> treeSet = new TreeSet<String>();
		for(String personatge : personatges){
			treeSet.add(Generadora.seguentPersonatge(personatges));
		}
		
		/*
		 * Muestro por consola cada uno de los contenedores, algunos están ordenados y otros desordenados	
		 */
			System.out.println(arrayList);
			System.out.println(linkedList);
			System.out.println(hashSet);
			System.out.println(linkedHashSet);
			System.out.println(treeSet);
		
	}catch(ArrayIndexOutOfBoundsException arr){
		System.err.println("Alguna cosa ha sortit malament amb la mida del array");
	}catch(Exception e) {
		System.err.println("Revisa bé el codi, tens una exception desconeguda");
	}

	}

}
