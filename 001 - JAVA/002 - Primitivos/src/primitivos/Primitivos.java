/**
 * 
 */
package primitivos;

/**
 * @author jvand
 *
 */
public class Primitivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tipo byte(1 byte)
		System.out.println("Tipo Byte");
		byte num1 = 5;
		System.out.println(num1);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println();
		
		//tipo short(2 bytes)
		System.out.println("Tipo Short");
		short num2 = 5;
		System.out.println(num2);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println();
		
		//tipo int(4 bytes)
		System.out.println("Tipo int");
		int num3 = 5;
		System.out.println(num3);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println();
		
		//tipo long(8 bytes)
		System.out.println("Tipo Long");
		long num4 = 5L;
		System.out.println(num4);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println();
		
		//tipo float(4 bytes)
		System.out.println("Tipo float");
		float num5 = 5f;
		System.out.println(num5);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println();
				
		//tipo double(8 bytes)
		System.out.println("Tipo double");
		double num6 = 5d;
		System.out.println(num6);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println();
		
		//tipo char(unicode)
		System.out.println("Tipo Char");
		char caracter = 'a';
		System.out.println(caracter);
		System.out.println(Integer.valueOf(caracter));
		System.out.println();
		
		//tipo boolean
		System.out.println("Tipo Boolean");
		boolean valor1 = true;
		boolean valor2 = false;
		System.out.println(valor1 + "/" + valor2);
		System.out.println();
		
		//variables finales o constantes
		final int NUM_HORAS = 8;
		System.out.println(NUM_HORAS);
		//NUM_HORAS = 5; //Da error, no podemos cambiar el valor constante
		System.out.println();
		
		//valor 26 en decimal
		System.out.println("valor 26 en decimal");
		int decVal = 26;
		System.out.println(decVal);
		
		//diferentes formas de representacion
		int hexVal = 0x1a;
		int binVal = 0b11010;
		//System.out.println(hexVal);
		//System.out.println(binVal);
		
		//valor 26 en hexadecimal
		System.out.println("valor 26 en hexadecimal");
		System.out.println(Integer.toHexString(decVal));
		
		//valor 26 en binario
		System.out.println("valor 26 en binario");
		System.out.println(Integer.toBinaryString(decVal));
		System.out.println();
		
		//uso de guiones bajos para numeros largos. En pantalla no salen
		System.out.println("Uso de guiones bajos para numeros largos. En pantalla no salen");
		int numLargo = 1_250_000;
		System.out.println(numLargo);
		
	}

}
