import java.util.Scanner;

public class ConversorLongitud3 {

    public static void main(String[] args) {
        
        //variables locales
        Scanner stdin = new Scanner(System.in);     //entrada de datos por teclado
        String unidad;                              //unidades tecleadas por el usuario
        double valor;                               //valor numerico tecleado por usuario
        double pulgadas=0;                          //el valor convertido a pulgadas

        //leer las unidades del usuario
        System.out.println("Que unidades de Longitud va a teclear?");
        System.out.print("Legal: pulgadas, pies, yardas, millas o metros: ");
        unidad = stdin.nextLine().toLowerCase();

        //Leer valor y convertir
        System.out.print("Teclee el numero de " + unidad + ": ");
        valor = stdin.nextDouble();

        switch(unidad){
            case "pulgadas": pulgadas = valor;
                             break;
            case "pies":     pulgadas = valor * 12;
                             break;
            case "yardas":   pulgadas = valor * 36;
                             break;
            case "millas":   pulgadas = valor * 12 * 5280;
                             break;
            case "metros":   pulgadas = valor * 39.37;
                             break;
            default:         System.out.println("Unidad de medida incorrecta!");
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
