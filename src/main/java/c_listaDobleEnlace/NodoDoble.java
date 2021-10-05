package c_listaDobleEnlace;

public class NodoDoble<T> {
	protected T elemento;
	protected NodoDoble<T> anterior;
	protected NodoDoble<T> siguiente;

	public NodoDoble(T elemento) {
		this(elemento, null, null);
	}

	public NodoDoble(T elemento, NodoDoble<T> anterior, NodoDoble<T> siguiente) {
		this.elemento = elemento;
		this.anterior = anterior;
		this.siguiente = siguiente;
	}

	protected T getElemento() {
		return elemento;
	}

	protected void setElemento(T elemento) {
		this.elemento = elemento;
	}

	protected NodoDoble<T> getAnterior() {
		return anterior;
	}

	protected void setAnterior(NodoDoble<T> anterior) {
		this.anterior = anterior;
	}

	protected NodoDoble<T> getSiguiente() {
		return siguiente;
	}

	protected void setSiguiente(NodoDoble<T> siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "[" + ((elemento != null) ? elemento.toString() : "") + "]";
	}
}
