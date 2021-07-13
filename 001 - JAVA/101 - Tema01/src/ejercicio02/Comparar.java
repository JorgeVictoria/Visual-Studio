package ejercicio02;

import java.util.Scanner;

public class Comparar {
	
	//variables globales
	private static Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//variables locales
		int num1, num2;	//numeros a comparar
		
		//print banner
		banner();
		
		//pedimos datos
		num1 = pedirNumero("num1");
		num2 = pedirNumero("num2");
		
		//comparamos y mostramos resultado
		System.out.print("El resultado de la comparacion es " + compareTo(num1,num2));
		

	}
	
	//banner
	public static void banner() {
			
		//banner
		System.out.println("*************************");
		System.out.println("*****COMPARA NUMEROS*****");
		System.out.println("*************************");
		System.out.println();
	}
	
	public static int pedirNumero(String num) {
		
		//variables locales
		boolean salir = false;					//mientras sea false seguimos pidiendo datos
		
		int valor=0;							//valor que introducimos
		
		while(!salir) {
			//suponemos que vamos a meter el dato correctamente
			salir = true;
			//pedimos dato por pantalla
			System.out.print("Introduzca el " + num + " :");
			//evaluamos la entrada
			try {
				valor = stdin.nextInt();
			//si la entrada no es correcta
			} catch (Exception e) {
				//limpiamos el salto de linea, habremos introducido una cadena o un numero no entero
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
	
	//metodo que compara 2 enteros y devuelve un entero segun el resultado de la comparacion
	public static int compareTo(int numero1, int numero2) {
		
		if(numero1 > numero2) return 1;
		else if(numero1 < numero2) return 2;
		else return 0;
		
	}

}
