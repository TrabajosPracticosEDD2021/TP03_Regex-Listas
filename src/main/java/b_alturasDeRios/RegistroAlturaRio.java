package b_alturasDeRios;

import java.util.Objects;

public class RegistroAlturaRio {
	private String puerto;
	private Rio rio;
	private String ultimoRegistro;
	private String fechaHora;
	private EstadoEnum estado;

	public RegistroAlturaRio() {
		this(null, null, null, null, null);
	}

	public RegistroAlturaRio(String puerto, Rio rio, String ultimoRegistro, String fechaHora,
			EstadoEnum estado) {
		this.puerto = puerto;
		this.rio = rio;
		this.ultimoRegistro = ultimoRegistro;
		this.fechaHora = fechaHora;
		this.estado = estado;
	}

	protected String getPuerto() {
		return puerto;
	}

	protected void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	protected Rio getRio() {
		return rio;
	}

	protected void setRio(Rio rio) {
		this.rio = rio;
	}

	protected String getUltimoRegistro() {
		return ultimoRegistro;
	}

	protected void setUltimoRegistro(String ultimoRegistro) {
		this.ultimoRegistro = ultimoRegistro;
	}

	protected String getFechaHora() {
		return fechaHora;
	}

	protected void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	protected EstadoEnum getEstado() {
		return estado;
	}

	protected void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaHora, puerto, rio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroAlturaRio other = (RegistroAlturaRio) obj;
		return Objects.equals(fechaHora, other.fechaHora) && Objects.equals(puerto, other.puerto)
				&& Objects.equals(rio, other.rio);
	}

	@Override
	public String toString() {
		return "Registro: [Puerto: " + puerto + ", " + rio + ", Ultimo Registro: " + ultimoRegistro
				+ ", Fecha - Hora: " + fechaHora + ", Estado: " + estado + "]";
	}

}
