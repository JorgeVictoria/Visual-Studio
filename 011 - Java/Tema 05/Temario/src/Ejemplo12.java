import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejemplo12 {
    
    public static void main(String[] args) throws IOException {
        
        FileInputStream fichero;

        try{
            //elegir fichero para leer flujo de bytes "crudos"
            fichero = new FileInputStream("destino");

            //InputStreamReader como puente de flujos byte a caracter
            InputStreamReader isr = new InputStreamReader(fichero);

            //vemos la codificacion
            System.out.println(isr.getEncoding());

            isr.close();

        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}