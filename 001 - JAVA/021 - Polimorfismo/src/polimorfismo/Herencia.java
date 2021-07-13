package polimorfismo;

public class Herencia {

	public static void main(String[] args) {
		
		//variables locales
		Trabajador trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "", "");
		Trabajador empleado = new Empleado("Larry Ellison", "Presidente", "Redmond", "", "", 100000.0, 1000.0);
		Trabajador consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);
				
		//saludo por pantalla
		saludar(trabajador);
		saludar(empleado);
		saludar(consultor);
		
		//imprimir paga
		imprimirNombreYPaga(trabajador);
		imprimirNombreYPaga(empleado);
		imprimirNombreYPaga(consultor);
	}
	
	public static void saludar(Trabajador t) {
		System.out.println("Hola, soy " + t.getNombre());
	}
	
	//Polimorfismo. Cada clase oculta el metodo de su padre, y usa el metodo de cada uno de ellos. Los metodos tienen la misma firma
	public static void imprimirNombreYPaga(Trabajador t) {
		System.out.printf("El trabajador %s tiene una paga de %.2f\n", t.getNombre(), t.calcularPaga());
	}

}
