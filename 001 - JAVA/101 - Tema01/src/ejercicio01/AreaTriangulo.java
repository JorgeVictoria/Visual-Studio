/**
 * Leer la base y la altura de un triangulo
 * Y mostrar su area usando la formula area = (base x altura) / 2
 */
package ejercicio01;

import java.util.Scanner;

/**
 * @author jvand
 *
 */
public class AreaTriangulo {

	//variables globales
	public static Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//borrado de pantalla
		//System.out.print("\033[H\033[2J");
		
		//imprimimos banner
		banner();
		
		//creamos el objeto triangulo
		Triangulo triangulo = new Triangulo(pedirNumero("base"),pedirNumero("altura"));
		
		//calculamos el area del triangulo
		triangulo.setArea();
		
		//imprimimos el area del triangulo
		System.out.println(triangulo);

	}
	
	//banner
	public static void banner() {
		
		//banner
		System.out.println("**************************");
		System.out.println("******AREA TRIANGULO******");
		System.out.println("**************************");
		System.out.println();
	}
	
	public static double pedirNumero(String lado) {
		
		//variables locales
		boolean salir = false;					//mientras sea false seguimos pidiendo datos
		
		double valor=0;							//valor que introducimos
		
		while(!salir) {
			//suponemos que vamos a meter el dato correctamente
			salir = true;
			//pedimos dato por pantalla
			System.out.print("Introduzca la " + lado + " del triangulo:");
			//evaluamos la entrada
			try {
				valor = stdin.nextDouble();
			//si la entrada no es correcta
			} catch (Exception e) {
				//limpiamos el salto de linea, habremos introducido una cadena
				stdin.nextLine();
				//mostramos error por pantalla
				System.out.println("El valor introducido es incorrecto.");
				//como el dato es erroneo, seguimos en el bucle
				salir = false;
			}
			//controlamos que el valor no sea 0 o negativo
			if(salir == true && valor <= 0 ) {
				System.out.println("Debe introducir un valor positivo.");
				salir = false;
			}
		}
		
		//devolvemos un valor
		return valor;
		
	}
	

}
