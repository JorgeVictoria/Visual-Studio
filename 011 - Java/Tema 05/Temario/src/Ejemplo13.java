import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo13 {
    
    public static void main(String[] args) {
        
        //variables locales
        int tama;

        try{

            //creamos un nuevo File, la ruta hasta el fichero
            File f = new File("destino");
            
            //construir el flujo de tipo FileInputStream
            //el objeto File (Conecta programa con fichero)
            FileInputStream entra = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(entra);

            //escribimos el tamaño del fichero en bytes
            tama = bis.available();
            System.out.println("Bytes disponibles: " + tama);

            //Indicar que vamos a intentar leer 50 bytes
            System.out.println("Leyendo 50 bytes...");

            //crear array de 50 bytes como buffer
            byte bArray[] = new byte[50];
            if (bis.read(bArray) != 50)
                System.out.println("No se pudieron leer 50 bytes");

            //crea un nuevo string a partir de los bytes
            System.out.println(new String(bArray, 0, 50));
            bis.close();
        } catch (IOException e){
            System.err.println("No se encuentra el fichero");
        }
    }
}
