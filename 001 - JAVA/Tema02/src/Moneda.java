import java.util.Scanner;

public class Moneda {

    //variables globales
    private static Scanner stdin = new Scanner(System.in);
    
    //variables miembro
    private double valor;
    private String tipo;
    private int cantidad;

    //constructor
    public Moneda(double val, String tip){
        this.valor = val;
        this.tipo = tip;
    }

    //getters
    public double getValor() { return this.valor;}
    public String getTipo() { return this.tipo;}
    public int getCantidad() { return this.cantidad;}

    //setters
    public void setValor(double val) { this.valor = val;}
    public void setTipo(String tip) { this.tipo = tip; }
    public void setCantidad(int cant) {this.cantidad = cant;}

    //metodo para ir introduciendo las monedas que tenemos
    public void cuantasMonedas() {

        System.out.print("Total monedas de " + this.valor + " " + this.tipo + ": ");

        this.setCantidad(stdin.nextInt());

    }

    
}

class Ej04 {

    private static Moneda[] cartera = new Moneda[8];

    public static void main(String[] args) {
        
        //variables

        cartera[0] = new Moneda (2, "Euros");
        cartera[1] = new Moneda (1, "Euros");
        cartera[2] = new Moneda (0.50, "Centimos");
        cartera[3] = new Moneda (0.20, "Centimos");
        cartera[4] = new Moneda (0.10, "Centimos");
        cartera[5] = new Moneda(0.05, "Centimos");
        cartera[6] = new Moneda(0.02, "Centimos");
        cartera[7] = new Moneda(0.01, "Centimo");

        
        //preguntamos por los datos
        for(int i = 0; i < cartera.length; i++){
            cartera[i].cuantasMonedas();
        }

        //mostramos cantidad total
        cuentaDinero();

    }

    public static void cuentaDinero(){

        double total = 0;

        for(int i = 0; i < cartera.length; i++){
            total = total + cartera[i].getValor() * cartera[i].getCantidad();
        }
        
        System.out.printf("Total: %.2f euros.", total);
    }

}
