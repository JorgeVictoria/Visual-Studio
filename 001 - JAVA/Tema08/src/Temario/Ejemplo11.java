package Temario;

import java.util.Scanner;

public class Ejemplo11 {

    private static Scanner stdin = new Scanner(System.in);
    private static int contador = 1;

    public static void main(String[] args) {

        NombreComp nc1 = new NombreComp(pedirNombre(), pedirApellido(), pedirApellido());
        NombreComp nc2 = new NombreComp(pedirNombre(), pedirApellido(), pedirApellido());

        System.out.println(nc1.equals(nc2));
        System.out.println(nc1.compareTo(nc2));
        
    }

    public static String pedirNombre(){

        System.out.print("Nombre: ");
        String nom = stdin.nextLine();
        return nom;

    }

    public static String pedirApellido(){

        System.out.print("Apellido " + contador + " :");
        String ape = stdin.nextLine();
        contador++;
        if (contador == 3) contador = 1;
        return ape;
        
    }
    
}

class NombreComp implements Comparable<NombreComp> {
    
    private String nombre, ape1, ape2;
    
    public NombreComp(String n, String a1, String a2){ 
        if ( n == null || a1 == null || a2 == null) throw new IllegalArgumentException("Datos forzosos");
        nombre = n;
        ape1 = a1;
        ape2 = a2;
    }

    public boolean equals(Object obj) {
        try {
            NombreComp nc = (NombreComp)obj;
            return nombre.equals(nc.nombre) && ape1.equals(nc.ape1) && ape2.equals(nc.ape2);
        }catch (Exception e) {
            return false;
        }
    }

    public int compareTo(NombreComp nc) {
        String temp = nc.ape1 + nc.ape2 + nc.nombre;
        String este = ape1 + ape2 + nombre;
        return este.compareTo(temp);
    }
}
