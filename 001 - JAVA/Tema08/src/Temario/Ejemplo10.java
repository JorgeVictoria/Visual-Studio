package Temario;

import java.util.Objects;
import java.util.Scanner;

public class Ejemplo10 {

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {

        Personas p1 = new Personas(pedirNombre(), pedirApellido());
        Personas p2 = new Personas(pedirNombre(), pedirApellido());

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        
    }

    public static String pedirNombre(){

        System.out.print("Nombre: ");
        String nom = stdin.nextLine();
        return nom;

    }

    public static String pedirApellido(){

        System.out.print("Apellidos: ");
        String ape = stdin.nextLine();
        return ape;
        
    }
    
}

class Personas {

    //variables miembro
    private String nombre;
    private String apellidos;

    //construtor
    public Personas(String nom, String apes){
        this.nombre = nom;
        this.apellidos = apes;
    }

    //getters
    public String getNombre() { return nombre;}
    public String getApellidos() {return apellidos;}

    //setters
    public void setNombre(String nom) {this.nombre = nom;}
    public void setApellidos(String apes) { this.apellidos = apes;}

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;    //si es el mismo objeto
        if(obj == null) return false;   //el objeto es null
        if(getClass() != obj.getClass()) return false;  //los objetos no son de la misma clase
        Personas otra = (Personas) obj;
        if(apellidos == null) {
            if(otra.apellidos != null) return false;
        }
        else if(!apellidos.equals(otra.apellidos)) return false;
        if(nombre == null) {
            if(otra.nombre != null) return false;
        }
        else if(!nombre.equals(otra.nombre)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre,apellidos);
    }

    /*public int hashCode() {
        final int primo = 31;
        int resultado = 1;

        resultado = primo * resultado + ((apellidos == null) ? 0 : apellidos.hashCode());

        resultado = primo * resultado + ((apellidos == null) ? 0 : apellidos.hashCode());

        return resultado;

    }*/
}
