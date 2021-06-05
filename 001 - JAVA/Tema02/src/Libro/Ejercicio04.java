package Libro;

//librerias
import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String[] args) {

         //variables locales
        String nombre;                              //almacena el nombre del usuario
        Scanner stdin = new Scanner(System.in);     //para introducir el nombre por teclado

        //pedimos el nombre al usuario
        System.out.print("Como se llama? ");
        nombre = stdin.nextLine();

        //mostramos por pantalla el nombre en mayusculas
        System.out.println("Hola, " + nombre.toUpperCase() + ".");

        //cerramos el objeto scanner
        stdin.close();
        
    }

   

    
}
