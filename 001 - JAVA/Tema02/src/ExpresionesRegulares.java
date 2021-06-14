import java.util.Scanner;

public class ExpresionesRegulares {

    public static void main(String[] args) {
        
        //variables globales
        boolean correcto;
        boolean salir = false;
        Scanner stdin = new Scanner(System.in);
        String cadena;
        

        while (salir == false){
            System.out.print("cadena:");
            cadena = stdin.nextLine();
            if (cadena.equals("")) salir = true;
            correcto = cadena.matches("abc");
            System.out.println(correcto);
        }

        //cerramos stdin
        stdin.close();

    }
    
}
