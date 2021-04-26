import java.io.File;
import java.io.FilenameFilter;

public class Ejemplo17 implements FilenameFilter {
    
    String extension;

    //constructor
    public Ejemplo17(String extension){this.extension = extension;}

    //metodo accept
    public boolean accept(File dir, String name){
        return name.endsWith(extension);
    }

    public static void main(String[] args) {
        try{
            File f = new File("carpeta1");
            String[] archivos = f.list();
            archivos = f.list(new Ejemplo17(".txt"));
            int num = archivos.length;
            if(num<1) System.out.println("No hay archivos que listar");
            else {
                for(int c=0; c<archivos.length; c++) System.out.println(archivos[c]);
            }

        } catch (Exception ex) {
            System.out.println("Error al buscar en la ruta");
        }
    }


}
