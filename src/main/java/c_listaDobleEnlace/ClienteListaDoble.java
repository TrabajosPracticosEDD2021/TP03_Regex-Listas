package c_listaDobleEnlace;

public class ClienteListaDoble {

	public static void main(String[] args) {

		ListaDoble<Integer> listaDobleInt = new ListaDoble<Integer>();

		System.out.println("La lista esta vacia? " + listaDobleInt.isEmpty()); // T

		listaDobleInt.add(3);
		listaDobleInt.add(4);
		listaDobleInt.add(4);
		listaDobleInt.add(5);
		listaDobleInt.add(6);
		listaDobleInt.add(7);
		listaDobleInt.add(8);
		listaDobleInt.add(9);

		System.out.println("\nImprimiendo lista: " + listaDobleInt);

		System.out.println("\nLa lista esta vacia? " + listaDobleInt.isEmpty()); // F

		System.out.println("\nTamaño de la lista: " + listaDobleInt.size()); // 8

		System.out.println(
				"\nObteniendo el elemento del index pasado por param (3): " + listaDobleInt.get(3)); // 5

		System.out.println("\nQuitando elemento (7)");
		listaDobleInt.remove(9);
		System.out.println("Imprimiendo lista: " + listaDobleInt);

		@SuppressWarnings("unchecked")
		IteradorListaDoble<Integer> iterador = (IteradorListaDoble<Integer>) listaDobleInt
				.iterador();
		while (iterador.existeSiguiente()) {
			System.out.println(iterador.siguiente());
		}

		System.out.println("Primer elemento: " + iterador.primero());

		System.out.println("Ultimo elemento: " + iterador.ultimo());

	}
}
