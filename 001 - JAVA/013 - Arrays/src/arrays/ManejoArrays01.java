package arrays;

public class ManejoArrays01 {

	public static void main(String[] args) {
		
		//creacion e inicializacion de array, elemento a elemento
		int[] unArray = new int[10];
		
		for(int i = 0; i < unArray.length; i++) {
			unArray[i] = (int)(Math.random() * 1000 ); 
		}
		
		//recorrer el array y ver sus elementos
		for(int i = 0; i < unArray.length; i++) {
			System.out.print(unArray[i] + " ");
		}
		
		System.out.println();
		
		//recorrer el array con el for mejorado
		for(int i : unArray) {
			System.out.print(i + " ");
		}

	}

}
