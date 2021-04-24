import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejemplo03 {

    public static void main(String[] args) {
        
        //variables locales
        String origen = "D:\\One drive\\OneDrive\\Estudios\\Workspace\\Visual Studio\\Visual-Studio\\011 - Java\\Tema 05\\Documentos\\Ejemplo01.txt";
        String destino = "D:\\One drive\\OneDrive\\Estudios\\Workspace\\Visual Studio\\Visual-Studio\\011 - Java\\Tema 05\\Documentos\\Ejemplo03.txt";

        //llamada a funcion
        copia(origen, destino);
    }

    public static void copia(String origen, String destino) {

        try {

            //obtener nombres ficheros origen y destino y abrir conexion a los ficheros
            InputStream entrada = new FileInputStream(origen);
            OutputStream salida = new FileOutputStream(destino);

            //crear una variable para leer el flujo de los bytes del origen
            byte[] buffer = new byte[256];

            while(true){
                int n = entrada.read(buffer);   //leer el flujo de bytes
                if(n<0) break;                  //si no queda nada por leer, salir
                salida.write(buffer, 0, n);     //escribir el flujo de bytes
            }
            //cerrar los ficheros
            entrada.close();
            salida.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
