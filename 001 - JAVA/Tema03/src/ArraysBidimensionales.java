public class ArraysBidimensionales{

    public static void main(String[] args) {
        
        //variables locales
        int[][] tabla = new int[5][7];  //array bidimensional
        
        //rellenamos el array con numeros aleatorios
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                tabla [i][j] = (int)(Math.random() * 100) + 1;
            }
        }

        //ahora recorremos el array
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                System.out.printf("%4d ",tabla[i][j]);
            }
            System.out.println();
        }


    }
    
}
