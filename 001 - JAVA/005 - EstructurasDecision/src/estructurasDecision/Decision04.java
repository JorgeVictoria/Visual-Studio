package estructurasDecision;

public class Decision04 {

	public static void main(String[] args) {
		
		//variables locales
		double nota = Math.random() * 10;
		
		//imprimimos por pantalla
		System.out.printf("La nota es %.1f. ", nota);
		
		//evaluamos
		if(nota >= 9) System.out.println("Sobresaliente");
		else if(nota >= 7) System.out.println("Notable");
		else if(nota >= 6) System.out.println("Bien");
		else if(nota >= 5) System.out.println("Suficiente");
		else System.out.println("Suspenso");
	}

}
