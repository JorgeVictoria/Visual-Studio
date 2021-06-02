package Temario;

import java.util.ArrayList;

import java.util.Iterator;

public class Ejemplo06 {

    public static void main(String[] args) {
        
        ArrayList aL = new ArrayList<>();
        for(int i = 0; i < 10; i++) aL.add(i);
        System.out.println(aL);                 //imprimimos todo el arrayList

        Iterator itr = aL.iterator();           //todavia no coge ningun elemento
        while (itr.hasNext()) {                 //mientras queden elementos que coger
            int i = (Integer)itr.next();        //cogemos el siguiente valor
            System.out.print(i + " ");
            if(i%2 != 0) itr.remove();          //elimina impares
        }                  
        System.out.println("\n" + aL);          //imprimimos el arrayList con los elementos pares
        
    }
    
}

/*Limitaciones de Iterator:
• Solo se recorren en una dirección.
• Cambiar y añadir elementos no está permitido. */

/*La interfaz Iterator define 3 métodos:
public boolean hasNext(); // true si hay más elementos
public Object next(); // siguiente elemento/NoSuchElementException
public void remove(); // Borra el siguiente elemento */
