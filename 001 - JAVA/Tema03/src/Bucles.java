import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        
        //variables locales
        int i = 10;
        int j;
        int contador=0;
        String s1 = "Jorge";
        String s2 = "Victoria";
        boolean salir = false;
        boolean disjuntos = true;

        //Bucle por contador. Contamos de 10 hasta 200
        while (i <= 200){
            System.out.print(i + "  ");
            i+= 10;        }

        //Bucle por centinela. Cuando encuentra un multiplo de 7, fin de bucle
        System.out.println();
        while (salir == false){
            i = (int)(Math.random() * 500) + 1;
            System.out.print(i + " ");
            if (i % 7 == 0) salir = true;   //hasta encontrar un multiplo de 7
         }

         //Bucle mixto: contador y centinela. Cuando encuentra multiplo de 7 o muestra 5 numeros, fin de bucle
        System.out.println();
        salir = false;
        while (salir == false){
            i = (int)(Math.random() * 500) + 1;
            System.out.print(i + " ");
            contador++;
            if (i % 7 == 0 || contador == 5) salir = true;   //hasta encontrar un multiplo de 7
         }

         //Bucle do while. Imprime hasta llegar o 1000 o no se pase. Coge el numero del anterior bucle
         System.out.println();
         do{
             System.out.print(i + " ");
             i+= 50;
         }while (i <= 1000);

         //Bucle for. Numeros pares entre 1 y 20
         System.out.println();
         for(int x = 1; x <= 20; x++){
            if (x % 2 == 0){
             System.out.print(x + " ");
            }
         }

         //Bucle for caracteres. Imprime el alfabeto en mayusculas
         System.out.println();
         char c;
         for (c = 'A'; c <= 'Z'; c++){
             System.out.print(c + " ");
         }

         //bucle inverso. Haya los divisores de un numero
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

         //sentencia BREAK. Muestra los 100 primeros numeros enteros, pero al llegar a 10 rompe el bucle
         System.out.println();
         for(int x = 0; x < 100; x++){
             if ( x == 10) break;
             System.out.print(x + " ");
         }

         //Sentencia CONTINUE. Muestra los multiplos de 3 pero no los de 9, entre el 1 y el 100.
         System.out.println();
         for(int x = 0; x < 100; x = x + 3){
             if (x % 9 == 0) continue;
             System.out.print(x +  " ");
         }

         //Break etiquetado. Se pone un nombre a un bucle y el break indica donde saltar
         //averiguar si dos String tienen caracteres en comun
         //no se utiliza. Es como un GoTo?

         
         i = 0;
         buclePrincipal: while ( i < s1.length() ){
             j = 0;
             while ( j < s2.length()){
                 if ( s1.charAt(i) == s2.charAt(j)){ //s1 y s2 en comun
                     disjuntos = false;
                     break buclePrincipal;  //rompe los dos bucles
                 }
                 j++;   //siguiente letra de s2
             }
             i++; //siguiente letra de s1
         }

         //Bucles anidados. Creamos un tabla de multiplicar.
         System.out.println("\n\n");
         for(int k = 1; k <= 10; k++){      //esto son las filas de la tabla
            for(int l = 1; l <= 12; l++){   //esto son las columnas de la tabla
                System.out.printf("%4d", (k*l));
            }
            System.out.println();
         }

         //cerramos stdin
         stdin.close();

    }
    
}
