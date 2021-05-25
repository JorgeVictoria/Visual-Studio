package Ejercicio02;

public class U08E2 {

    public static void main(String[] args) {
        
        //creamos la cola, con la longitud por defecto
        ColaArrayInt cola = new ColaArrayInt();

        //llenamos la cola con numeros
        for(int i = 0; i < 4; i++){
            cola.encolar(i+1);
        }

        //imprimimos la cola
        System.out.println(cola.toString());

        //sacamos 1 numero
        cola.desencolar();

        //introuducimos otro numero
        cola.encolar(23);

        //imprimimos la cola
        System.out.println(cola.toString());

        //vaciamos la cola
        cola.vaciar();

        //imprimimos la cola. Debe salir una cadena vacia.
        System.out.println(cola.toString());

        //llenamos toda la cola
        for(int i = 0; i < cola.getMaxLongitud(); i++){
            cola.encolar(i+1);
        }

        //imprimimos la cola
        System.out.println(cola.toString());

        //intentamos insertar. 
        cola.encolar(23);
        

        //imprimimos la cola. Como la cola esta llena, el 23 no debe poder ser insertado
        System.out.println(cola.toString());

        //vaciamos un puesto y volvemos a intentar insertar el 23
        cola.desencolar();
        System.out.println(cola.toString());

        //
        cola.encolar(23);

       
        //imprimimos la cola. Ya debe aparecer el 23
        System.out.println(cola.toString());

        //desencolamos un par de numeros
        cola.desencolar();
        cola.desencolar();

        //mostramos la cola
        System.out.println(cola.toString());
        

    }

}
