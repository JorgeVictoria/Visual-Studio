package Libro;

public class Ejercicio03 {

    public static void main(String[] args) {
        
    //variables locales
    int dado1; //almacena el valor del dado 1
    int dado2; //almacena el valor del dado 2

    //calculamos el valor de los dos dados con un math random
    dado1 = (int)(Math.random()*6)+1;
    dado2 = (int)(Math.random()*6)+1;

    //imprimimos por pantalla el resultado
    System.out.println("El primer dado saca " + dado1);
    System.out.println("El segundo dado saca " + dado2);
    System.out.println("Tu tirada suma " +  (dado1+dado2));
    }
    
}
