import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        
        //variables locales
        Scanner stdin = new Scanner(System.in); //entrada por teclado
        String str;                             //lo teclea el usuario
        double num;                             //la conversion del string
        double total;                           //suma de nºs tecleados (hasta linea blanco)
        double avg;                             //la media
        int contador;                           //cantidad de nºs tecleados
        boolean flag = true; 
        
        //incializamos algunas variables
        total = 0;
        contador = 0;

        //pedimos numeros
        System.out.println("Teclea tus nºs, return para acabar");
        
        //vamos comprobando
        while(flag){
            System.out.print("? ");
            str = stdin.nextLine();
            if (str.equals("")) flag = false;
            try {
                num = Double.parseDouble(str);
                //si hay error, se saltan las lineas
                total = total + num;
                contador++;
            }
            catch (NumberFormatException e){
                System.out.println("No es legal, repite.");
            }
        }

        avg = total / contador;
        
        System.out.printf("La media de los %d nºs es %1.6g%n", contador, avg);

        //cerramos stdin
        stdin.close();
    }
    
}
