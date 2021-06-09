import java.util.Scanner;

public class InteresConScanner {
    
    public static void main(String[] args) {
        
        //variables locales
        Scanner stdin = new Scanner(System.in); //entrada por teclado
        double principal;                       //valor de interes
        double ratio;                           //ration anual
        double interes;                         //ganancia anual aportada por el interes

        //pedimos datos
        System.out.print("Teclea el capital a invertir: ");
        principal = stdin.nextDouble();

        System.out.print("Teclea el interes anual(con decimales): ");
        ratio = stdin.nextDouble();

        //calculos
        interes = principal * ratio;        //calcular importe
        principal = principal + interes;    //sumar el capital

        //mostramos resultados por pantalla
        System.out.printf("La ganancia es %1.2f€%n", interes);
        System.out.printf("El total despues del año %1.2f€%n", principal);

        //cerramos stdin
        stdin.close();
    }
}
