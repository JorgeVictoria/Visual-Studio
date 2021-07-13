package estructurasDecision;

public class Decision05 {

	public static void main(String[] args) {
		
		//variables locales
		double nota = Math.random() * 10;
				
		//imprimimos por pantalla
		System.out.printf("La nota es %.1f. ", nota);
		
		//evaluamos
		switch((int)nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("Suspenso");
				break;
		case 5: System.out.println("Suficiente");
				break;
		case 6: System.out.println("Bien");
				break;
		case 7:
		case 8: System.out.println("Notable");
				break;
		default: System.out.println("Sobresaliente");
		}

	}

}
