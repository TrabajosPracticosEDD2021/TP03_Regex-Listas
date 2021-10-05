package d_pilas;

import ar.edu.uner.fcad.ed.edlineales.pilas.PilaPorEnlaces;

public class ClientePilaExt {
	public static void main(String[] args) {

		PilaExtImp<Integer> pilav2 = new PilaExtImp<Integer>();

		pilav2.push(4);
		pilav2.push(3);
		pilav2.push(2);
		pilav2.push(1);

		System.out.println("Pila: " + pilav2);

		PilaPorEnlaces<Integer> intercalarPila = new PilaPorEnlaces<Integer>();
		intercalarPila.push(7);
		intercalarPila.push(6);
		intercalarPila.push(5);
		System.out.println("\nintercalarPila: " + intercalarPila);
		pilav2.intercalar(intercalarPila);
		System.out.println("Pila: " + pilav2);

		PilaPorEnlaces<Integer> unirPila = new PilaPorEnlaces<Integer>();
		unirPila.push(8);
		unirPila.push(9);
		unirPila.push(10);
		System.out.println("\nunirPila: " + unirPila);
		pilav2.agregarTodos(unirPila);
		System.out.println("agregarTodos(unirPila): " + pilav2);

		pilav2.invertirOrden();
		System.out.println("\ninvertirOrden(): " + pilav2);
	}
}
