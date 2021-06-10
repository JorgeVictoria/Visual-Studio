import java.util.Scanner;

public class ConversorLongitud2 {

    public static void main(String[] args) {
        
        //variables locales
        Scanner stdin = new Scanner(System.in);   //entrada de teclado
        int opcion;                               //numero de opcion
        double valor;                             //valor numerico tecleado por usuario
        double pulgadas=0;                          //el valor convertido a pulgadas

        //muestra menu
        System.out.println("Escoja las unidades que va a teclear:");
        System.out.println();
        System.out.println("1. Pulgadas");
        System.out.println("2. Pies");
        System.out.println("3. Yardas");
        System.out.println("4. Millas");
        System.out.println("5. Metros");
        System.out.println();
        System.out.print("Escoja la opcion (1-5): ");
        opcion = stdin.nextInt();

        //convertir a pulgadas
        switch(opcion){
            case 1: System.out.println("Teclee el numero de pulgadas: ");
                    valor = stdin.nextDouble();
                    pulgadas = valor;
                    break;
            case 2: System.out.println("Teclee el numero de yardas: ");
                    valor = stdin.nextDouble();
                    pulgadas = valor * 12;
                    break;
            case 3: System.out.println("Teclee el numero de yardas: ");
                    valor = stdin.nextDouble();
                    pulgadas = valor * 36;
                    break;
            case 4: System.out.println("Teclee el numero de millas: ");
                    valor = stdin.nextDouble();
                    pulgadas = valor * 12 * 5280;
                    break;
            case 5: System.out.println("Teclee el numero de metros: ");
                    valor = stdin.nextDouble();
                    pulgadas = valor * 39.37;
                    break;
            default:System.out.println("Error! Numero de opcion incorrecta");
                    System.exit(1);
            
        }

        //ahora se convierte a pulgadas pies, yardas, millas y metros
        //e imprimimos por pantalla
        System.out.printf("%12.5g pulgadas", pulgadas);
        System.out.printf("%12.5g pies", pulgadas/12);
        System.out.printf("%12.5g yardas",pulgadas/36);
        System.out.printf("%12.5g millas", pulgadas/(12*5280));
        System.out.printf("%12.5g metros", pulgadas/39.37);

        //cerramos stdin
        stdin.close();

    }
    
}
