import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;

public class U07Ejemplo04 {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(
            new Runnable(){
                public void run() {
                    JFrame f = new MensajeFrame();
                    f.setTitle("Esto es GUIDAM");
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setVisible(true);
                }
            }
        );
    }
    
}

class MensajeFrame extends JFrame {

    public MensajeFrame() {
        add(new MensajeComponente() );
        pack(); 
    }
}

class MensajeComponente extends JComponent {
    public static final int MENSAJE_X = 75;
    public static final int MENSAJE_Y = 100;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGTH = 200;

    //metodo para pintar el texto
    public void paintComponent(Graphics g) {
        Font ssb14 = new Font("SansSerif", Font.BOLD, 14);
        g.setFont(ssb14);
        g.setColor(Color.BLUE);
        g.drawString("Esto es GUIDAM", MENSAJE_X , MENSAJE_Y);
        g.drawOval(10, 10, 20, 30);
        
    }

    //metodo para el tamaño del jframe
    public Dimension getPreferredSize() {
        return new Dimension (DEFAULT_WIDTH, DEFAULT_HEIGTH);
    }
}
