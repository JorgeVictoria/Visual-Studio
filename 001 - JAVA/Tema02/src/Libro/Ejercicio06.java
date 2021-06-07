package Libro;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        
        //variables locales
        int cantHuevos;                             //almacena la cantidad de huevos que tenemos
        int cantPack;                               //almacena la cantidad de packs
        Scanner stdin = new Scanner(System.in);     //entrada de datos por teclado
        String cadena="Necesitas:\n  ";                              //el texto a imprimir

        //pedimos la cantidad de datos que tenemos
        System.out.print("Cuantos huevos han puesto hoy? ");
        cantHuevos = stdin.nextInt();

        //vamos dividiendo por packs de huevos
        //primero packs grandes
        cantPack = cantHuevos/144;
        cantHuevos = cantHuevos%144;
        cadena = (cantPack == 1)? cadena + cantPack + " envase grande.\n  ": cadena + "";
        cadena = (cantPack > 1)? cadena + cantPack + " envases grandes.\n  ": cadena + "";

        //envases por docenas
        cantPack = cantHuevos/12;
        cantHuevos = cantHuevos%12;
        cadena = (cantPack == 1)? cadena + cantPack + " envase de una docena.\n  ":cadena + "";
        cadena = (cantPack > 1)? cadena + cantPack + " envases de una docena.\n  ":cadena +  "";

        //envases de media docena
        cantPack = cantHuevos/6;
        cantHuevos = cantHuevos%6;
        cadena = (cantPack == 1)? cadena + cantPack + " envase de media docena.\n  ":cadena + "";
        cadena = (cantPack > 1)? cadena + cantPack + " envases de media docena.\n  ": cadena + "";

        //huevos sueltos
        cadena = (cantHuevos == 1)? cadena + "Te queda 1 huevo sin envasar.":cadena + "";
        cadena = (cantHuevos > 1)? cadena + "Te quedan "  + cantHuevos + " sin envasar.":cadena + "";

        //imprimimos la cadena
        System.out.println(cadena);

        //cerramos stdin
        stdin.close();
        
    }
    
}
