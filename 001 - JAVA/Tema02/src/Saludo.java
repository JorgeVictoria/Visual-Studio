import java.util.Scanner;

public class Saludo {

    //variables miembro
    String nombre;

    //constructor
    public Saludo(String nom){
        this.nombre = nom;
    }

    //getter
    public String getNombre() { return this.nombre;}

    //setter
    public void setNombre(String nom){ this.nombre = nom;}

    //metodo toString
    public String toString(){

        return "Hola, " + this.getNombre().toUpperCase();

    }
    
}

class Ej03 {

    public static void main(String[] args) {
        
        //variables locales
        Scanner stdin = new Scanner(System.in);
        String nombre = "";

        //preguntamos datos
        System.out.print("Como se llama? ");
        nombre = stdin.nextLine();

        //creamos objeto
        Saludo sal1 = new Saludo(nombre);

        //mostramos saludo por pantalla
        System.out.println(sal1.toString());

        //cerramos la entrada de datos
        stdin.close();

    }
}
