package nivell1exercici1;

import java.util.*;

public class Ejecutor_e1 {
	

	public static void main(String[] args) {
		
		/*
		 * Creo un ArrayList para almacenar los objetos creados con los nombres de los meses
		 * A excepción de Agosto
		 */
		
		ArrayList<Month> mesos = new ArrayList<Month>();
		
		/*
		 * Creo los objetos con los meses
		 */
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
		/*
		 * Con el método add, añadimos los objetos creados al arrayList
		 */
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
		
		/*
		 * Finalmente creo el objeto agosto y lo añado con el método add y paso como parámetro
		 * el lugar del índice donde quiero que se coloque y el objeto
		 */
		
		Month agost = new Month("Agost");
		mesos.add(7, agost);
		/*
		 * Finalmente muestro por consola que el arrayList contiene todos los meses y mantiene el orden
		 */
		for(Month mes : mesos) {
			System.out.println("Aquest mes és " + mes.getName());
		}

	}

}
