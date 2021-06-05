package Libro;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        
        //variables locales
        String nombreCompleto;                  //para almacenar el nombre completo
        String bloque;                          //vamos almacenando cada bloque del nombre completo
        String iniciales = "";                       //vamos almacenando las iniciales de cada bloque
        Scanner stdin = new Scanner(System.in); //entrada por teclado

        //pedimos el nombre completo
        System.out.print("Teclee su nombre y dos apellidos (sin particulas): ");
        nombreCompleto = stdin.nextLine();

        //cogemos el nombre
        //cogemos el trozo desde el inicio hasta el primer espacio en blanco. La primera letra del bloque la pasamos a iniciales. imprimimos el nombre
        bloque = nombreCompleto.substring(0, nombreCompleto.indexOf(" ", 0));
        iniciales = iniciales + bloque.charAt(0);  
        System.out.println("Su nombre es " + bloque.toUpperCase() + " y tiene " + bloque.length() + " letras.");

        //cogemos el primer apellido
        //cogemos el trozo desde el primer espacio en blanco hasta el segundo
        //La primera letra del bloque la pasamos a iniciales. imprimimos el apellido
        bloque = nombreCompleto.substring(nombreCompleto.indexOf(" ", 0), nombreCompleto.lastIndexOf(" "));
        bloque = bloque.trim();
        iniciales = iniciales + bloque.charAt(0); 
        System.out.println("Su primer apellido es " + bloque.toUpperCase() + " y tiene " + bloque.length() + " letras.");

        //cogemos el segundo apellido
        bloque = nombreCompleto.substring(nombreCompleto.lastIndexOf(" "), nombreCompleto.length());
        bloque = bloque.trim();
        iniciales = iniciales + bloque.charAt(0);  
        System.out.println("Su segundo apellido es " + bloque.toUpperCase() + " y tiene " + bloque.length() + " letras.");

        //mostramos las iniciales
        System.out.println("Sus iniciales son " + iniciales.toUpperCase() + ".");

        //cerramos stdin
        stdin.close();

        
    }
    
}
