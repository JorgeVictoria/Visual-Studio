package Libro;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        //variables locales
        int CaballoVapor;                       //almacena los caballos de vapor
        Scanner stdin = new Scanner(System.in); //entrada por teclado
        String cadena = "";                     //para almacenar el texto a mostrar
        String kilowatios;

        //pedimos los datos
        System.out.print("Teclee los CV: ");
        CaballoVapor = stdin.nextInt();

        //calculamos y mostramos por pantalla
        kilowatios = String.format("%.2f", CaballoVapor*0.735499);

        //montamos la cadena
        cadena = "Equivalen a " + kilowatios + " Kw";

        //reemplazamos la coma por el punto
        cadena = cadena.replaceFirst(",", ".");

        //mostramos la cadena
        System.out.println(cadena);

        //cerramos stdin
        stdin.close();
    }

    
}
