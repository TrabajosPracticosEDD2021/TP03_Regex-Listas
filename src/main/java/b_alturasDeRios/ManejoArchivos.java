package b_alturasDeRios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManejoArchivos {
	private static List<String> lecturaList = new ArrayList<String>();
	
	protected static List<String> getLecturaList() {
		return lecturaList;
	}

	protected static void setLecturaList(List<String> lecturaList) {
		ManejoArchivos.lecturaList = lecturaList;
	}

	public static void leerArchivo() {
		String rutaArchivo = "src\\main\\java\\tp03\\B_AlturasDeRios\\PrefecturaAlturasRios.html";
		String str;
		try {

			BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

			while ((str = br.readLine()) != null) {
				lecturaList.add(str);
			}
			
			br.close();	
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} 
	}
	
//	public static String imprimir() {
//		String str = "";
//		
//		for (String s : lecturaList) {
//			str += s + "\n";
//		}
//		return str;
//	}
}
