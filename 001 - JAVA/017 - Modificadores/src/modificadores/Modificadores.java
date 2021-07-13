package modificadores;

import paquetec.C;

public class Modificadores {

	public static void main(String[] args) {
		
		//A a = new A();	es package, no es accesible
		B b = new B();		//la clase es package y estan en el mismo paquete
		
		System.out.println(b.b);	//accedemos directo al atributo, no recomendado
		
		System.out.println(b.getB());
		
		C c = new C();
		
		//System.out.println(c.c);	//este atributo es privado, no podemos acceder
		
		System.out.println(c.getC());

	}

}
