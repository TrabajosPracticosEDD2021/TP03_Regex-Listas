package a_regexCelular;

public class ClienteValidadorTelefonoMovil {
	public static void main(String[] args) {

		String prueba1 = "(0345) 154123456"; // valido
		String prueba2 = "(0345)154123456"; // valido
		String prueba3 = "(0345)-154123456"; // valido
		String prueba4 = "(0347)-154123456"; // no valido
		String prueba5 = "3454123456"; // valido
		String prueba6 = "34564123456"; // no valido
		String prueba7 = "+54011123456"; // no valido
		String prueba8 = "+5493454123456"; // valido

		System.out
				.println(prueba1 + " es valido? " + ValidadorTelefonoMovil.validarCelular(prueba1));
		System.out
				.println(prueba2 + " es valido? " + ValidadorTelefonoMovil.validarCelular(prueba2));
		System.out
				.println(prueba3 + " es valido? " + ValidadorTelefonoMovil.validarCelular(prueba3));
		System.out
				.println(prueba4 + " es valido? " + ValidadorTelefonoMovil.validarCelular(prueba4));
		System.out
				.println(prueba5 + " es valido? " + ValidadorTelefonoMovil.validarCelular(prueba5));
		System.out
				.println(prueba6 + " es valido? " + ValidadorTelefonoMovil.validarCelular(prueba6));
		System.out
				.println(prueba7 + " es valido? " + ValidadorTelefonoMovil.validarCelular(prueba7));
		System.out
				.println(prueba8 + " es valido? " + ValidadorTelefonoMovil.validarCelular(prueba8));

	}
}
