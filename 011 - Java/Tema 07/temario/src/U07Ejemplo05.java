import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;

public class U07Ejemplo05 {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(
            new Runnable(){
                public void run() {
                    JFrame frame = new ImageFrame();
                    frame.setTitle("ImagenTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
    
}

class ImageFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public ImageFrame() {
        add(new ImageComponent());
        pack();
    }
}

class ImageComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGTH = 200;
    private Image imagen;

    public ImageComponent() {
        imagen = new ImageIcon("circulo.png").getImage();
    }

    public void paintComponent(Graphics g) {
        if(imagen == null) return;
        int iAncho = imagen.getWidth(this);
        int iAlto = imagen.getHeight(this);
        //dibujar la imagen en la esquina superior izq.
        g.drawImage(imagen, 0, 0, null);
        //copiar ese area al resto
        for(int i = 0; i  <= 3; i++)
            for (int j = 0; j<= 3; j++)
            if(i + j > 0) g.copyArea(0, 0, iAncho, iAlto,i*iAncho,j*iAlto);
    }

    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGTH);
    }
}
