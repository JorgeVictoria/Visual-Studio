import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        //variables locales
        long numero;                                 //almacena el numero del cual vamos a calcular el factorial
        long factorial = 1;                          //almacenamos el factorial
        Scanner stdin = new Scanner(System.in);     //entrada por teclado

        //pedimos el numero
        System.out.print(("Intorudce un numero: "));
        numero = stdin.nextInt();

        for(int i = 1; i <= numero; i++){
            factorial = factorial * i;
            System.out.println(factorial);
        }

        //cerramos stdin
        stdin.close();
            
    }
    
}
