package hundirLaFlota;

public class Principal {

	public static void main(String[] args) {
		
		//variables locales
		int direccion = 0;
		int fila = 0;
		int columna = 0;
		
		//creamos los tableros
		Tablero jugador = new Tablero(10,10);
		Tablero computer = new Tablero(10,10);
		Tablero muestra = new Tablero(10,10);
		
		//rellenamos con agua los tableros
		jugador.rellenarAgua();
		computer.rellenarAgua();
		
		//colocamos el primer barco de 5 posiciones
		//primero la direccion. 0 horizontal, 1 vertical
		direccion = (int)(Math.random() * 2);
		//sacamos la posicion inicial
		fila = (int)(Math.random() * 9);
		columna = (int)(Math.random() * 9);
		//pintamos
		jugador.rellenarCuadro(fila, columna);
		
		
		
		//imprimimos tablero
		jugador.imprimirTablero();
		computer.imprimirTablero();

	}

}
