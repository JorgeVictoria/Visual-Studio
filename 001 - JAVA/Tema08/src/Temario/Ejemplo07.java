package Temario;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ejemplo07 {

    public static void main(String[] args) {
        
        ArrayList aL = new ArrayList<>();
        for(int i = 0; i < 10; i++) aL.add(i);
        System.out.println(aL);                 //imprimimos todo el arrayList

        ListIterator li = aL.listIterator();
        while(li.hasNext()){
            int i = (Integer)li.next();
            System.out.print(i + " ");
            if(i % 2 == 0) {
                i++;
                li.set(i);  //reemplaza el elemento obtenido desde hasnext por el valor indicado
                li.add(i);  //inserta el valor antes del siguiente valor a recoger por next
            }
        }
        System.out.println();
        System.out.println(aL);
    }
    
}

/*Limitaciones de ListIterator:
• Solamente se aplica a clases que implementen List*/

/*// Dirección de principio a fin
public boolean hasNext();
public Object next();
public int nextIndex();
// Dirección de final al principio
public boolean hasPrevious();
public Object previous();
public int previousIndex();
// Otros
public void remove();
public void set(Object obj);
public void add(Object obj);*/
