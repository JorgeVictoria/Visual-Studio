package clasesEnvoltorio;

public class Envoltorio {

	public static void main(String[] args) {
		
		//procesar una cadena de caracteres a valor numerico
		int num = Integer.parseInt("12345");
		System.out.println(num);
		
		//obtener el maximo entre dos enteros
		System.out.println(Integer.max(num, 12346));
		
		//representacion binaria, hexadecimal u octal de un numero
		System.out.println(Integer.toBinaryString(num));
		
		//Obtener instancias con los metodos valuesOf
		Long l = Long.valueOf("123456789");
		Double d = Double.valueOf("123456789");
		System.out.println(l);
		System.out.println(d);
		
		//ver si un caracter es letra o numero
		char c = 'a';
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isDigit(c));
		
		//operaciones logicas con valores booleanos
		System.out.println(Boolean.logicalXor(true, true));

	}

}
