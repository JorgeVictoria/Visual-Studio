package Libro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio09b {

    public static void main(String[] args) throws IOException {
        
        //variables locales
        //variables globales
        String nombre;                                      //nombre del alumno
        double nota1,nota2,nota3;                           //notas del curso
        double media;                                       //nota media del curso
        Scanner stdin;                                      //entrada desde fichero
        File notas = new File("C:\\temp\\notas.txt");       //Fichero donde tenemos los datos
        List<String> datos = new ArrayList<>();             //aqui iremos almacenando las palabras que leemos desde el fichero
        FileWriter fichero = null;                          //ruta donde guardaremos los datos
        PrintWriter pw = null;                              //para escribir en el fichero

        //leemos del fichero y almacenamos en el array
        stdin = new Scanner(notas); 
        while(stdin.hasNext()){
            String line = stdin.next();
            datos.add(line);
        }

        //cogemos los datos del array los pasamaos a las variables. Casting para los doubles
        nombre = datos.get(0);
        nota1 = Double.parseDouble(datos.get(1));
        nota2 = Double.parseDouble(datos.get(2));
        nota3 = Double.parseDouble(datos.get(3));

        //calculamos la media
        media = (nota1+nota2+nota3)/3;

        //imprimimos datos por pantalla
        System.out.println("  Alumno: " + nombre);
        System.out.println("  Notas: " + nota1 + ", " + nota2 + " y " + nota3);
        System.out.printf("  Media: %.2f ",media);

        //cerramos el stdin
        stdin.close();

        //pasarlo a fichero externo
        try{
            fichero = new FileWriter("C:\\temp\\pruebas.txt");
            pw = new PrintWriter(fichero);

            pw.println("  Alumno: " + nombre);
            pw.println("  Notas: " + nota1 + ", " + nota2 + " y " + nota3);
            pw.printf("  Media: %.2f ",media);

        }catch( Exception e) {
            e.printStackTrace();
        } finally {
            fichero.flush();
            fichero.close();
        }

        
    }
    
}
