package nivell1exercici8;

import java.util.*;

public class Ejecutor_e8 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Objectes> linkedHashMap = new LinkedHashMap<String, Objectes>();
		
		Objectes cadires = new Objectes("cadires",true,4);
		Objectes taules = new Objectes("taules",true,2);
		Objectes espases = new Objectes("espases",false,0);
		Objectes llits = new Objectes("llits",true,1);
		
		linkedHashMap.put("d", cadires);
		linkedHashMap.put("b", taules);
		linkedHashMap.put("c", espases);
		linkedHashMap.put("a", llits);
		
		
		/*
		 * La següent és una forma de fer l'ordenament sense comparar
		TreeMap<String,Objectes> treeMap = new TreeMap<String,Objectes>(linkedHashMap);
		

		System.out.println(treeMap);
		
		*/
		
		List<Map.Entry<String, Objectes>> llista = new ArrayList<Map.Entry<String, Objectes>>(linkedHashMap.entrySet());
		
		
		
		Collections.sort(llista, new ComparatorOrdenPorLEtra());
		
		
		
			System.out.println(llista);
		
		
	}

}
