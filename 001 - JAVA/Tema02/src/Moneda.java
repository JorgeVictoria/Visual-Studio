import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Moneda {
    
    //variables miembro
    private double valor;
    private String tipo;
    private int cantidad;

    //constructor
    public Moneda(double val, String tip){
        this.valor = val;
        this.tipo = tip;
        this.cantidad = 0;
    }

    //getters
    public double getValor() { return this.valor;}
    public String getTipo() { return this.tipo;}
    public int getCantidad() { return this.cantidad;}

    //setters
    public void setValor(double val) { this.valor = val;}
    public void setTipo(String tip) { this.tipo = tip; }
    public void setCantidad(int cant) { this.cantidad = cant;}
 
}

class Monedero {

    //variables miembro
    double total;
    Moneda[] cartera = new Moneda[8];

    //constructor
    public Monedero(){
        this.total = 0;
    }

    //getters
    public double getTotal() { return this.total;}

    //setters
    public void setTotal(double tot) { this.total = tot; }

    //metodo para ir introduciendo las monedas que tenemos
    public void cuantasMonedas() {
 
        Scanner stdin = new Scanner(System.in);

        for(int i = 0; i < this.cartera.length; i++){
            System.out.print("Total monedas de " + this.cartera[i].getValor() + " " + this.cartera[i].getTipo() + ": ");
            this.cartera[i].setCantidad(stdin.nextInt());
        }

        stdin.close();

    }

    //metodo para contar el dinero
    public void cuentaDinero(){

        double total = 0;

        for(int i = 0; i < this.cartera.length; i++){
            total = total + this.cartera[i].getValor() * this.cartera[i].getCantidad();
        }
        
        this.setTotal(total);
    }

    //metodo para imprimir el dinero
    @Override
    public String toString(){

        String cadena = "En la cartera hay " + this.getTotal() + " euros";

        return cadena;

    }

}

class Ej04 {

    public static void main(String[] args) {

        //creamos monedero
        Monedero miMonedero = new Monedero();
        
        //creamos monedas
        miMonedero.cartera[0] = new Moneda (2, "Euros");
        miMonedero.cartera[1] = new Moneda (1, "Euros");
        miMonedero.cartera[2] = new Moneda (0.50, "Centimos");
        miMonedero.cartera[3] = new Moneda (0.20, "Centimos");
        miMonedero.cartera[4] = new Moneda (0.10, "Centimos");
        miMonedero.cartera[5] = new Moneda(0.05, "Centimos");
        miMonedero.cartera[6]=  new Moneda(0.02, "Centimos");
        miMonedero.cartera[7] = new Moneda(0.01, "Centimo");

        //preguntamos por las monedas
        miMonedero.cuantasMonedas();

        //calculamos el total de dinero
        miMonedero.cuentaDinero();

        //mostramos el total por pantalla
        System.out.printf(miMonedero.toString());

    }

}
