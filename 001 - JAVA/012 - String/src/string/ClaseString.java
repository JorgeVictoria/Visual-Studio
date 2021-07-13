package string;

public class ClaseString {

	public static void main(String[] args) {
		
		String cadena = "";
		String cadena1 = "Hola.";
		String cadena2 = "Mi nombre es Jorge.";
		String cadena3 = "Soy aspirante a programador.";
		
		//concatenar cadena
		cadena = cadena + cadena1 + cadena2;
		System.out.println(cadena);
		
		cadena = cadena.concat(cadena3);
		System.out.println(cadena);
		
		//longitud de un string
		System.out.println("La cadena tiene " + cadena.length() + " caracteres.");
		
		//pasar cadena a mayusculas
		System.out.println(cadena.toUpperCase());
		
		//pasar cadena a minusculas
		System.out.println(cadena.toLowerCase());
		
		//crear una cadena formateada, Ver con mas profundidad
		float division = (float)31/7;
		cadena = String.format("31 dividido entre 7 es %.2f", division);
		System.out.println(cadena);
		
		//comparar cadenas
		System.out.println(cadena1.compareTo(cadena2));
		
		//ver contenido de cadenas
		System.out.println(cadena1.startsWith("H"));
		System.out.println(cadena1.endsWith("a"));
		System.out.println(cadena1.contains("ol"));
	}

}
