public class SumaArray {

    public static void main(String[] args) {
        
        //variables locales
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;                                                  //suma de todas las notas

        //suma el valor de cada elemento al total
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }

        //mostramos resultado por pantalla
        System.out.printf("Total: %d%n", total);

        //mostramos la media
        System.out.printf("Media %.2f", (double)(total/array.length));
    }
    
}
