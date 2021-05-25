package Ejercicio03;

public class U08E03A {

    public static void main(String[] args) {
        
        //creamos las colas
        ColaArrayObj colaInt = new ColaArrayObj();
        ColaArrayObj colaString = new ColaArrayObj();
        ColaArrayObj colaPersonas = new ColaArrayObj();

        //cola de enteros
        colaInt.encolar(1);
        colaInt.encolar(2);
        colaInt.encolar(3);
        System.out.println(colaInt.toString());
        colaInt.desencolar();
        System.out.println(colaInt.toString());

        //cola de Strings
        colaString.encolar("Jorge");
        colaString.encolar("Victoria");
        colaString.encolar("Andreu");
        System.out.println(colaString.toString());
        colaString.desencolar();
        System.out.println(colaString.toString());

        //cola de Personas
        colaPersonas.encolar(new Persona("Jorge",  45 ));
        colaPersonas.encolar(new Persona("Victoria", 46));
        colaPersonas.encolar(new Persona("Andreu", 44));
        System.out.println(colaPersonas.toString());
        colaPersonas.desencolar();
        System.out.println(colaPersonas.toString());

    }
    
}

class Persona{

    //variables miembro
    String nombre;
    int edad;

    //constructor
    Persona(String n, int i){
        this.nombre = n;
        this.edad = i;
    }

    //getters
    public String getNombre(){return this.nombre;}
    public int getEdad(){return this.edad;}

    //setters
    public void setNombre(String s){this.nombre = s;}
    public void setEdad(int i){this.edad = i;}
}
