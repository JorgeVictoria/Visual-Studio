package Libro;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        
        //variables locales
        double fuerza;          //almacena la fuerza en newtons
        double distancia;       //almacena distancia en metros
        double angulo;          //almacena angulo en grados
        double trabajo;         //almacena el trabajo en julios

        Scanner stdin = new Scanner(System.in);     //entrada por teclado

        //pedimos datos para el calculo
        //pedimos fuerza
        System.out.print("Teclee fuerza (Newtons): ");
        fuerza = stdin.nextDouble();

        //pedimos distancia
        System.out.print("Teclee distancia (metros): ");
        distancia = stdin.nextDouble();

        //pedimos angulo
        System.out.print("Teclee angulo (grados): ");
        angulo = stdin.nextDouble();

        //calculamos el trabajo
        trabajo = fuerza * distancia * Math.cos(Math.toRadians(angulo));

        //imprimimos el trabajo
        System.out.printf("Trabajo = %.8f julios.", trabajo);

        //cerramos stdin
        stdin.close();
    }
    
}
