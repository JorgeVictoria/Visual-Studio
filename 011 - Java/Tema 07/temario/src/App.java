import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        
        EventQueue.invokeAndWait(
            new Runnable(){
                public void run() {

                    JFrame f = new JFrame();
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setBounds(100, 100, 450, 300);
                    f.setVisible(true);
                    f.getContentPane().setLayout(null);

                    JButton bAceptar = new JButton("Aceptar");

                    
                    bAceptar.setBounds(10,140,89,23);
                    f.getContentPane().add(bAceptar);
            

                } //metodo run de runnable
            }//clase y objeto Runnable, es una clase  anomima
        ); //llamada a EventQueue.invokelater()
    }
}
