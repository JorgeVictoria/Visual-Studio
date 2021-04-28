import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;

public class U07Ejemplo03 {

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        
        EventQueue.invokeAndWait(
            new Runnable(){
                public void run() {
                    SimpleFrame f = new SimpleFrame();
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   // f.setUndecorated(true);   //quita la decoracion
                    //f.setLocation(100, 100);    //para posicionar en pantalla el JFrame
                    f.setLocationByPlatform(true);  //el sistema gestor de ventanas del SO decide la posicion
                    f.setVisible(true);
                    f.setResizable(false); //se puede o no cambiar el tamaño de pantalla. Por defecto, true.
                    f.setTitle("Ejemplo03"); //titulo para la barra de titulos

                    //averiguar la resolucion de pantalla
                    Toolkit kit = Toolkit.getDefaultToolkit();
                    Dimension pantalla = kit.getScreenSize();
                    int ancho = pantalla.width;
                    int alto = pantalla.height;
                    System.out.println("Ancho: " + ancho + " Alto: " + alto);
                    
                    
                    
                } //metodo run de runnable
            }//clase y objeto Runnable, es una clase  anomima
        ); //llamada a EventQueue.invokelater()
    }
}


