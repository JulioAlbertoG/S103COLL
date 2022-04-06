package nivell1exercici2;

import java.util.*;

import nivell1exercici1.Month;

public class Ejecutor_e2 {

	public static void main(String[] args) {
		
	ArrayList<Month> mesos = new ArrayList<Month>();
		
	
		Month gener = new Month("Gener");
		Month febrer = new Month("Febrer");
		Month març = new Month("Març");
		Month abril = new Month("Abril");
		Month maig = new Month("Maig");
		Month juny = new Month("Juny");
		Month juliol = new Month("Juliol");
		Month setembre = new Month("Setembre");
		Month octubre = new Month("Octubre");
		Month novembre = new Month("Novembre");
		Month desembre = new Month("Desembre");
	
		
		mesos.add(gener);
		mesos.add(febrer);
		mesos.add(març);
		mesos.add(abril);
		mesos.add(maig);
		mesos.add(juny);
		mesos.add(juliol);
		mesos.add(setembre);
		mesos.add(octubre);
		mesos.add(novembre);
		mesos.add(desembre);
		
		
		Month agost = new Month("Agost");
		mesos.add(7, agost);
	/*
	 * Sigo el código del ejercicio anterior y agrego de nuevo un objeto desembre	
	 */
		mesos.add(desembre);
/*
 * Creo una variable Collection con el tipo de objeto Month con un hashset y paso como parámetro
 * el arrayList que había creado. Utilizo Collection por seguir el ejemplo de la documentación, pero para
 * no ser tan generalizado, hubiera podido utilizar Set<Month>, después lo recorro e imprimo la lista.
 * Una de las características del Hashset es que se la lista aparece en desorden. Tampoco permite el
 * objeto duplicado y desembre solo aparecerá una vez
 */
		
		Collection<Month> noDuplicate = new HashSet<Month>(mesos);
		
		for(Month mes : noDuplicate) {
			System.out.println("Aquest mes és " + mes.getName());
		}

	}

}
