package nivell1exercici8;

import java.util.*;

public class Objectes implements Comparator<Objectes> {
	private String nom;
	private boolean existeix; 
	private int quantitat;
	
	public Objectes(String nom, boolean existeix, int quantitat) {
		this.nom = nom;
		this.existeix = existeix;
		this.quantitat = quantitat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isExisteix() {
		return existeix;
	}

	public void setExisteix(boolean existeix) {
		this.existeix = existeix;
	}

	public int getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}	
	
	public String toString() {
		String ex;
		if(existeix=true) {
			 ex = "Si existeix";
		}else {
			 ex = "No existeix";
		}
		return "El nom de l'objecte és: " + nom + ", " + ex + " i la quantitat és: " + quantitat;
	}

	@Override
	public int compare(Objectes obj1, Objectes obj2) {
		//Objectes objecte1 = (Objectes) obj1;
		//Objectes objecte2 = (Objectes) obj2;
		return obj1.getNom().compareTo(obj2.getNom());
	}
	

}
