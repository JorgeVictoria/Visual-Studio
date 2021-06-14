import java.util.Scanner;

public class LeAlMuIn {

    public static void main(String[] args) {
        
        //variables locales
        int[] numeros = new int[100];               //array
        int contador = 0;                           //numeros leidos
        int numero = 0;                             //uno de los numeros
        Scanner stdin = new Scanner(System.in);     //entrada por teclado

        //pedimos datos
        System.out.println("Teclee hasta 100 enteros (<0 acaba).");
        while (numero >= 0 && contador <100){
            System.out.print("? ");
            numero = stdin.nextInt();
            if (numero >=0 && contador < 100) {
                numeros[contador] = numero;
                contador++;
            }
        }
        System.out.println("\nLos numeros en orden inverso:\n");
        for (int i = contador - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        //cerramos stdin
        stdin.close();
    }
}
