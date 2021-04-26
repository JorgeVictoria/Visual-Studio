import java.io.Console;

import javax.management.RuntimeErrorException;

public class Ejemplo08 {

    public static void main(String[] args) {
        
        Console c = System.console();
        if (c == null ) { throw new RuntimeErrorException(null, "No hay consola");}
        else{
            c.writer().println("Bienvenido al zoo");
            c.format("Nuestro zoo tiene 491 animales y 25 empleados.");
            c.writer().println();
            c.printf("Tiene una extension de %d Km2 y %1$d es mucho", 10);
        }
    }
    
}
