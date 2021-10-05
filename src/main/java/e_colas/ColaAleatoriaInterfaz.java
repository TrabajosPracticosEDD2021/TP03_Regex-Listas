package e_colas;

public interface ColaAleatoriaInterfaz<T> {
	/** Indica si la estructura está vacía */
	public boolean isEmpty();

	/** Indica si la estructura está llena */
	public boolean isFull();

	/** Obtiene un elemento aleatoriamente de la estructura */
	public T random();

	/** Quita un elemento aleatoriamente de la estructura. */
	public void removeRandom();

	/**
	 * Agrega un elemento al final de la estructura
	 */
	public void enqueue(T elemento);

	/** Vacía la estructura */
	public void makeEmpty();
}
