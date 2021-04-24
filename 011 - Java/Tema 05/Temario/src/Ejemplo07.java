import java.io.Console;

public class Ejemplo07 {

    public static void main(String[] args) {
        
        Console c = System.console();
        if( c != null ) {
            String entrada = c.readLine();
            while (!entrada.equals("salir")){
                c.writer().println("Ha tecleado: " + entrada);
                entrada = c.readLine();
            }
            
        }
    }
    
}
