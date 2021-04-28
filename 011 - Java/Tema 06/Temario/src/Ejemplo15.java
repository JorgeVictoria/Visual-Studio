import java.io.File;

public class Ejemplo15 {
    
    public static void main(String[] args) {
        
        try{
            String d = "D:\\micarpeta";
            String varios = "carpeta1/carpeta2/carpeta3";

            //crear directorio padre
            boolean exito =  (new File(d)).mkdir();
            if(exito) System.out.println("Directorio: " + d + " creado");

            //crear subdirectorios de una ruta
            exito = (new File(varios)).mkdirs();
            if(exito) System.out.println("Directorios " + varios + " creados");
        } catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
