public class Arrays {

    public static void main(String[] args) {
        
        //variables locales
        int[] lista = new int[20];      //array con el que vamos a trabajar
        int sumaArray = 0;
        int mayorNumero = 0;
        int totalImpares = 0;
        double media;

        //llenamos el array con numeros enteros
        for(int i = 0; i < lista.length; i++) lista[i] = (int)(Math.random() * 1000) + 1;
        
        //ahora imprimimos la lista
        for(int i = 0; i < lista.length; i++) System.out.print(lista[i] + "  ");

        //calculamos la media
        for (int i = 0; i < lista.length; i++) sumaArray += lista[i];
        media = (double)sumaArray/lista.length;

        //imprimimos la media
        System.out.printf("\nLa media es %.2f", media);

        //buscar el mayor elemento del array
        for (int i = 0; i < lista.length; i++){
            if(lista[i] > mayorNumero) mayorNumero = lista[i];
        }

        //imprimimos el mayor numero
        System.out.println("\nEl numero mayor es " + mayorNumero);

        //numeros impares y su media
        sumaArray = 0;
        for(int i = 0; i < lista.length; i++){
            if(lista[i] % 2 != 0){
                sumaArray += lista[i];
                totalImpares++;
            }
        }

        if (totalImpares == 0) System.out.println("No hay numeros impares");
        else{
            System.out.println("Hay " + totalImpares + " numeros impares") ;
            media = (double)sumaArray/totalImpares;
            System.out.printf("Su media es %.2f", media );
        }

    }
    
}
