package calculadoraSencilla;

import java.util.Scanner;

public class Calculadora {
	
	//variables globales
	public static Scanner stdin = new Scanner(System.in);

	public static void main(String[] args) {
		
		//variables locales
		double num1=0;		//numero a introducir
		double num2= 0;		//numero a introducir
		int opcion = 0;		//opcion del menu
		String seguir;
		
		//menu principal
		while(opcion != 6) {
			menuPrincipal();
			opcion = pedirOpcion();
			if(opcion != 6) {
				num1 = pedirNumero("num1");
				num2 = pedirNumero("num2");
				operacion(opcion,num1,num2);
				stdin.nextLine();
				System.out.print("Pulse una tecla para continuar.");
				seguir = stdin.nextLine();
			}
		}
	}
	
	public static void menuPrincipal() {
		
		//borrado de pantalla
		System.out.print("\033[H\033[2J");
		
		banner();
		
		System.out.println("1. Sumar.");
		System.out.println("2. Restar.");
		System.out.println("3. Multiplicar.");
		System.out.println("4. Dividir");
		System.out.println("5. Resto");
		System.out.println("6. Salir");
		System.out.println();
		
		
	}
	
	public static void banner() {
		
		//banner
		System.out.println("**************************");
		System.out.println("*** CALCULADORA BASICA ***");
		System.out.println("**************************");
		System.out.println();
	}
	
	public static int pedirOpcion() {
		
		//variables locales
		boolean salir = false;					//mientras sea false seguimos pidiendo datos
		
		int valor=0;							//valor que introducimos
		
		while(!salir) {
			salir = true;
			//pedimos dato por pantalla
			System.out.print("Elija una opcion(1-6):");
			//evaluamos la entrada
			try {
				valor = stdin.nextInt();
			//si la entrada no es correcta
			} catch (Exception e) {
				//limpiamos el salto de linea, si hemos introducido una cadena
				stdin.nextLine();
				//mostramos error por pantalla
				System.out.println("El valor introducido es incorrecto.");
				//como el dato es erroneo, seguimos en el bucle
				salir = false;
			}
			//si el valor es correcto, pero menor o igual que cero
			//mostramos error en pantalla
			//y seguimos en el bucle
			if ((valor <= 0 || valor >=7) && salir == true ) {
				System.out.println("El valor debe ser entre 1 y 6.");
				salir = false;
			}
		}
		
		//devolvemos un valor
		return valor;
		
	}
	
	public static double pedirNumero(String numero) {
		
		//variables locales
		boolean salir = false;					//mientras sea false seguimos pidiendo datos
		
		double valor=0;							//valor que introducimos
		
		while(!salir) {
			//suponemos que vamos a meter el dato correctamente
			salir = true;
			//pedimos dato por pantalla
			System.out.print("Introduzca el " + numero + " :");
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
		}
		
		//devolvemos un valor
		return valor;
		
	}
	
	public static void operacion(int opc, double num1, double num2) {
		
		switch(opc){
			case 1: System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
			case 2: System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
			case 3: System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					break;
			case 4: System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
					break;
			case 5:	System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es " + (num1%num2));
					break;
		}
		
	}


}
