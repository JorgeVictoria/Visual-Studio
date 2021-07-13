package estructurasDecision;

public class Decision03 {

	public static void main(String[] args) {
		
		//variables locales
		int num1 = (int)(Math.random() * 10) + 1;
		int num2 = (int)(Math.random() * 10) + 1;
		
		if(num1 > num2)System.out.println(num1 + " es mayor que " + num2);
		else System.out.println(num1 + " no es mayor que " + num2);
		
	}

}
