package b_alturasDeRios;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlturasRiosAdmin {
	private static List<RegistroAlturaRio> listRegistros = new ArrayList<RegistroAlturaRio>();

	public void procesarList() {
		Pattern pattern = Pattern.compile(
				".*Puerto.*</span>(.*)<span.*|.*Río.*</span>(.*)<span.*|.*Ultimo Registro.*</span>(.*)<span.*|.*Fecha Hora.*</span>(\\d\\d/\\w{3}/\\d\\d\\s-\\s\\d{4})<span.*|.*Estado:</span>.{1,8}</span>(.*)<span.*",
				Pattern.UNICODE_CHARACTER_CLASS);
		Matcher m;
		boolean todosLosDatos = false;
		String puerto = null;
		String rio = null;
		String ultimoRegistro = null;
		String fechaHora = null;
		String estado = null;

		for (String linea : ManejoArchivos.getLecturaList()) {

			m = pattern.matcher(linea);
			if (m.matches()) {

				if (m.group(1) != null) {
					puerto = m.group(1);
				} else if (m.group(2) != null) {
					rio = m.group(2);
				} else if (m.group(3) != null) {
					ultimoRegistro = m.group(3);
				} else if (m.group(4) != null) {
					fechaHora = m.group(4);
				} else if (m.group(5) != null) {

					if (m.group(5).equals("ESTAC.")) {
						estado = "ESTACIONARIO";
					} else if (m.group(5).equals("S/E.")) {
						estado = "SIN_ENTRADA";
					} else
						estado = m.group(5);

					todosLosDatos = true;
				}
			}

			if (todosLosDatos) {

				listRegistros.add(new RegistroAlturaRio(puerto, new Rio(rio), ultimoRegistro,
						fechaHora, EstadoEnum.valueOf(estado)));
				todosLosDatos = false;
			}
		}

	}

	static List<RegistroAlturaRio> getListRegistros() {
		return listRegistros;
	}

	protected static void setListRegistros(List<RegistroAlturaRio> listRegistros) {
		AlturasRiosAdmin.listRegistros = listRegistros;
	}

	public static List<RegistroAlturaRio> filtrarPorPuerto(String nombrePuerto) {
		List<RegistroAlturaRio> resultado = new ArrayList<RegistroAlturaRio>();

		for (RegistroAlturaRio registroAlturaRio : listRegistros) {
			if (registroAlturaRio.getPuerto().equals(nombrePuerto)) {
				resultado.add(registroAlturaRio);
			}
		}

		return resultado;
	}

	public static List<RegistroAlturaRio> filtrarPorRio(Rio rio) {
		List<RegistroAlturaRio> resultado = new ArrayList<RegistroAlturaRio>();

		for (RegistroAlturaRio registroAlturaRio : listRegistros) {
			if (registroAlturaRio.getRio().equals(rio)) {
				resultado.add(registroAlturaRio);
			}
		}

		return resultado;
	}

	public static List<RegistroAlturaRio> filtrarPorEstado(EstadoEnum estado) {
		List<RegistroAlturaRio> resultado = new ArrayList<RegistroAlturaRio>();

		for (RegistroAlturaRio registroAlturaRio : listRegistros) {
			if (registroAlturaRio.getEstado().equals(estado)) {
				resultado.add(registroAlturaRio);
			}
		}

		return resultado;
	}
}
