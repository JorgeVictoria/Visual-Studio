package Ejercicio03;

import java.util.ArrayList;

public class ColaArrayT<T> {


    //variables miembro
    T obj;          //declara un objeto de tipo T
    private static final int LONGITUD_POR_DEFECTO = 10;
    ArrayList<T> prueba = new ArrayList<>();
    T[] datos ;

    //constructor
    public ColaArrayT(T o){
        obj = o;
        datos  = (T[]) new T[10];
    }

    
    
}
