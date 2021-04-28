import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Ejemplo09 {

    public static void main(String[] args) throws IOException {
        
        Console c = System.console();

        if(c == null) { throw new RuntimeErrorException(null, "Consola no disponible");}
        else {
            c.writer().print("Como ha ido el dia?");
            c.flush();
            String dia = c.readLine();
            String nombre = c.readLine("Su nombre: ");
            Integer edad = null;
            c.writer().print("Su edad? ");
            c.flush();
            BufferedReader br = new BufferedReader(c.reader());
            String valor = br.readLine();
            edad = Integer.valueOf(valor);
            c.writer().println();
            c.format("Se llama " + nombre);
            c.writer().println();
            c.format("Su edad es " + edad);
            c.printf(" y su dia ha ido " + dia);
        }
    }
    
}
