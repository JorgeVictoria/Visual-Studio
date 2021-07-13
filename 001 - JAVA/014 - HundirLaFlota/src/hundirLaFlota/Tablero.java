package hundirLaFlota;

public class Tablero {
	//variables globales
	public static String[] columnas = {"[0]", "[1]", "[2]", "[3]", "[4]", "[5]", "[6]", "[7]", "[8]", "[9]"};
	public static String[] filas = {"[A]", "[B]", "[C]", "[D]", "[E]", "[F]", "[G]", "[H]", "[I]", "[J]"};
	
	//variables miembro
	private char[][] tablero;
	
	//constructor
	public Tablero(int filas, int columnas) {
		this.tablero = new char[filas][columnas];
	}

	//metodos de los tableros
	public void rellenarAgua() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[i].length;j++) {
				this.tablero[i][j] = '-';
			}
		}
	}
	
	public void rellenarCuadro(int fila, int columna) {
		this.tablero[fila][columna] = 'B';
	}
	
	public void imprimirTablero() {
		//primero la fila principal
		System.out.print("     ");
		
		for(int i = 0; i < columnas.length; i++) {
			System.out.print(" " + columnas[i] + " ");
		}
		
		System.out.println();
		
		//rellenamos la tabla
		for (int i = 0; i < this.tablero.length; i++) {
			System.out.print(filas[i] + "  ");
			for (int j = 0; j < this.tablero[i].length;j++) {
				System.out.print("  " + this.tablero[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
