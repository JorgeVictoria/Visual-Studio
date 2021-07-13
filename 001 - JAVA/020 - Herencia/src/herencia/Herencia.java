package herencia;

public class Herencia {

	public static void main(String[] args) {
		
		//variables locales
		Trabajador trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "", "");
		Empleado empleado = new Empleado("Larry Ellison", "Presidente", "Redmond", "", "", 100000.0, 1000.0);
		Consultor consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);
		
		//imprimimos por pantalla
		System.out.println(trabajador);
		System.out.println(empleado);
		System.out.printf("%.2f\n", empleado.calculaPagas());
		System.out.println(consultor);
		System.out.printf("%.2f", consultor.calculaCoste());
		

	}

}
