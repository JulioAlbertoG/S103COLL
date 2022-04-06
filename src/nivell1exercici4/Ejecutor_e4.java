package nivell1exercici4;

import java.util.*;

public class Ejecutor_e4 {

	public static void main(String[] args) {
		
		Animals gos = new Animals("canino","gos",4);
		Animals gat = new Animals("felí","gat",4);
		Animals aranya = new Animals("aràcnit","aranya",8);
		Animals serp = new Animals("rèptil","serp",0);
		Animals tauro = new Animals("peix","tauró",0);
		
		ArrayList<Animals> arrayList = new ArrayList<Animals>();
		arrayList.add(gos);
		arrayList.add(gat);
		arrayList.add(aranya);
		arrayList.add(serp);
		arrayList.add(tauro);
		
		LinkedList<Animals> linkedList = new LinkedList<Animals>();
		linkedList.add(gos);
		linkedList.add(gat);
		linkedList.add(aranya);
		linkedList.add(serp);
		linkedList.add(tauro);
		
		HashSet<Animals> hashSet = new HashSet<Animals>();
		hashSet.add(gos);
		hashSet.add(gat);
		hashSet.add(aranya);
		hashSet.add(serp);
		hashSet.add(tauro);
		
		LinkedHashSet<Animals> linkedHashSet = new LinkedHashSet<Animals>();
		linkedHashSet.add(gos);
		linkedHashSet.add(gat);
		linkedHashSet.add(aranya);
		linkedHashSet.add(serp);
		linkedHashSet.add(tauro);
		
		TreeSet<Animals> treeSet = new TreeSet<Animals>();
		treeSet.add(gos);
		treeSet.add(gat);
		treeSet.add(aranya);
		treeSet.add(serp);
		treeSet.add(tauro);
		
		iterator(arrayList);
		iterator(linkedList);
		iterator(hashSet);
		iterator(linkedHashSet);
		iterator(treeSet);

	}
	
	/*
	 * Con el siguiente método presento cada animal que está en cada lista. Tengo que sobreescribir
	 * el método toString para que me presente los datos del animal que está iterando.
	 */
	public static void  iterator(Collection<Animals> c) {
		Iterator<Animals> iterator = c.iterator();
	    while (iterator.hasNext()) {
	    	System.out.println(iterator.next().toString());
	    }
	            
	}

}
