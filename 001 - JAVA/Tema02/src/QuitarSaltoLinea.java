import java.util.Scanner;

public class QuitarSaltoLinea {

    public static void main(String[] args) {
        
        //variables locales
        int edad;
        String nombre;
        Scanner stdin = new Scanner(System.in);

        //pedimos datos
        System.out.print("edad: ");
        edad = stdin.nextInt();
        stdin.nextLine();       //quitamos el salto de linea

        System.out.print("nombre: ");
        nombre = stdin.nextLine();

        //mostramos por pantalla
        System.out.println(nombre);
        System.out.println(edad);

        //cerramos stdin
        stdin.close();
    }
    
}
