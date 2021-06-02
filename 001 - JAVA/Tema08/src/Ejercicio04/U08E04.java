package Ejercicio04;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class U08E04 {

    public static void main(String[] args) {

        //variables locales
        int totalClientes = 0; //total clientes que entran en el dia
        int cuantosEntran = 0;    //nº de clientes que entran por minuto
        double lambda;        //media lambda para el calculo de clientes que pueden entrar cada minuto
        Cliente c;            //para crear clientes
        int tiempoBusqueda;   //para calcular el valor que hay que pasar a tBuscar en el cliente
        int compras;       //para calcular el tiempo de cola de cada cliente
        double tiempoPagar;   //para guardar el tiempo de cola para pagar
        int productosComprados; //para calcular el valor de compra en el cliente
        double media;
        double mediaBusqueda;
        double mediEnCola;
        int totalProductosComprados = 0;
        double totalTiempoBusqueda = 0;
        double totalEnCola=0;
        double tiempoPagando=0;
        double mediaPagando=0;
        double totalTiempo=0;
        double totalMinutos=0;
        double totalCaja1=0;
        double totalCaja2=0;
        
        //creamos el array con la tasa de clientes
        int[] tasaClientes = new int[11];

        //rellenamos el array con la tasa de clientes esperada
        tasaClientes[0] = 25;
        tasaClientes[1] = 40;
        tasaClientes[2] = 50;
        tasaClientes[3] = 65;
        tasaClientes[4] = 80;
        tasaClientes[5] = 42;
        tasaClientes[6] = 18;
        tasaClientes[7] = 21;
        tasaClientes[8] = 32;
        tasaClientes[9] = 40;
        tasaClientes[10] = 60;

        //creamos las colas
        LinkedList<Cliente> colaBuscar = new LinkedList<>();
        LinkedList<Cliente> caja1 = new LinkedList<>();
        LinkedList<Cliente> caja2 = new LinkedList<>();

        //creamos el reloj y su minutero
        double reloj = 9.0;
        double minuto = 1.0 / 60;   //ritmo de avance del reloj de la simulacion

        while ( reloj <= 20 ){ //inicio del while reloj
           
            //vemos cuantos clientes entran cada minuto
            lambda = minuto * tasaClientes[(int)reloj - 9];
            cuantosEntran = getPoisson(lambda);
            
            //creamos los clientes de ese minuto
            for(int i = 1; i <= cuantosEntran; i++){ //inicio for
                tiempoBusqueda = (int)calculoNormal(10,5.8);
                tiempoBusqueda = Math.abs(tiempoBusqueda); //me salen valores negativos
                compras = (int)(tiempoBusqueda * (Math.random() * 2));
                tiempoPagar = Math.round(2 + compras / 4.0);
                tiempoPagar = cuadraSegundos(tiempoPagar);
                c = new Cliente(reloj,tiempoBusqueda, tiempoBusqueda, compras, 0, tiempoPagar, 0 );
                colaBuscar.add(c);
                totalProductosComprados = totalProductosComprados + compras; //poner despues?
                totalTiempoBusqueda = totalTiempoBusqueda + tiempoBusqueda; //total minutos buscando
                tiempoPagando = tiempoPagando + tiempoPagar;
                totalTiempo = totalTiempoBusqueda + tiempoPagando;
            }
            totalClientes += cuantosEntran;

            //restar 1 al campo tQueda de los clientes de la colaBuscar
            Iterator it = colaBuscar.iterator();
            while(it.hasNext()){
                Cliente aux = (Cliente)it.next();
                aux.setTQueda(aux.getTQueda()-1);
            }

            //ordenar los clientes por el tiempo de espera
            colaBuscar.sort(
                new Comparator<Cliente>(){
                    public int compare(Cliente c1, Cliente c2){
                        if(c1.getTQueda() < c2.getTQueda()) return 1;
                        if(c1.getTQueda() < c2.getTQueda()) return -1;
                        return 0;
                    }
                    
                }
            );

            //ver los clientes que tiempo queda es menor o igual que 0
            Iterator ite = colaBuscar.iterator();
            while(ite.hasNext()){
                Cliente aux = (Cliente)ite.next();
                if(aux.getTQueda() <= 0){
                    aux.setTCola(reloj);
                    aux.setTQueda(aux.getTCobrar());
                    ite.remove();
                    if(caja1.size() <= caja2.size()) caja1.add(aux);
                    else caja2.add(aux);
                }
            }

            //contamos cuanta gente hay en caja
            totalCaja1 = totalCaja1 + caja1.size();
            totalCaja2 = totalCaja2 + caja2.size();
            
            

            

            //vemos cola de caja 1
            for(int i = 0; i < caja1.size(); i++){
                Cliente q = caja1.getFirst();
                q.setTQueda(q.getTQueda()-1);
                if(q.getTQueda() <= 0){
                    caja1.removeFirst();
                    q.setTSale(reloj);
                    totalEnCola = totalEnCola + (q.getTSale() - q.getTCola());
                }
            }
 
            //vemos cola de caja 2
            for(int i = 0; i < caja2.size(); i++){
                Cliente q = caja2.getFirst();
                q.setTQueda(q.getTQueda()-1);
                if(q.getTQueda() <= 0){
                    caja2.removeFirst();
                    q.setTSale(reloj);
                    totalEnCola = totalEnCola + (q.getTSale() - q.getTCola());
                }
            }
            
        //control de tiempo
        reloj = reloj + minuto;
        reloj = cuadraSegundos(reloj);
        totalMinutos++;
        if(reloj > 20){
            System.out.println("Se cierran las cajas. Pendientes en caja1 " + caja1.size() + " y en caja 2 " + caja2.size() + " en local " + colaBuscar.size());
            System.out.println();
            if(colaBuscar.size() > 0) colaBuscar.removeAll(colaBuscar);
            if(caja1.size() > 0) caja1.removeAll(caja1);
            if(caja2.size() > 0) caja2.removeAll(caja2);
        }
    }

    //Impresion por pantalla
        System.out.println("Local abierto de 9:00 a 20:00");
        System.out.println("Entran " + totalClientes + " clientes");
        System.out.print("Total productos comprados: ");
        System.out.println(totalProductosComprados);
        media = (double)totalProductosComprados/totalClientes;
        System.out.printf("Compran %.2f productos media.",media );
        mediaBusqueda = (double)totalTiempoBusqueda/totalClientes;
        mediaBusqueda = cuadraSegundos(mediaBusqueda);
        System.out.printf("\nPasa %.2f minutos buscando productos",mediaBusqueda);
        /*mediEnCola = totalEnCola/totalClientes;
        mediEnCola = cuadraSegundos(mediEnCola);
        System.out.printf("\nPasa %.2f minutos en cola", mediEnCola);*/
        mediaPagando = tiempoPagando/totalClientes;
        mediaPagando = cuadraSegundos(mediaPagando);
        System.out.printf("\nPasa %.2f minutos pagando productos",mediaPagando);
        System.out.printf("\nTiempo por cliente: COMPRANDO: %.2f", (totalTiempoBusqueda*100)/totalTiempo);
        System.out.print("%");
        System.out.printf(" PAGANDO: %.2f ", (tiempoPagando*100)/totalTiempo);
        System.out.println("%");
        System.out.printf("Tamaño cola caja 1 %.2f clientes/min", totalCaja1/totalMinutos);
        System.out.printf("\nTamaño cola caja 2 %.2f clientes/min", totalCaja2/totalMinutos);
    }



    private static double calculoNormal(double i, double d) {
        double r1 = Math.random();
        double r2 = Math.random();
        double z1 = Math.sqrt((-2)*Math.log(r1))*Math.sin(2*Math.PI*r2);
        double n1 = z1*i+d;
        return n1;
    }

    private static int getPoisson(double lambda) {
       double L = Math.exp(-lambda);
       double p = 1.0;
       int k = 0;
       do {
           k++;
           p = Math.random();
       } while (p > L);
       return k-1;
    }

    //para cuadrar la hora, ya que a veces sales mas de 60 segundos
    private static double cuadraSegundos(double dato){
        
        String tiempo = String.valueOf(dato);
        int pos = tiempo.indexOf(".");
        pos++;
        char caracter = tiempo.charAt(pos);
        if (caracter == 54|| caracter == 55 || caracter == 56 || caracter == 57){
            dato = dato + 1;
            dato = dato -0.6;
        }

        return dato;
    }

    
    
}



class Cliente {

    //variables miembro
    private double tEntra;
    private double tBuscar;
    private double tQueda;
    private int compra;
    private double tCola;
    private double tCobrar;
    private double tSale;

    //constructor
    public Cliente(double entra, double busca, double queda, int cuantos, double cola, double cobra, double sale){
        this.tEntra = entra;
        this.tBuscar = busca;
        this.tQueda = queda;
        this.compra = cuantos;
        this.tCola = cola;
        this.tCobrar = cobra;
        this.tSale = sale;
    }

    //getters
    public double getTEntra() { return this.tEntra;}
    public double getTBuscar() { return this.tBuscar;}
    public double getTQueda() { return this.tQueda;}
    public int getCompra() { return this.compra;}
    public double getTCola() { return this.tCola; }
    public double getTCobrar() { return this.tCobrar;}
    public double getTSale() { return this.tSale;}

    //setters
    public void setTEntra(double entra) { this.tEntra = entra;}
    public void setTBuscar(double busca) { this.tBuscar = busca;}
    public void setTQueda(double queda) { this.tQueda = queda;}
    public void setCompra(int cantidad) { this.compra = cantidad;}
    public void setTCola(double cola) { this.tCola = cola; }
    public void setTCobrar(double cobra) { this.tCobrar = cobra;}
    public void setTSale(double sale) { this.tSale = sale;}
}
