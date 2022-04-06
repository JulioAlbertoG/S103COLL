package nivell1exercici7;

import java.util.*;

public class Ejecutor_e7 {

	public static void main(String[] args) {
		
		HashMap hashMap = new HashMap();
		
		hashMap.put(4, "Carles");
		hashMap.put(75, "Jordi");
		hashMap.put(3, "Joan");
		hashMap.put(94, "Laia");
		hashMap.put(58, "Irati");

		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		treeMap.putAll(hashMap);
		System.out.println(treeMap);
		
		LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap(hashMap);
		System.out.println(linkedHashMap);
		
		
		List<Integer> keys = new ArrayList<Integer>(hashMap.entrySet());
		System.out.println(keys);
		
		HashSet<Integer> hashSet = new HashSet<Integer>(keys);
		System.out.println(hashSet);
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(keys);
		System.out.println(linkedHashSet);
	}

}
