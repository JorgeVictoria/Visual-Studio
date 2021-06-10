package Libro;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        //variables locales
        int dniEntero;                             //almacenamos el dni de tipo entero
        String dniCadena;
        boolean correcto = false;
        Scanner stdin = new Scanner(System.in);    //para la entrada de datos por teclado

        //METODO 1: CON UN ENTERO. NO PODEMOS COMPROBAR LA LONGITUD DE LA CADENA
        //POR LO TANTO UN DNI POR DEBAJO DE 10 MILLONES ES INCORRECTO

        //preguntamos el dni
        System.out.print("Teclee DNI (8 digitos): ");
        dniEntero = stdin.nextInt();

        //comprobamos si es o no correcto
        if(dniEntero >= 0 && dniEntero <= 99999999) System.out.println("Correcto");
        else System.out.println("Incorrecto");

        //METODO 2: CON UN STRING, PERO SIN MATCHES

        //preguntamos por el dni
        System.out.print("Teclee DNI (8 digitos); ");
        stdin.nextLine();
        dniCadena = stdin.nextLine();

        //comprobamos si es correcto
        if (dniCadena.length() == 8) correcto = true;
        try {
            dniEntero = Integer.parseInt(dniCadena);
        } catch (Exception e) {
            correcto=false;
        }

        //mostramos por pantalla
        if ( correcto == true ) System.out.println("correcto");
        else System.out.println("incorrecto");
        

        //METODO 3: CON STRING MATCHES

        //comprobamos si es correcto
        correcto = dniCadena.matches("\\d{8}");

        //mostramos por pantalla
        if ( correcto == true ) System.out.println("correcto");
        else System.out.println("incorrecto");

        //cerramos stdin
        stdin.close();



    }
    
}
