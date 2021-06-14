package libro;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        //variables locales
        int dado1, dado2;                       //dados del juego
        int contador=0;                         //cuenta cuantas veces tiramos los dados hasta salir snake eyes
        Scanner stdin = new Scanner(System.in); //entrada por teclado
        boolean snakeEyes = false;              //para permanecer en el bucle hasta que salgan snake eyes

        //empezamos partida
        while (!snakeEyes){
            System.out.print("Pulse ENTER para tirar: ");
            stdin.nextLine();
            dado1 = (int)(Math.random() * 6 ) + 1;
            dado2 = (int)(Math.random() * 6 ) + 1;
            System.out.printf("dado 1: %2d - dado 2: %2d%n", dado1, dado2);
            contador++;
            if(dado1 == 1 && dado2 == 1) snakeEyes = true;
        }

        //mostramos por pantalla
        System.out.println("SNAKE EYES");
        if(contador == 1) System.out.println("Ha sido necesaria solo una tirada.");
        else{
            System.out.println("Han sido necesarias " + contador + " tiradas.");
        }

        //cerramos stdin
        stdin.close();


    }
    
}
