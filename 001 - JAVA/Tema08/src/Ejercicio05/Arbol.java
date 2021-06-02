package Ejercicio05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arbol {

    private static int contador = 0;

    Nodo raiz;

    public Arbol(){
        raiz=null;
    }

    public void insertar(int i, NodoS palabra){
        Nodo n = new Nodo(i);
        n.contenido = palabra;

        if(raiz == null) {
            raiz=n;
        } else {
            Nodo aux = raiz;
            while ( aux!=null){
                n.padre=aux;
                if(n.llave >= aux.llave){
                    aux=aux.derecha;
                }else{
                    aux=aux.izquierda;
                }
            }

        if(n.llave < n.padre.llave){
            n.padre.izquierda = n;
        } else {
            n.padre.derecha = n;
        }
    }
        
}

    public void recorrer(Nodo n){
        if(n != null) {
            while(contador < 10){
                recorrer(n.izquierda);
                if(n.contenido.getNCaracteres() > 5){
                    int apariciones = n.contenido.buscarPalabra(n.contenido.getPalabra());
                    System.out.println("Indice " + n.llave + " palabra: " + n.contenido.getPalabra() + " aparece " + apariciones + " veces.");
                    contador++;
                }
                recorrer(n.derecha);
            }
        }
    }

   

    private class Nodo {

        //variables miembro
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public NodoS contenido;

        public Nodo(int indice){
            llave=indice;
            derecha=null;
            izquierda=null;
            padre=null;
            contenido=null;
        }
    }
    
}

class Principal{

    public static void main(String[] args) {

        Arbol miArbol = new Arbol();
        boolean puedoInsertar = false;
        String cadena;
        NodoS temp;
        int indice = 1;
        List<String> paraules = new ArrayList<>();

        //fichero desde el cual vamos a trabajar
        File fichero = new File("C:\\temp\\quijote.txt");
        
        try {
            //indicamos desde vamos a coger los datos, en este caso el fichero
            Scanner stdin = new Scanner(fichero);

            while(stdin.hasNext()){     //mientras haya tokens
                //leemos token
                cadena = stdin.next();
                //limpiamos token
                cadena = cadena.replaceAll("[\\.\\,\\:\\/\\-\\*\\?\\¿\\¡\\!\\)\\(\\'\\@\\;\\n\\<<\\>>]","");
                //quitamos espacios
                cadena = cadena.trim();
                //pasamos token a minusculas
                cadena = cadena.toLowerCase();
                //añadimos esa cadena al arrayList
                if (!paraules.contains(cadena)){
                    paraules.add(cadena);
                    puedoInsertar = true;
                    indice++;
                } 
                //con la cadena limpia, creamos el objeto NodoS
                temp = new NodoS(cadena);
                //si puedo insetar, creamos el nodo con un indice y el objeto
                if (puedoInsertar) miArbol.insertar(indice, temp);
                //ponemos el flag a false
                puedoInsertar = false;
            }
            
        } catch (FileNotFoundException e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Error de lectura del fichero");
			System.out.println(e.getMessage());
		}

        miArbol.recorrer(miArbol.raiz);

        
    }
}

class NodoS implements Comparable<NodoS>{

    //variables miembro
    String palabra;
    int nCaracteres;

    //constructor
    public NodoS(String pal){
        this.palabra = pal;
        this.nCaracteres = pal.length();
    }

    //getters
    public String getPalabra() { return this.palabra; }
    public int getNCaracteres() { return this.nCaracteres;}

    //setters
    public void setPalabra(String pal) { this.palabra = pal;}
    public void setNCaracteres(int cont) { this.nCaracteres = cont;}

    @Override
    public int compareTo(NodoS sub){
        int valor = this.getPalabra().compareTo(sub.getPalabra());
		return valor;
    }

    public int buscarPalabra(String paraula){
        String cadena;
        int contador=0;

        //fichero desde el cual vamos a trabajar
        File fichero = new File("C:\\temp\\quijote.txt");
        
        try {
            //indicamos desde vamos a coger los datos, en este caso el fichero
            Scanner stdin = new Scanner(fichero);

            while(stdin.hasNext()){     //mientras haya tokens
                //leemos token
                cadena = stdin.next();
                //limpiamos token
                cadena = cadena.replaceAll("[\\.\\,\\:\\/\\-\\*\\?\\¿\\¡\\!\\)\\(\\'\\@\\;\\n\\<<\\>>]","");
                //quitamos espacios
                cadena = cadena.trim();
                //pasamos token a minusculas
                cadena = cadena.toLowerCase();
                //añadimos esa cadena al arrayList
                if (paraula.equals(cadena)){
                    contador++;
                } 
            }
            
        } catch (FileNotFoundException e) {
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Error de lectura del fichero");
			System.out.println(e.getMessage());
		}

        return contador;

    }
}
