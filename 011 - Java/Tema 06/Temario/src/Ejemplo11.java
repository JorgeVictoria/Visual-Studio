import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejemplo11 {

    public static void main(String[] args) {
        
        //serializacion
        try {
            UnaClase ob1 = new UnaClase ("Hola", -7, 2.7e10);
            System.out.println("ob1: " + ob1.toString());
            FileOutputStream fos = new FileOutputStream("serial");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ob1);
            oos.flush();
            oos.close();
        } catch(IOException e){
            System.out.println("Fallo al serializar: " + e);
            System.exit(0);
        }

        //deserializar
        try {
            UnaClase ob2;
            FileInputStream fis = new FileInputStream("serial");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ob2 = (UnaClase)ois.readObject();
            ois.close();
            System.out.println("ob2: " + ob2.toString());
        } catch(Exception e) {
            System.out.println("Fallo al deserializar: " + e);
            System.exit(0);
        }

    }
    
}
