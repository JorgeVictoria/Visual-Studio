package Ejercicio03;

public class U08E03B {

    public static void main(String[] args) {
        
        ColaArrayT<Integer> cola1 = new ColaArrayT<Integer>(1);
        ColaArrayT<String> cola2 = new ColaArrayT<String>("h");
        ColaArrayT<Persona> cola3 = new ColaArrayT<Persona>(new Persona("Jorge", 10));

         //cola de enteros
         cola1.encolar((Integer)1);
         cola1.encolar((Integer)2);
         cola1.encolar((Integer)3);
         System.out.println(cola1.toString());
         cola1.desencolar();
         System.out.println(cola1.toString());
 
         //cola de Strings
         cola2.encolar((String)"Jorge");
         cola2.encolar((String)"Victoria");
         cola2.encolar((String)"Andreu");
         System.out.println(cola2.toString());
         cola2.desencolar();
         System.out.println(cola2.toString());
 
         //cola de Personas
         cola3.encolar(new Persona("Jorge",  45 ));
         cola3.encolar(new Persona("Victoria", 46));
         cola3.encolar(new Persona("Andreu", 44));
         System.out.println(cola3.toString());
         cola3.desencolar();
         System.out.println(cola3.toString());
    }
    
    
}
