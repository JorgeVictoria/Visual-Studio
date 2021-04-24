import java.io.Console;
import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class Ejemplo10 {
    
    public static void main(String[] args) {
        
        Console c = System.console();

        if (c == null) { throw new RuntimeErrorException(null, "consola no existe");}
        else {
            char[] pwd = c.readPassword("Password: ");
            c.format("Teclee de  nuevo: ");
            c.flush();
            char[] verifica = c.readPassword();
            boolean ok = Arrays.equals(pwd, verifica);

            //eliminar los passwords de la memoria
            Arrays.fill(pwd,'x');
            Arrays.fill(verifica, 'x');
            c.format("Su password es " + (ok? "correcto": "incorrecto"));
        }
        
    }
}
