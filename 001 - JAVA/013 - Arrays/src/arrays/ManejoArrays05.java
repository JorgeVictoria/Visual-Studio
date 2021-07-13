package arrays;

import java.util.Arrays;

public class ManejoArrays05 {

	public static void main(String[] args) {
		
		//creamos un array de 10 elementos
		int[] enteros = new int[10];
		
		//rellenamos el array
		for(int i = 0; i < enteros.length; i++) {
			enteros[i] = (int)(Math.random() * 21);
		}
		
		//mostramos el array
		System.out.println(Arrays.toString(enteros));
		
		//creamos otro array y copiamos el viejo
		int[] copiaEnteros =Arrays.copyOf(enteros, 10);
		
		//ordenamos el nuevo array
		Arrays.sort(copiaEnteros);
		
		//mostramos el nuevo array
		System.out.println(Arrays.toString(copiaEnteros));
		
		//buscar un elemento dentro del array
		int pos = Arrays.binarySearch(copiaEnteros, 10);
		System.out.println(pos);
		if (pos >= 0) System.out.println("El numero 10 esta en la posicion " + pos + " del array" );
		else System.out.println("El numero 10 no está en el array.");
		
		//ordenar rapidamente arrays grandes
		int[] arrayGrande = new int[123456];
		
		Arrays.parallelSetAll(arrayGrande, i -> (int)(Math.random() * 12345));
		Arrays.parallelSort(arrayGrande);
	}

}
