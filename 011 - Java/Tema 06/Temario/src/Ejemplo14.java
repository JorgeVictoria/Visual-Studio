import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo14 {
    
    public static void main(String[] args) throws IOException {
        
        //variables locales
        DataOutputStream fo = null;
        DataInputStream fi = null;
        String nombre = null;
        int edad = 0;

        try{

            //crea o abre para añadir al archivo
            fo = new DataOutputStream(new FileOutputStream("secuencial.dat"));

            //metemos datos
            fo.writeUTF("Antonio Lopez Perez");
            fo.writeInt(33);
            fo.writeUTF("Pedro Piqueras Peñaranda");
            fo.writeInt(45);
            fo.writeUTF("Jose Antonio Ruiz Perez");
            fo.writeInt(51);
            fo.close(); //cerrar fichero

            //abrir para leer
            fi = new DataInputStream(new FileInputStream("secuencial.dat"));

            //leemos datos
            nombre = fi.readUTF();
            System.out.println(nombre);
            edad = fi.readInt();
            System.out.println(edad);
            nombre = fi.readUTF();
            System.out.println(nombre);
            edad = fi.readInt();
            System.out.println(edad);
            nombre = fi.readUTF();
            System.out.println(nombre);
            edad = fi.readInt();
            System.out.println(edad);
            fi.close();
        } catch(FileNotFoundException fnfe){
            fnfe.getMessage();
        } 
    } //fin del main
    
} //fin de la clase

