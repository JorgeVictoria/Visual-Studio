package Temario;

public class Ejemplo09 {

    public static void main(String[] args) {
    
        Carta carta1 = new Carta(3, 2);
        Carta carta2 = new Carta(4, 2);

        boolean esIgual = carta1.equals(carta2);

        System.out.println(esIgual);

    }
    
}

class Carta {

    //variables globales
    private int palo;
    private int valor;

    //constructor
    public Carta(int pal, int val){
        this.palo = pal;
        this.valor = val; 
    }

    //metodo equals para ver si las cartas son iguales
    public boolean equals(Object obj){
        try {
            Carta otra = (Carta)obj; //le hacemos casting
            if(palo == otra.palo && valor == otra.valor) { return true;}
            else return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

/*Sin equals() en la clase T, los métodos contains() y remove() de
Collection<T> no funcionan bien.*/ 
