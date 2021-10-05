package e_colas;

public class ClienteColaAleatoria {
	public static void main(String[] args) {

		ColaAleatoria<String> colaAlea = new ColaAleatoria<String>();

		System.out.println(
				"La cola esta vacia? " + colaAlea.isEmpty() + ", esta llena? " + colaAlea.isFull());

		colaAlea.enqueue("Hola");
		colaAlea.enqueue("Estructura");
		colaAlea.enqueue("De");
		colaAlea.enqueue("Datos");
		colaAlea.enqueue("!!!");

		System.out.println("Cola aleatoria completa: " + colaAlea);

		System.out.println(
				"La cola esta vacia? " + colaAlea.isEmpty() + ", esta llena? " + colaAlea.isFull());

		System.out.println("T Random: " + colaAlea.random());

		colaAlea.removeRandom();
		System.out.println("Cola aleatoria sin un elemento random: " + colaAlea);

		colaAlea.enqueue("123");
		System.out.println("Agregando 123 a la cola: " + colaAlea);

		colaAlea.makeEmpty();
		System.out.println("Vaciando la cola.." + colaAlea);
		System.out.println("isEmpty(): " + colaAlea.isEmpty());

	}
}
