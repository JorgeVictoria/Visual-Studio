import java.math.BigInteger;
import java.util.Scanner;

public class Factorial2 {
    
    public static void main(String[] args) {
        
        //variables locales
        int numero=0;                                 //almacena el numero del cual vamos a calcular el factorial
        BigInteger factorial;                         //almacenamos el factorial
        Scanner stdin = new Scanner(System.in);     //entrada por teclado

        //pedimos el numero
        System.out.print(("Intorudce un numero: "));
        numero = stdin.nextInt();

        factorial = new BigInteger(String.valueOf(numero));

        for(long i = 1; i <= numero; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
            System.out.println(factorial);
        }

        //cerramos stdin
        stdin.close();
            
    }
}
