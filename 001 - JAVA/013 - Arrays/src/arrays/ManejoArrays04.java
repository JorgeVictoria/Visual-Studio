package arrays;

public class ManejoArrays04 {

	public static void main(String[] args) {
		
		//creamos un array bidimensional
		int[][] enteros = new int [10][20];
		
		//rellenamos el array
		for(int i = 0; i < enteros.length; i++) {
			for(int j = 0; j < enteros[i].length; j++) {
				enteros[i][j] = (i+1)*(j+1);
			}
		}
		
		//imprimimos el array
		for(int i = 0; i < enteros.length; i++) {
			for(int j = 0; j < enteros[i].length; j++) {
				System.out.printf("%6d", enteros[i][j]);
			}
			System.out.println();
		}

	}

}
