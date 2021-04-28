import java.io.File;

public class Ejemplo05 {
    
    public static void main(String[] args) {
        
        String ruta = "D:\\One drive\\OneDrive\\Estudios\\Workspace\\Visual Studio\\Visual-Studio\\011 - Java\\Tema 05\\Documentos\\Ejemplo01.txt";

        ruta = separadoresOk(ruta);

        System.out.println(ruta);
    }

    private static String separadoresOk(String ruta) {

        //variables locales
        String separador = "\\";

        try{
            if(File.separator.equals(separador)) separador = "/";
            return ruta.replaceAll(separador, File.separator);
        }catch (Exception e){
            return ruta.replaceAll(separador+separador, File.separator);
        }
        
    }
}
