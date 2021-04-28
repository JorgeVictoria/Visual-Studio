import java.io.Serializable;

public class UnaClase implements Serializable {
    //variables globales
    String string;
    int i;
    double d;

    //constructor
    public UnaClase(String string, int i, double d) {
        this.string = string;
        this.i = i;
        this.d = d;

    }

    //metodo string
    public String toString() {
        return "s=" + string + "; i=" + i + "; d=" + d;
        
    }

}
