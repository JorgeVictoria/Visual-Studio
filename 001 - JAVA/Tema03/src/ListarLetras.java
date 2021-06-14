import java.util.Scanner;

public class ListarLetras {

    public static void main(String[] args) {
        
        //variables locales
        Scanner stdin = new Scanner(System.in); //entrada por teclado
        String cadena;                          //Linea de texto del usuario
        int contador = 0;                       //numero de letras distintas
        char letra;                             //una letra

        //entrada de datos
        System.out.print("Teclee un texto: ");
        cadena = stdin.nextLine().toUpperCase();

        //vemos el resultado
        System.out.println("Las letras que aparcen son: ");
        System.out.println();
        System.out.print(" ");
        for (letra = 'A'; letra <= 'Z'; letra++){
            int i;                                      //posicion del caracter en el String
            for (i = 0; i < cadena.length();i++){
                if (letra == cadena.charAt(i)){
                    System.out.print(letra + " - ");
                    contador++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Hay " + contador + " letras distintas.");

        //cerramos stdin
        stdin.close();

    }
    
}
