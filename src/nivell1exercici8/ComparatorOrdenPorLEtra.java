package nivell1exercici8;

import java.util.Comparator;
import java.util.Map;

public class ComparatorOrdenPorLEtra implements Comparator<Map.Entry<String, Objectes>> {


	@Override
	public int compare(Map.Entry<String, Objectes> o1, Map.Entry<String, Objectes> o2) {
		
		return o1.getKey().compareTo(o2.getKey());
	}
}
