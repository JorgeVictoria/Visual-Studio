package Temario;

public class Ejemplo01 {

    public static void main(String[] args) {

        Gen<Integer> iOb;   //crea una referencia Gen para Integers
        iOb = new Gen<Integer>(28);     //le decimos el tipo en el diamante
        iOb.mostrarTipo();
        int v = iOb.getObj();   //no necesitas convertir
        System.out.println("Valor: " + v);
        System.out.println();

        Gen<String> strOb;
        strOb = new Gen<String>("Prueba de genericos");
        strOb.mostrarTipo();
        String str = strOb.getObj();
        System.out.println("Valor: " + str);
        
    }
}

class Gen<T> {      //T es el parametro de tipo generico

    //variables miembro
    T obj;          //declara un objeto de tipo T

    //constructor
    public Gen(T o){
        obj = o;
    }

    //getter
    public T getObj(){
        return obj;
    }

    //metodo para mostrar el tipo del objeto
    public void mostrarTipo(){
        System.out.println("El tipo de T es: " + obj.getClass().getName());
    }

}
