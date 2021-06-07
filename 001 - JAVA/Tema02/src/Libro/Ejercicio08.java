package Libro;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        
        //variables locales
        String nombreCompleto;                          //para almacenar el nombre completo
        String nombre, ape1, ape2;                      //vamos almacenando cada bloque del nombre completo
        Scanner stdin = new Scanner(System.in);         //entrada por teclado
        String[] partes;                                //array donde guardaremos cada parte del nombre

        //pedimos el nombre completo
        System.out.print("Teclee su nombre y dos apellidos (sin particulas): ");
        nombreCompleto = stdin.nextLine();

        //almacenamos el nombre completo en un array. Lo dividimos por bloques, quitando el espacio en blanco
        partes = nombreCompleto.split(" ");

        //asignamaos a cada parte su bloque
        nombre = partes[0];
        ape1 = partes[1];
        ape2 = partes[2];

        //mostramos datos por pantalla
        System.out.println("Su nombre es " + nombre.toUpperCase() + " y tiene " + nombre.length() + " letras.");
        System.out.println("Su primer apellido es " + ape1.toUpperCase() + " y tiene " + ape1.length() + " letras.");
        System.out.println("Su segundo apellido es " + ape2.toUpperCase() + " y tiene " + ape2.length() + " letras.");

        //mostramos las iniciales
        System.out.println("Sus iniciales son " + nombre.charAt(0) + ape1.charAt(0) + ape2.charAt(0) + ".");

        //cerramos stdin
        stdin.close();

        
    }
    
}
