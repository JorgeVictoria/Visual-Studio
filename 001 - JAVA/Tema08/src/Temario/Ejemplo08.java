package Temario;

public class Ejemplo08 {

    public static void main(String[] args) {
        
        int[] marcas = { 125, 132, 95, 116, 110};
        int peor = maximo(marcas);
        System.out.println("La peor marca " + peor);
    }

    private static int maximo(int[] marcas) {
        int max = marcas[0];
        for(int n : marcas){
            if (n > max){
                max = n;
            }
        }
        return max;
    }
    
}

/*Limitaciones del bucle for-each:
• No sirve para modificar los elementos de la colección:
for (int n : marcas) {
 // solo cambias la variable, no el elemento.
 n = n * 2;
}
• No puedes averiguar el índice:
for (int n : numeros) { 
 if (n == buscado) {
 return ???; // no sabes el índice
 }
}
*/
