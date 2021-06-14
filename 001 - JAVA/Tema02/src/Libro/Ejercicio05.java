package Libro;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        
        //variables locales
        double cantidad=0;                            //almacena la cantidad de dinero
        int monedas=0;                                //para escribir el numero de monedas
        Scanner stdin = new Scanner(System.in);     //entrada de datos por teclado

        //pedimos total de monedas y vamos calculando el total
        System.out.print("Cuantas monedas de 50 centimos? ");
        monedas = stdin.nextInt();
        cantidad = cantidad + (monedas * 0.50);

        System.out.print("Cuantas monedas de 20 centimos? ");
        monedas = stdin.nextInt();
        cantidad = cantidad + (monedas * 0.20);

        System.out.print("Cuantas monedas de 10 centimos? ");
        monedas = stdin.nextInt();
        cantidad = cantidad + (monedas * 0.10);

        System.out.print("Cuantas monedas de  5 centimos? ");
        monedas = stdin.nextInt();
        cantidad = cantidad + (monedas * 0.05);

        System.out.print("Cuantas monedas de  2 centimos? ");
        monedas = stdin.nextInt();
        cantidad = cantidad + (monedas * 0.02);

        System.out.print("Cuantas monedas de  1 centimo?  ");
        monedas = stdin.nextInt();
        cantidad = cantidad + (monedas * 0.01);

        //imprimos por pantalla el resultado
        System.out.printf("\nEn total tiene %.2f euros",cantidad);

        //cerramos el objeto scanner
        stdin.close();
    }
    
}
