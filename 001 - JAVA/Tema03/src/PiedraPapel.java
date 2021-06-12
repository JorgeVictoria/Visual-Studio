import java.util.Scanner;

public class PiedraPapel {
    //variables globales
    private static String computer;        //almacena lo que saca el ordenador
    private static String jugador;         //almacena lo que saca el jugador

    public static void main(String[] args) {
        
        //variables locales
        Scanner stdin = new Scanner(System.in);
        int opcion = 0;         //opcion que elegimos
        boolean flag;           //para ver si juega el usuario

        while (opcion == 0){
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.println();
            System.out.print("Eija opcion(1-3)");
            try {
                opcion = stdin.nextInt();
            } catch (Exception e) {
                opcion = 0;
                stdin.nextLine();
            }
            if ( opcion > 0 && opcion < 4){
                flag = true;
            }
            else{
                opcion = 0;
                flag = false;
            }

            if(flag){
                jugador = getElemento(opcion);
                opcion = (int)(Math.random() * 3) + 1;
                computer = getElemento(opcion);

                System.out.println("Jugador: " + jugador + " - Computer: " + computer);

                String resultado = getResultado();
                System.out.println(resultado);
            }
        }

        //cerramos stdin
        stdin.close();
    }

    public static String getElemento(int opc){
        
        switch (opc){
            case 1 : return "Piedra";
            case 2 : return "Papel";
            case 3 : return "Tijera";
            default : return "";     
        }

    }

    public static String getResultado(){

        //variables locales
        String cadena = "";

        //vemos el ganador
        if(jugador.equals(computer)) cadena = "Empates";

        else if (jugador.equals("Piedra") && computer.equals("Tijera")) cadena = "Gana Jugador";
        else if (jugador.equals("Papel") && computer.equals("Piedra")) cadena = "Gana Jugador";
        else if (jugador.equals("Tijera") && computer.equals("Papel")) cadena = "Gana Jugador";

        else if (computer.equals("Piedra") && jugador.equals("Tijera")) cadena = "Gana Computer";
        else if (computer.equals("Papel") && jugador.equals("Piedra")) cadena = "Gana Computer";
        else if (computer.equals("Tijera") && jugador.equals("Papel")) cadena = "Gana Computer";

        return cadena;

    }
    
}
