package Temario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejemplo13 {

    public static void main(String[] args) {

        List<Integer> numeros =  new ArrayList<>();
        List<Integer> numerosB =  new ArrayList<>();
        LinkedList<Integer> numerosC = new LinkedList<>();
        Set<Integer> numerosD = new TreeSet<>();
        Set<Integer> numerosE = new HashSet<>();

         //añadir elementos
        numeros.add(1);
        numeros.add(2);

        //tamaño de la coleccion
        System.out.println(numeros.size());

        //ver si esta vacia la coleccione
        System.out.println(numeros.isEmpty());

        //vaciar la coleccion
        numeros.clear();

        //añadir elementos
        numeros.add(1);
        numeros.add(2);

        //ver si contiene un objeto. Necesita un compareTo. Se pasa como parametro el valor
        System.out.println(numeros.contains(2));

        //borrar un elemento. Se pasa como paramatro la posicion
        System.out.println(numeros.remove(0));

        numerosB.add(3);
        numerosB.add(4);

        //añadir todos los elementos de un conjunto a otro
        numeros.addAll(numerosB);

        //comprobamos que los elementos de a estan en b
        System.out.println(numeros.containsAll(numerosB));

        //eliminar de un conjunto a los elementos que no estan en B
        numeros.retainAll(numerosB);

        //eliminar de un conjunt todos los elementos de A que estan en B
        numeros.removeAll(numerosB);

        numeros.add(1);
        numeros.add(2);

        //para crear un array de tipo object
        Object[] o= numeros.toArray();

        //para crear un array de un tipo concreto
        Integer[] arr = new Integer[numeros.size()];
        arr = numeros.toArray(arr);
        
        //correr la coleccion con un iterator
        Iterator<Integer> it = numeros.iterator();
        while( it.hasNext()){
            System.out.print(it.next() + " ");
        }

        //correr la coleccion con un for/each
        for (Integer i : numerosB) {
            System.out.print(i + " ");
        }

        numeros.addAll(numerosB);

        //obtiene el valor de una posicion
        System.out.println(numeros.get(2));

        //cambiar el valor de una posicion
        numeros.set(2,23);
        System.out.println(numeros.get(2));

        //añadir un elemento en una posicion y se corre el arraylist
        numeros.add(2, 32);
        System.out.println(numeros.get(2));

        //elimina el valor de una posicion y corre el arraylist
        numeros.remove(2);
        System.out.println(numeros.get(2));

        //devuelve la posicion de un objeto
        System.out.println(numeros.indexOf(23));

        //rellenamos el linkedlist
        for(int i = 0; i < 10; i++){
            numerosC.add((int)(Math.random() * 10 ) + 1);
        }

        //devuelve el primer valor de la lista
        System.out.println(numerosC.getFirst());

        //devuelve el ultimo valor de lista
        System.out.println(numerosC.getLast());

        //elimina el primero de la lista y lo devuelve. Lo mismo que remove y un pop
        numerosC.removeFirst();
        System.out.println(numerosC.getFirst());

        //elimina el ultimo de la lista y lo devuelve
        numerosC.removeLast();
        System.out.println(numerosC.getLast());

        //añade un elemento al inicio de la lista
        numerosC.addFirst(23);

        //añade un elemento a final de la lista
        numerosC.addLast(32);

        //ordenar una lista
        Collections.sort(numerosC);
        for (Integer i : numerosC) {
            System.out.print(i + " ");
        }

        //ordenar una lista de manera aleatoria
        Collections.shuffle(numerosC);
        for (Integer i : numerosC) {
            System.out.print(i + " ");
        }

        //se recomienda usar ListIterator
        /*ListIterator<String> iter = lista.listIterator();
        while(iter.hasNext()) 
        String item = iter.next();
        if(nuevoItem.compareTo(item) <= 0) {
        iter.previous();
        break;
        }
        }
        iter.add(nuevoItem);*/

        for(int i = 0; i < 10; i++){
            numerosD.add((int)(Math.random() * 100) + 1);
        }

        System.out.println("");

        for (Integer i : numerosD) {
            System.out.print(i + " ");
        }

    }
    
}
