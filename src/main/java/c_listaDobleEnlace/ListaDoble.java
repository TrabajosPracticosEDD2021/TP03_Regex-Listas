package c_listaDobleEnlace;

public class ListaDoble<T> implements ListaDobleInterfaz<T> {
	protected NodoDoble<T> header;

	public ListaDoble() {
		this.header = new NodoDoble<T>(null);
	}

	/** Indica si la lista está vacía */
	@Override
	public boolean isEmpty() {
		return header.siguiente == null;
	}

	/** Devuelve la cantidad de elementos de la estructura. */
	@Override
	public int size() {
		int tam = 0;
		NodoDoble<T> nodoAux = header.siguiente;

		while (nodoAux != null) {
			tam++;
			nodoAux = nodoAux.siguiente;
		}

		return tam;
	}

	/** Devuelve el elemento ubicado en la posición indicada por index. */
	@Override
	public T get(int index) {
		NodoDoble<T> nodoAux = header.siguiente;

		for (int i = 0; i < index; i++) {
			nodoAux = nodoAux.siguiente;
		}

		return nodoAux.elemento;
	}

	/** Agrega un elemento al final de la lista. */
	@Override
	public void add(T element) {
		NodoDoble<T> nuevoNodo = new NodoDoble<T>(element);

		if (isEmpty()) {
			this.header.siguiente = nuevoNodo;
		} else {
			NodoDoble<T> ultimoNodo = ultimoNodo();
			nuevoNodo.anterior = ultimoNodo;
			ultimoNodo.siguiente = nuevoNodo;
		}
	}

	/** Obtiene el ultimo nodo */
	private NodoDoble<T> ultimoNodo() {
		NodoDoble<T> ultimoNodo = header.siguiente;

		while (ultimoNodo.siguiente != null) {
			ultimoNodo = ultimoNodo.siguiente;
		}

		return ultimoNodo;
	}

	/** Quita un elemento de la lista. */
	@Override
	public void remove(T element) {
		NodoDoble<T> nodoAux = header.siguiente;

		for (int i = 0; i < size(); i++) {
			if (nodoAux.elemento.equals(element)) {
				if (nodoAux.anterior == null) { // Nodo a eliminar en el principio
					nodoAux.siguiente.setAnterior(null);
					this.header.setSiguiente(nodoAux.siguiente);
				} else if (nodoAux.siguiente == null) { // Nodo a eliminar en el final
					nodoAux.anterior.setSiguiente(null);
				} else { // Nodo a eliminar en medio
					nodoAux.anterior.setSiguiente(nodoAux.siguiente);
					nodoAux.siguiente.setAnterior(nodoAux.anterior);
				}
			}
			nodoAux = nodoAux.siguiente;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public IteradorListaDobleInterfaz iterador() {
		return new IteradorListaDoble<>(this.header);
	}

	@Override
	public String toString() {
		String resultado = "";

		if (isEmpty()) {
			return resultado;
		}

		NodoDoble<T> nodoActual = this.header.siguiente;
		while (nodoActual != null) {
			resultado += ", " + nodoActual.toString();
			nodoActual = nodoActual.siguiente;
		}

		return resultado.substring(2);
	}

}
