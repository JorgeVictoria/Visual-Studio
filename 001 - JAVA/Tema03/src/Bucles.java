import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        
        //variables locales
        int i = 10;
        int contador=0;
        boolean salir = false;

        //Bucle por contador
        while (i <= 200){
            System.out.print(i + "  ");
            i+= 10;        }

        //Bucle por centinela
        System.out.println();
        while (salir == false){
            i = (int)(Math.random() * 500) + 1;
            System.out.print(i + " ");
            if (i % 7 == 0) salir = true;   //hasta encontrar un multiplo de 7
         }

         //Bucle mixto: contador y centinela
        System.out.println();
        salir = false;
        while (salir == false){
            i = (int)(Math.random() * 500) + 1;
            System.out.print(i + " ");
            contador++;
            if (i % 7 == 0 || contador == 5) salir = true;   //hasta encontrar un multiplo de 7
         }

         //Bucle do while
         System.out.println();
         do{
             System.out.print(i + " ");
             i+= 50;
         }while (i <= 1000);

         //Bucle for
         System.out.println();
         for(int x = 1; x <= 20; x++){
            if (x % 2 == 0){
             System.out.print(x + " ");
            }
         }

         //Bucle for caracteres
         System.out.println();
         char c;
         for (c = 'A'; c <= 'Z'; c++){
             System.out.print(c + " ");
         }

         //bucle inverso
         System.out.println();
         Scanner stdin = new Scanner(System.in);

         salir = false;
         while(salir == false){
            System.out.print("Numero: ");
            try {
                salir = true;
                i = stdin.nextInt();
                contador=0;
            } catch (Exception e) {
                salir = false;
                stdin.nextLine();
            }
         }
        
         for(int x = i; x >= 1; x--){
            if(i % x == 0) contador++;
         }

         System.out.print("El numero " + i + " tiene " + contador + " divisores");

         //sentencia BREAK
         System.out.println();
         for(int x = 0; x < 100; x++){
             if ( x == 10) break;
             System.out.print(x + " ");
         }

         //Sentencia CONTINUE
         System.out.println();
         for(int x = 0; x < 100; x = x + 3){
             if (x % 9 == 0) continue;
             System.out.print(x +  " ");
         }

         //cerramos stdin
         stdin.close();

    }
    
}
