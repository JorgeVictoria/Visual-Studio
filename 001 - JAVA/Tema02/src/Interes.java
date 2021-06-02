public class Interes {

   public static void main(String[] args) {

    //variables locales
    double principal;   //capital de dinero a invertir
    double ratio;       //el ratio de interes anual
    double interes;     //ganancia al año debido al interes

    //calulos
    principal = 17000;
    ratio = 0.027;
    interes = principal * ratio;    //calcular el interes anual
    principal = principal + interes;//dinero despues de un año

    //mostrar resultados
    System.out.print("El interes ganado en Euros: ");
    System.out.println(interes);
    System.out.print("Capital despues de un año en Euros: ");
    System.out.println(principal);
    
   } 
    
}
