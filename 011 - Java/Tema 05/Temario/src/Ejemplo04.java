import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;

public class Ejemplo04 {
    
    public static void main(String[] args) {
        
        //variables locales
        String destino = "D:\\One drive\\OneDrive\\Estudios\\Workspace\\Visual Studio\\Visual-Studio\\011 - Java\\Tema 05\\Documentos\\Ejemplo04.txt";

        try {

            PrintWriter out = null;
            out = new PrintWriter(new FileWriter(destino, true));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s;
            while ( !(s = br.readLine()).equals("salir")) {
                out.println(s);
            }
            out.close();

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
