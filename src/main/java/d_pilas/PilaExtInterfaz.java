package d_pilas;

import ar.edu.uner.fcad.ed.edlineales.pilas.PilaPorEnlaces;

public interface PilaExtInterfaz<T> {
	/** Mezcla los elementos la estructura con los de pilaParam. */
	public void intercalar(PilaPorEnlaces<T> pilaParam);

	/** Agrega al final de la estructura los elementos de pilaPam */
	public void agregarTodos(PilaPorEnlaces<T> pilaParam);

	/** Invierte el orden de los elementos de la estructura. */
	public void invertirOrden();
}