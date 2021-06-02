package Ejercicio01;

//librerias importadas
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class U08E01A {              //inicio clase
    private static Scanner stdin;           //para la lectura del fichero
    private static String cadena = "";      //para coger cada token y manipularlo
    private static ArrayList <Palabras> palabras = new ArrayList<>();   //arrayList donde guardamos Palabras
    private static Palabras temp;           //temporal donde iremos guardando Palabras para comparar
    private static boolean flag;            //bandera que nos permite saber si hay o no que almacenar nueva palabra
    private static int valor;               //para la busqueda de la palabra con mas repeticiones

    public static void main(String[] args) throws FileNotFoundException {   //inicio main

        //ponemos en marcha el crono
        long a = System.currentTimeMillis();    //empezamos a contar

        //fichero desde el cual vamos a trabajar
        File fichero = new File("C:\\temp\\quijote.txt");
        
        try {
            //indicamos desde vamos a coger los datos, en este caso el fichero
            stdin = new Scanner(fichero);

            while(stdin.hasNext()){     //mientras haya tokens
                //leemos token
                cadena = stdin.next();
                //limpiamos token
                cadena = cadena.replaceAll("[\\.\\,\\:\\/\\-\\*\\?\\¿\\¡\\!\\)\\(\\'\\@\\;\\n]","");
                //quitamos espacios
                cadena = cadena.trim();
                //pasamos token a minusculas
                cadena = cadena.toLowerCase();

                //primero vemos si la lista esta vacia y aï¿½adimos el primer elemento
                //al ser primer objeto le ponemos cero, porque en la primera comprobacion
                //se encontrará consigo mismo y por lo tanto se sumara 1 a su contador de apariciones.
                //posteriormente iremos poniendo el contador a 1 en cada objeto que creemos 
	        	if (palabras.size() == 0) {
	        		palabras.add(new Palabras(cadena,0)); 
	        	}

                //nos creamos un objeto temporal con la cadena que hemos creado
	        	temp  = new Palabras(cadena,0);
	        	
                //corremos el arrayList para ver si la palabra existe
               ListIterator<Palabras> li = palabras.listIterator();
               while ( li.hasNext()){   
                   flag = true;         
                   Palabras aux = (Palabras)li.next();  
                   //en este caso usamos el metodo equals de la clase String
                   //comparamos el atributo palabra de cada objeto del arrayList con el temporal
                   if(aux.getPalabra().equals(temp.getPalabra())) {
                       aux.setContador(1);      
                       flag = false;	
                       break;           
                   }
               }
               
               //en el caso de no encontrar la palabra, creamos el objeto correspondiente
               if(flag == true) {
                   palabras.add(new Palabras(cadena,1));
                   flag = true;
               }
            }
            
        } catch (FileNotFoundException e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Error de lectura del fichero");
			System.out.println(e.getMessage());
		}

        
         //creamos un para empezar la busqueda de la palabra mas larga
        temp = new Palabras(",",0);
        
        //volvemos a correr el array para encontrar la palabra de mas de 5 letras con mas repeticiones
        //llamamos al metodo comparaTo de Palabras para realizar la comparacion
        //segun la variable valor, almacenamos los datos en la variable temp 
        //con la que seguimos corriendo el arrayList y comparando
        ListIterator<Palabras> li = palabras.listIterator();
        while ( li.hasNext()){
            Palabras aux = (Palabras)li.next();
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

        /*for (Palabras i : palabras) {
            System.out.println(i.getPalabra() + " " + i.getContador() + " " + i.getPalabra().length());
        }*/

    }

    
    
}
