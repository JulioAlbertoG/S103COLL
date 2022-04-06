package nivell1exercici5;

import java.util.*;

public class Ejecutor_e5 {

	public static void main(String[] args) {
		
		List<Integer> llista1 = new ArrayList<Integer>();
		
			 
		for(int i=0;i<10;i++) {
			llista1.add(i);
			
		}
		
		List<Integer> llista2 = new ArrayList<Integer>();
		
		for(int i=5;i<15;i++) {
			llista2.add(i);
		}
		
		ListIterator<Integer> itL1 = llista1.listIterator(); 
		while(itL1.hasNext()) {
			itL1.next();
		}
		
		while(itL1.hasPrevious()) {
			llista2.add(itL1.previous());
			
		}
		
		System.out.println(llista1);
		System.out.println(llista2);
	     
	//	llista2.addAll(llista1);
		
		System.out.println("Resultat final de la llista 2 és "+llista2);
	}

}
