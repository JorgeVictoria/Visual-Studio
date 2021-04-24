import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class Ejemplo01 {

    public static void main(String[] args) {

        String nomFichero = "D:\\One drive\\OneDrive\\Estudios\\Workspace\\Visual Studio\\Visual-Studio\\011 - Java\\Tema 05\\Documentos\\Ejemplo01.txt";
        cuentaPalanum(nomFichero);
        
    }

    
    public static void cuentaPalanum(String fichero) {
         //variables locales
         int np = 0; //almacena el numero de palabras
         int nn = 0; //almacena el numero de numeros
         int ta;     //almacena el token actual
         StreamTokenizer st = null; //se crea el objeto streamtokenizer
 
         try {
             st = new StreamTokenizer( new FileReader(fichero)); //iniciamos un filereader dentro del streamtokenizer
 
             while ((ta = st.nextToken()) != StreamTokenizer.TT_EOF) { //mientras no sea el ultimo token
 
                 if (st.ttype == StreamTokenizer.TT_WORD) np++; //si el token es una palabra, aumentamos el contador
                 else if (st.ttype == StreamTokenizer.TT_NUMBER) nn++; //si el token es un numero, aumentamos el contador
                     
             }
 
             //mostramos estadisticas por pantalla
             System.out.println("Palabras en el fichero: " + np);
             System.out.println("Numeros en el fichero: " + nn);
         } catch (FileNotFoundException e) {
             System.out.println(e.getMessage());
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
    }

}
