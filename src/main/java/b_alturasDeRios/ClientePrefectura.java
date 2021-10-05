package b_alturasDeRios;

public class ClientePrefectura {
	public static void main(String[] args) {
		System.out.println("TODOS LOS REGISTROS:");
		System.out.println("####################");
		ManejoArchivos.leerArchivo();
		AlturasRiosAdmin riosAdm = new AlturasRiosAdmin();
		riosAdm.procesarList();

		for (RegistroAlturaRio regi : AlturasRiosAdmin.getListRegistros()) {
			System.out.println(regi);
		}

		System.out.println("\nFILATRADO POR PUERTO: (Las Palmas): ");
		System.out.println("#####################################");
		AlturasRiosAdmin.filtrarPorPuerto("LAS PALMAS").forEach(System.out::println);

		System.out.println("\nFILATRADO POR RIO: (Uruguay): ");
		System.out.println("###############################");
		AlturasRiosAdmin.filtrarPorRio(new Rio("Uruguay")).forEach(System.out::println);

		System.out.println("\nFILATRADO POR ESTADO: (CRECE): ");
		System.out.println("###############################");
		AlturasRiosAdmin.filtrarPorEstado(EstadoEnum.CRECE).forEach(System.out::println);

	}
}
