import java.io.IOException;

public class Ejemplo02
 {
    public static void main(String[] args) {
        
        //variables locales
        StringBuilder str = new StringBuilder();    //cadena donde ir almacenando los caracteres
        char c;                                     //caracteres que vamos leyendo

        try {
            while (( c=(char)System.in.read()) != '\n'){    //mientras la entrada de teclado sea distinta de Intro
                str.append(c);                              //añadir el caracter leido a str
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //escribir por pantalla la cadena tecleada
        System.out.println("Cadena introducida: " + str);

    }
}
