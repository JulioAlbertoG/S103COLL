package nivell1exercici6;

import java.util.*;

public class Ejecutor_e6 {
	
	static LinkedList<Integer> buit = new LinkedList<Integer>();

	public static void main(String[] args) {
		
	
		
		for(int i=1;i<11;i++) {
			insert(i);
			System.out.println(buit);
			}
			

		}
	

	public static void insert(int num) {
		int puntMig = buit.size()/2;
		ListIterator<Integer> it = buit.listIterator(puntMig);
		it.add(num);
	}
}
