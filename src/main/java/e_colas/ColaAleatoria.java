package e_colas;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;

public class ColaAleatoria<T> implements ColaAleatoriaInterfaz<T> {

	protected NodoLista<T> front;
	protected NodoLista<T> back;
	protected int tamanio;

	public ColaAleatoria() {
		this.makeEmpty();
	}

	/** Indica si la estructura está vacía */
	@Override
	public boolean isEmpty() {
		return front == null;
	}

	/** Indica si la estructura está llena */
	@Override
	public boolean isFull() {
		return false;
	}

	/** Obtiene un elemento aleatoriamente de la estructura */
	@Override
	public T random() {
		int inxRandom = (int) (Math.random() * (tamanio - 1) + 1);
		NodoLista<T> nodoAux = this.front;
		T resultado = null;

		for (int i = 0; i < inxRandom; i++) {
			if (i == inxRandom - 1) {
				resultado = nodoAux.getElemento();
			}
			nodoAux = nodoAux.getSiguiente();
		}

		return resultado;
	}

	/** Quita un elemento aleatoriamente de la estructura. */
	@Override
	public void removeRandom() {
		T auxEliminar = this.random();
		NodoLista<T> auxNodo = this.front;

		while (auxNodo.getSiguiente() != null) {
			if (auxNodo.getElemento().equals(auxEliminar)) { // El dato a eliminar esta al principio
				this.front = auxNodo.getSiguiente();
			} else if (auxNodo.getSiguiente().getElemento().equals(auxEliminar))
				auxNodo.setSiguiente(auxNodo.getSiguiente().getSiguiente());

			auxNodo = auxNodo.getSiguiente();
		}

	}

	/**
	 * Agrega un elemento al final de la estructura
	 */
	@Override
	public void enqueue(T elemento) {
		NodoLista<T> nodoAux = new NodoLista<T>(elemento);
		if (isEmpty()) {
			this.front = nodoAux;
			this.back = nodoAux;
		} else {
			this.back.setSiguiente(nodoAux);
			this.back = back.getSiguiente();
		}
		tamanio++;
	}

	/** Vacía la estructura */
	@Override
	public void makeEmpty() {
		this.back = this.front = null;
		this.tamanio = 0;
	}

	@Override
	public String toString() {

		String resultado = "";

		if (isEmpty()) {
			return resultado;
		}

		NodoLista<T> nodoActual = this.front;

		while (nodoActual != null) {
			resultado += ", " + nodoActual.toString();
			nodoActual = nodoActual.getSiguiente();
		}

		resultado = resultado.substring(2);

		return resultado;
	}

}
