package unidadesVelocidad;

import java.util.Scanner;

public class Principal {
    //variables globales
    private static Scanner stdin = new Scanner(System.in); //entrada por teclado

    public static void main(String[] args) {
        
        //variables locales
        int opcion = 0;                         //opcion del menu

        //creamos el objeto. De momento no pasamos nimgun parametro. Usaremos los setters posteriormente
        UnidadVelocidad vel1 = new UnidadVelocidad();

        //menu principal. Mientras opcion no sea 3, permanecemos dentro
        while(opcion != 3){
            banner();
            System.out.println(" 1. Pasar de Km/h a m/s");
            System.out.println(" 2. Pasar de m/s a Km/h");
            System.out.println(" 3. Salir");
            System.out.println();
            System.out.print(" Elija una opcion(1-3): ");
            try {
                opcion = stdin.nextInt();
            } catch (Exception e) {
                opcion = 0;
                stdin.nextLine();   //coge los saltos de linea
            }
            //if(opcion <= 0 || opcion > 3) System.out.println(" Opcion incorrecta.");

            //vamos a realizar diferentes operaciones
            switch(opcion){
                case 1: vel1.setVelocidad(pedirVelocidad("Km/h"));
                        vel1.setMedida("Km/h");
                        System.out.println(vel1.toString());
                        break;
                case 2: vel1.setVelocidad(pedirVelocidad("m/s"));
                        vel1.setMedida("m/s");
                        System.out.println(vel1.toString());
                        break;
                case 3: System.out.println("\nQue pase un buen dia.");
                        break;
                default:System.out.println(" Opcion incorrecta");
            } //fin del switch
            
        } //fin de while

        //cerramos stdin
        stdin.close();

    }   //fin del main

    private static void banner(){
        System.out.println();
        System.out.println("    CAMBIO UNIDADES VELOCIDAD KM/H A M/S");
        System.out.println("    ************************************");
        System.out.println();
    }   //fin de banner

    private static double pedirVelocidad(String unidad){

        //variables locales
        double vel = 0;
        boolean salir = false;

        //pedimos datos
        banner();
        while (!salir){
            System.out.print("Teclee velocidad en " + unidad + ":");
            try {
                salir = true;
                vel = stdin.nextDouble();
            } catch (Exception e) {
                stdin.nextLine();
                salir = false;
            }
            if(!salir || vel < 0) System.out.println("Velocidad incorrecta");
        }

        return vel;


    } //fin fde pedir velocidad
    
}   //fin de la clase
