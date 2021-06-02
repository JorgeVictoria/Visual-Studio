package Temario;

import java.util.Enumeration;
import java.util.Vector;

public class Ejemplo05 {

    public static void main(String[] args) {
        
        Vector v = new Vector<>();
        for(int i = 0; i < 10; i++) v.addElement(i);
        System.out.println(v); //imprime todo el vector
        Enumeration e = v.elements();           //primero coge el primer elemento del vector
        while(e.hasMoreElements()){             //mientras queden mas elementos
            int i = (Integer)e.nextElement();   //coge el siguiente elemento
            System.out.print(i + " ");
        }
    }
    
}

//limitaciones de enumeration
/*Solo se puede utilizar en las clases Vector y Hashtable.
• No puedes borrar elementos usando Enumeration.
• Solo puedes recorrer los elementos en una dirección.*/

/*metodos que implementa
- comprobar si la colección tiene más elementos
public boolean hasMoreElements();
- Obtener siguiente elemento, si no hay NoSuchElementException
public Object nextElement();*/
