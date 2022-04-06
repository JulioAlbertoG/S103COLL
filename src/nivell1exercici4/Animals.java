package nivell1exercici4;

public class Animals implements Comparable<Animals> {
	
	private String especie;
	private int numPotes;
	private String nom;
	
	public Animals(String esp, String nom, int np) {
		this.especie = esp;
		this.nom = nom;
		this.numPotes = np;
	}
	    
	public String getEspecie() {
		return especie;
	}



	public int getNumPotes() {
		return numPotes;
	}



	public String getNom() {
		return nom;
	}

    public int compareTo(Animals animal) {
        return getNom().compareTo(animal.getNom());
    }
    
    @Override
   	public String toString() {
   	        return "L'animal " + nom +" pertany a l'espècie " + especie +" que té " + numPotes + " potes.";
   	    }
	

}
