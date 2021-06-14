public class ProblemaDelCumple {

    public static void main(String[] args) {
        
        //variables locales
        boolean[] usado = new boolean[365];     //almacena posibles cumpleaños
        int contador = 0;                       //numero de personas comprobadas
        int cumple = 0;                         //el dia escogido

        //seleccionamos al azar un dia(0 a 364)
        //si ya ha salido, salir
        while(true){
            cumple = (int)(Math.random() * 365);
            contador++;
            System.out.printf("Persona %d nace %d" , contador, cumple);
            System.out.println();
            if (usado[cumple]) break;   //hay coincidencia, se rompe el bucle
            else usado[cumple] = true;
         }
         System.out.println();
         System.out.println("Encontrada en " + contador + " veces.") ;
    }
    
}
