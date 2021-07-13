package interfaces;

public class Interfaces {

	public static void main(String[] args) {
		
		RectanglePlus rectangleOne = new RectanglePlus(10, 20);
		Relatable rectangleTwo = new RectanglePlus(20, 10);		//como implementa la interfaz, podemos usar la interfaz. Similar a herencia
		MyInterface test = new RectanglePlus(30,30);
		
		rectangleOne.print();
		MyInterface rectangle2 = (MyInterface) rectangleTwo;	//tenemos que usar la otra interfaz para ver su metodo. Podriamos heber puesto la interfaz en la otra variable
		rectangle2.print();
		
		//prueba con test. Puede invocar los 2 metodos de las interfaces
		//test.isLargerThan(rectangle2);
		//test.print();
		
		switch (rectangleOne.isLargerThan(rectangleTwo)) {
		case -1 : 	System.out.println("Es menor");
					break;
		case 0 :	System.out.println("Son iguales");
					break;
		case 1 :  	System.out.println("Es mayor");
					break;
		}

	}

}
