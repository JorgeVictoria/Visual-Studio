package Temario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejemplo12 {

    public static void main(String[] args) {
        
        JugadorFutbol messi = new JugadorFutbol("Messi", 20, 1000);
        JugadorFutbol cr7 = new JugadorFutbol("Cristiano", 17, 800);
        JugadorFutbol Mbappe = new JugadorFutbol("Mbappe", 22, 900);

        ArrayList<JugadorFutbol> lj = new ArrayList<>();

        lj.add(messi);
        lj.add(cr7);
        lj.add(Mbappe);

        //Ordenar usando comparable (por goles)
        Collections.sort(lj);
        System.out.println("Jugadores ordenador por goles");

        for(JugadorFutbol f: lj) System.out.println(f);

        //ordenar y mostrar usando ficha
        System.out.println("Jugadores ordenados por ficha");
        lj.sort(
            new Comparator<JugadorFutbol>(){
                public int compare(JugadorFutbol j1, JugadorFutbol j2){
                    if(j1.getFicha() > j2.getFicha()) return 1;
                    if(j1.getFicha() < j2.getFicha()) return -1;
                    return 0;
                }
            }
        );
        for(JugadorFutbol f: lj) System.out.println(f);
    }
    
}

class JugadorFutbol implements Comparable<JugadorFutbol> {

    private String nombre;
    private int goles;
    private double ficha;

    public JugadorFutbol(String n, int g, double f) {
        nombre = n;
        goles = g;
        ficha = f;
    }

    public String getNombre() { return nombre;}
    public int getGoles() { return goles;}
    public double getFicha() {return ficha;}

    //implementar Comparable<T>
    public int compareTo(JugadorFutbol f) {
        if(goles > f.goles) return 1;
        if(goles < f.goles) return -1;
        return 0;
    }

    public String toString() {
        return String.format("%s %d goles y %.2fEuros", nombre, goles, ficha);
    }
}
