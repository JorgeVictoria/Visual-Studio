import java.util.Scanner;

public class Ejemplo01 {

    public static void main(String[] args) {
        
        //variables locales
        int num1, num2, num3;                   //numeros que vamos a comparar
        Scanner stdin = new Scanner(System.in); //para leer desde teclado

        //entrada de datos
        System.out.print("Numero 1: ");
        num1 = stdin.nextInt();

        System.out.print("Num2: ");
        num2 = stdin.nextInt();

        System.out.print("Num3: ");
        num3 = stdin.nextInt();

        //salida por pantalla
        if(num1 >= num2 && num1 >= num3 && num2 >= num3) System.out.printf("%d, %d, %d", num1, num2, num3);
        else if(num1 >= num2 && num1 >= num3 && num2 < num3) System.out.printf("%d, %d, %d", num1, num3, num2);
        else if(num2 >= num1 && num2 >= num3 && num1 >= num3) System.out.printf("%d, %d, %d", num2, num1, num3);
        else if(num2 >= num1 && num2 >= num3 && num1 < num3) System.out.printf("%d, %d, %d", num2, num3, num1);
        else if(num3 >= num1 && num3 >= num2 && num1 >= num2) System.out.printf("%d, %d, %d", num3, num1, num2);
        else System.out.printf("%d, %d, %d", num3, num2, num1);
        System.out.println();

        //cerramos stdin
        stdin.close();
    }
    
}
