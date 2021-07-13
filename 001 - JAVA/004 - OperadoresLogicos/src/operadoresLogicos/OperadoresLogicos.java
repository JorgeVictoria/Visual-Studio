package operadoresLogicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OPERADORES LOGICOS CONDICIONALES
		int valor1 = 1;
		int valor2 = 2;
		
		if(valor1 == 1 && valor2 == 2) System.out.println("Los dos valores son correctos");
		if(valor1 == 1 || valor2 == 1) System.out.println("Uno de los valores es correcto");
		
		//OPERADOR TERNARIO
		String mayorMenor = "";
		mayorMenor = (valor1 > valor2) ? "valor1 es mayor que valor2":"valor1 es menor o igual que valor2";
		System.out.println(mayorMenor);
		
		//OPERADORES LOGICOS RELACIONALES
		System.out.println(valor1==valor2);
		System.out.println(valor1!=valor2);
		System.out.println(valor1>=valor2);
		System.out.println(valor1<=valor2);
	}

}
