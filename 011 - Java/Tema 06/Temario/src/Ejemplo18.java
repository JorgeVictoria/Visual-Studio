import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Ejemplo18 {

    public static void main(String[] args) {
        
        File fichero = leerFichero();

        System.out.println(fichero.getName());

        writeFile();
    }

    public static File leerFichero() {

        JFileChooser fd = new JFileChooser();

        fd.setDialogTitle("Selecciona el fichero a leer");
        fd.setSelectedFile(null);
        int opcion = fd.showOpenDialog(null);

        if (opcion != JFileChooser.APPROVE_OPTION) return null;

        File f = fd.getSelectedFile();

        return f;
        
    }

    public static void writeFile() {

        JFileChooser fd = new JFileChooser();

        File f = new File("output.txt");
        fd.setSelectedFile(f);
        fd.setDialogTitle("Seleccione un fichero para escribir");
        int opcion = fd.showSaveDialog(null);
        if (opcion != JFileChooser.APPROVE_OPTION) return;
        f = fd.getSelectedFile();
        if(f.exists()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "El fichero \"" + f.getName() + "\" ya existe.\nLo reemplaza?", "Confirm Save", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (respuesta != JOptionPane.YES_OPTION)return;
        }

    }

    
    
}
