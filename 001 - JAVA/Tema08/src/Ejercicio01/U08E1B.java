package Ejercicio01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class U08E1B {

    private static Scanner stdin;           //para la lectura del fichero
    private static String cadena = "";      //para coger cada token y manipularlo
    private static Set <Palabras> palabras = new TreeSet<>();   //Treeset donde guardamos Palabras
    private static Palabras temp;           //temporal donde iremos guardando Palabras para comparar
    //private static boolean flag;            //bandera que nos permite saber si hay o no que almacenar nueva palabra
    private static int valor;               //para la busqueda de la palabra con mas repeticiones
    private static int contador=0;

    public static void main(String[] args) throws FileNotFoundException {   //inicio main

        //ponemos en marcha el crono
        long a = System.currentTimeMillis();    //empezamos a contar

        //fichero desde el cual vamos a trabajar
        File fichero = new File("C:\\workspace\\quijote.txt");
        
        try {
            //indicamos desde vamos a coger los datos, en este caso el fichero
            stdin = new Scanner(fichero);

            while(stdin.hasNext()){     //mientras haya tokens
                //leemos token
                cadena = stdin.next();
                //limpiamos token
                cadena = cadena.replaceAll("[\\.\\,\\:\\/\\-\\*\\?\\¿\\¡\\!\\)\\(\\'\\@\\;\\n\\<<\\>>]","");
                //quitamos espacios
                cadena = cadena.trim();
                //pasamos token a minusculas
                cadena = cadena.toLowerCase();

                temp = new Palabras(cadena, 0);

                palabras.add (new Palabras(cadena,1));
                if(temp.getPalabra().equals("quijote")) contador++;

            }
            
        } catch (FileNotFoundException e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Error de lectura del fichero");
			System.out.println(e.getMessage());
		}

        temp = new Palabras(",",0);

        Iterator<Palabras> it = palabras.iterator();
        while (it.hasNext()){
            Palabras aux = (Palabras)it.next();
            valor = aux.compara(temp);
            if(valor > 0) {
                temp.setPalabra(aux.getPalabra());
                temp.ponContador(aux.getContador());
            }
        }


        //paramos el crono y calculamos el tiempo transcurrido
        long b = System.currentTimeMillis();
        long total = b - a;
        total = TimeUnit.MILLISECONDS.toSeconds(total);

        //mostramos datos por pantalla
        System.out.println("palabras localizadas: "+ palabras.size());
        System.out.println("Palabra: " + temp.getPalabra());
        System.out.println("Numero repeticiones: " + temp.getContador());
        System.out.println("Tiempo transcurrido: " + total + " segundos");
        System.out.println(contador);

        


    }

    
    
}
    

