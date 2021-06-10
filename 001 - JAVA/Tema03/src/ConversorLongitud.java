import java.util.Scanner;

public class ConversorLongitud {

    public static void main(String[] args) {
        
        //variables locales
        Scanner stdin = new Scanner(System.in);         //entrada de datos por teclado
        double valor;                                   //cantidad numerica
        String unidad;                                  //unidad de medida
        double pulgadas, pies, yardas, millas, metros;  //valores
        boolean correcta = true;                        //indica si unidad es ok

        //preguntamos datos
        System.out.println("Teclee valor unidad: ");
        valor = stdin.nextDouble();
        unidad = stdin.next();
        unidad = unidad.toLowerCase();                  //convertir a minuscula

        //vamos comparando. Lo pasamos todo a pulgadas
        if(unidad.equals("pulgadas") || unidad.equals("pulgada")){
            pulgadas = valor;
        }
        else if (unidad.equals("pies") || unidad.equals("pie")){
            pulgadas = valor * 12;
        }
        else if ( unidad.equals("yardas") || unidad.equals("yarda")){
            pulgadas = valor * 36;
        }
        else if ( unidad.equals("millas") || unidad.equals("milla")){
            pulgadas = valor * 12 * 5280;
        }
        else if ( unidad.equals("metros") || unidad.equals("metro")){
            pulgadas = valor * 39.37;
        }
        else {
            System.out.println("No comprendo \"" + unidad + "\".");
            correcta = false;
            pulgadas = -1 ;     //para evitar un error de valor
        }
        
        //convertimos a partir de pulgadas
        if(correcta){
            pies = pulgadas / 12;
            yardas = pulgadas / 36;
            millas = pulgadas / (12 * 5280);
            metros = pulgadas / 39.37;
            
            //Imprimimos por pantalla
            System.out.printf("%12.5g pulgadas", pulgadas);
            System.out.printf("%12.5g pies", pies);
            System.out.printf("%12.5g yardas",yardas);
            System.out.printf("%12.5g millas", millas);
            System.out.printf("%12.5g metros", metros);
        }

        //cerramos stdin
        stdin.close();
    }
    
}
