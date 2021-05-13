package Temario;

public class Ejemplo02 {

    public static void main(String[] args) {
        
        DosGen<Integer, String> dosGen = new DosGen<Integer, String>(28,"Generics");
        dosGen.mostrarTipo();
        int v = dosGen.getOb1();
        System.out.println("Valor: " + v);
        String str = dosGen.getOb2();
        System.out.println("Valor: "  + str);
    }

    
    
}


class DosGen<T, V> {

    //variables globales
    T ob1;  //Declara un objeto de tipo T
    V ob2;  //Declara un objeto de tipo V

    //constructor
    DosGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    //getters
    T getOb1(){return ob1;}
    V getOb2(){return ob2;}

    //metodo que muestra el tipo del objeto
    void mostrarTipo(){
        System.out.println("El tipo de T es: " + ob1.getClass().getName());
        System.out.println("El tipo de V es: " + ob2.getClass().getName());
    }
}

