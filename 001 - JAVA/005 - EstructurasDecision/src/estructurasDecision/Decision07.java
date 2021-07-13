package estructurasDecision;

public class Decision07 {

	public static void main(String[] args) {
		
		//variables locales
		int dia=0;
		String diaSemana = "Viernes";
				
		//evaluamos
				switch(diaSemana) {
				case "Lunes": 		dia = 1;
							 		break;
				case "Martes": 		dia = 2;
									break;
				case "Miercoles": 	dia = 3;
									break;
				case "Jueves": 		dia = 4;
									break;
				case "Viernes": 	dia = 5;
									break;
				case "Sabado": 		dia = 6;
									break;
				case "Domingo": 	dia = 7;
									break;
				default: 			System.out.print("Dia no valido.");
									break;
				}
				
		//salida por pantalla
		if (dia >= 1 && dia <=7) {
			System.out.print("Hoy es " + diaSemana + ". ");
			System.out.print("Dia " + dia + " de la semana.");
		}
				

	}

}
