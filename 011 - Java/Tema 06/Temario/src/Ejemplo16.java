import java.io.File;
import java.util.Scanner;

public class Ejemplo16 {
    
    public static void main(String[] args) {
        
        String nombre;  //Nombre del directorio
        File d;         //Directorio
        String[] f;     //Array de nombres de ficheros
        Scanner s;      //leer del usuarios

        s = new Scanner(System.in); //scanner lee entrada estandar

        System.out.print("Teclee un nombre de directorio: ");
        nombre = s.nextLine().trim();
        d = new File(nombre);

        if(!d.isDirectory()) {
            if(!d.exists()) System.out.println("No existe!");
            else System.out.println("No es un directorio.");
        } else {
            f = d.list();
            System.out.println("Ficheros en \"" + d + "\":");
            for(int i = 0; i < f.length; i++)
                System.out.println(" " + f[i]);
        }

        s.close();
    }
}
