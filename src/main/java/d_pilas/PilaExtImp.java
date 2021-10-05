package d_pilas;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
import ar.edu.uner.fcad.ed.edlineales.pilas.PilaPorEnlaces;

public class PilaExtImp<T> extends PilaPorEnlaces<T> implements PilaExtInterfaz<T> {

	/** Mezcla los elementos la estructura con los de pilaParam. */
	@Override
	public void intercalar(PilaPorEnlaces<T> pilaParam) {
		PilaPorEnlaces<T> auxPila = new PilaPorEnlaces<T>();

		while (!this.isEmpty()) {
			auxPila.push(this.top());
			if (!pilaParam.isEmpty()) {
				auxPila.push(pilaParam.top());
				pilaParam.pop();
			}
			this.pop();
		}

		this.makeEmpty();
		while (!auxPila.isEmpty()) {
			this.push(auxPila.top());
			auxPila.pop();
		}
	}

	/** Agrega al final de la estructura los elementos de pilaPam */
	@Override
	public void agregarTodos(PilaPorEnlaces<T> pilaParam) {
		NodoLista<T> respaldoTope = this.tope;

		while (tope != null) {

			if (this.tope.getSiguiente() == null) { // Comprueba si esta en el final de la pila

				while (!pilaParam.isEmpty()) {

					tope.setSiguiente(new NodoLista<T>(pilaParam.top()));

					pilaParam.pop();
					this.tope = this.tope.getSiguiente();
				}
			}

			this.tope = this.tope.getSiguiente();
		}

		this.tope = respaldoTope;
	}

	/** Invierte el orden de los elementos de la estructura. */
	@Override
	public void invertirOrden() {
		ColaPorEnlaces<T> colaAux = new ColaPorEnlaces<T>();

		while (!this.isEmpty()) {
			colaAux.enqueue(this.top());
			this.pop();
		}

		this.makeEmpty();
		while (!colaAux.isEmpty()) {
			this.push(colaAux.getFront());
			colaAux.dequeue();
		}
	}
}
