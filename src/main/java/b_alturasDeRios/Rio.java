package b_alturasDeRios;

import java.util.Objects;

public class Rio {
	private String nombre;

	public Rio(String nombre) {
		this.nombre = nombre;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rio other = (Rio) obj;
		return this.nombre.equalsIgnoreCase(other.getNombre());
	}

	@Override
	public String toString() {
		return "Rio: " + nombre;
	}
}
