import javax.swing.JFrame;

public class SimpleFrame extends JFrame {

    private static final int ANCHO = 300;
    private static final int ALTO = 200;

    public SimpleFrame() {
        setSize(ANCHO, ALTO);               //ancho y alto del JFRAME
        //setBounds(200, 200, ANCHO , ALTO);  //Pos x,y asi como ancho y alto del JFRAME
    }
    
}
