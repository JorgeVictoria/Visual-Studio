import java.util.Scanner;

public class DNI {

    public static void main(String[] args) {
        
        //variables locales
        String dni="";                          //dni del usuario
        Scanner stdin = new Scanner(System.in); //entrada por teclado
        boolean salir = false;                  //pedimos dni hasta que tenga el formato correcto
        boolean dniCorrecto;                    //para saber si el dni es correcto o no

        //pedimos datos
        while ( salir == false){
            System.out.print("DNI: ");
            dni = stdin.nextLine();
            if ( dni.matches("[0-9]{8}[A-Z]{1}")) salir = true;
        }

        //comprobamos si es correcto
        dniCorrecto = validaDNI(dni);

        //mostramos resultado
        if(dniCorrecto) {
            System.out.println("el dni " + dni + " es correcto.");
        }
        else{
            System.out.println("el dni " + dni + " es incorrecto.");
        }

        //cerramos stdin
        stdin.close();

    }

    public static boolean validaDNI(String unDni){

        //variables locales
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"}; //array con orden letras dni

        //cogemos la parte numerica del dni y la dividimos entre 23
        int numero = Integer.parseInt(unDni.substring(0, 8));
        int resto = numero %  23;

        //cogemos la letra de la posicion indicada por el resto y la comparamos con la ultima del dni
        if ( letras[resto].equals(unDni.substring(8))) return true;
        else return false;
    }
    
}
