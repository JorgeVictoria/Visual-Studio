package Temario;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo04 {

    public static void main(String[] args) {
        
        List<Deportista> listPer = new ArrayList<Deportista>();
        listPer.add(new Deportista("Pepe", "futbol"));
        listPer.add(new Deportista("Maria", "tenis"));
        imprimir(listPer);

    }

    public static void imprimir( List<? extends Persona> lista){
        for(Persona p: lista) {
            System.out.println(p.getNombre());
        }
    }
    
    
}

class Persona{

    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){return this.nombre;}

    public void setNombre(String nombre){this.nombre = nombre;}

}

class Deportista extends Persona{

    private String deporte;

    public Deportista(String nombre, String deporte){
        super(nombre);
        this.deporte = deporte;
    }

    public String getDeporte(){return deporte;}

    public void setDeporte(String deporte){this.deporte = deporte;}

}


