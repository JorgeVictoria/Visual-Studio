package estructurasDecision;

public class Decision06 {

	public static void main(String[] args) {
		
		//variables locales
		int dia = (int)(Math.random() * 8) + 1;
		
		//salida por pantalla
		System.out.print("Dia " + dia +". ");
		
		//evaluamos
		switch(dia) {
		case 1: System.out.print("Lunes");
				break;
		case 2: System.out.print("Martes");
				break;
		case 3: System.out.print("Miercoles");
				break;
		case 4: System.out.print("Jueves");
				break;
		case 5: System.out.print("Viernes");
				break;
		case 6: System.out.print("Sabado");
				break;
		case 7: System.out.print("Domingo");
				break;
		default: System.out.print("Dia no valido.");
				break;
		}
	}

}
