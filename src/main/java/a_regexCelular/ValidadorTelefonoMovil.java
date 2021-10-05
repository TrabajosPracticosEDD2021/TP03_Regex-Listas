package a_regexCelular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorTelefonoMovil {

	private static Pattern pattern = Pattern
			.compile("(\\(0345\\)[\\s-]?15\\d{7})|(\\+549345\\d{7})|(345\\d{7})");
	private static Matcher matcher;

	public static boolean validarCelular(String celular) {
		matcher = pattern.matcher(celular);
		return matcher.matches();
	}
}
