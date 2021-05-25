public class Dado {

    //variables miembro
    private int valor;
    private String nombre;

    //constructor
    public Dado(String nom){
        this.valor = calculaValor();
        this.nombre = nom;
    }

    //getter
    public int getValor() { return this.valor;}
    public String getNombre() { return this.nombre;}

    //setter
    public void setValor(int val) { this.valor = val;}
    public void setNombre(String nom) { this.nombre = nom;}

    //metodo que calcula un numero aleatorio
    public int calculaValor(){

        int val = (int)(Math.random() * 6 ) + 1;

        return val;

    }

    //metodo para escribir por pantalla el valor del dado
    @Override
    public String toString(){

        String cadena = "El valor de " + this.getNombre() + " es " + this.getValor();

        return cadena;

    }

}

class Ej02 {

    public static void main(String[] args) {

        //creamos dados
        Dado dado1 = new Dado("Dado 1");
        Dado dado2 = new Dado("Dado 2");

        //vemos su valor
        System.out.println(dado1.toString());
        System.out.println(dado2.toString());

        //imprimimos el total
        System.out.println("El valor total es: " + (dado1.getValor()+dado2.getValor()));
    
    }
}
