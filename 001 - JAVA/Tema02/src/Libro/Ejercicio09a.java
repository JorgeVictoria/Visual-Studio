package Libro;

import java.util.Scanner;

public class Ejercicio09a {

    public static void main(String[] args) {
        
        //variables globales
        String nombre;                          //nombre del alumno
        double nota1,nota2,nota3;               //notas del curso
        double media;                           //nota media del curso
        Scanner stdin = new Scanner(System.in); //entrada por teclado

        //entrada de datos
        nombre = stdin.nextLine();
        nota1 = stdin.nextDouble();
        nota2 = stdin.nextDouble();
        nota3 = stdin.nextDouble();

        //calculamos la media
        media = (nota1+nota2+nota3)/3;

        //imprimimos datos por pantalla
        System.out.println("  Alumno: " + nombre);
        System.out.println("  Notas: " + nota1 + ", " + nota2 + " y " + nota3);
        System.out.printf("  Media: %.2f ",media);

        //cerramos stdin
        stdin.close();

    }
    
}
