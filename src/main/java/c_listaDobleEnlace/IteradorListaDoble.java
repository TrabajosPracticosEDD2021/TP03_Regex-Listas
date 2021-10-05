package c_listaDobleEnlace;

public class IteradorListaDoble<T> implements IteradorListaDobleInterfaz<T> {

	protected NodoDoble<T> nodoActual;
	protected NodoDoble<T> primero;
	protected NodoDoble<T> ultimo;

	public IteradorListaDoble(NodoDoble<T> header) {
		nodoActual = header;
		primero = header.getSiguiente();
	}

	/** Indica si existe un nodo a continuación del actual. */
	@Override
	public boolean existeSiguiente() {
		return nodoActual.siguiente != null;
	}

	@Override
	public T siguiente() {
		T resultado = null;

		if (existeSiguiente()) {
			nodoActual = nodoActual.getSiguiente();
			resultado = nodoActual.getElemento();
		}

		return resultado;
	}

	@Override
	public T primero() {
		return primero.getElemento();
	}

	@Override
	public boolean existeAnterior() {
		return nodoActual.getAnterior() != null;
	}

	@Override
	public T anterior() {
		T resultado = null;

		if (existeAnterior()) {
			nodoActual = nodoActual.getAnterior();
			resultado = nodoActual.getElemento();
		}

		return resultado;
	}

	@Override
	public T ultimo() {
		T resultado = null;
		NodoDoble<T> nodoAux = primero;
		while (nodoAux.getSiguiente() != null) {
			if (nodoAux.getSiguiente().getSiguiente() == null) {
				resultado = nodoAux.getSiguiente().getElemento();
			}
			nodoAux = nodoAux.getSiguiente();
		}

		return resultado;
	}

}
