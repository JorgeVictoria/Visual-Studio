public class InicializarArrays {

    public static void main(String[] args) {
        
        //variables locales
        final int LONGITUD_ARRAY = 10;
        int[] array1 = new int[10];
        int[] array2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        int[] array3 = new int[LONGITUD_ARRAY];

        //rellenamos el primer array con numeros aleatorios del 1 al 100
        for(int i = 0; i < array1.length;i++){
            array1[i] = (int)(Math.random() * 100) + 1;
        }

        //rellenar un array de tamaño 10 con los numeros enteros del 2 al 20
        for(int i = 0; i < array3.length; i++ ){
            array3[i] = 2 + 2 * i;
        }

        //encabezados y columnas
        System.out.printf("%s%8s%8s%8s%n", "Indice", "Array1", "Array2", "Array3");

        //imprimimos cada valor del array
        for(int i = 0; i < array1.length; i++){
            System.out.printf("%5d%8d%8d%8d%n",i, array1[i], array2[i], array3[i]);
        }

        

    }
    
}
