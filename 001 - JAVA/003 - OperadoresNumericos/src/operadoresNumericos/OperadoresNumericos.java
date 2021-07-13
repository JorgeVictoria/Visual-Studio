package operadoresNumericos;

public class OperadoresNumericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int x = 7;
		int y = 5;
		int z;
		
		//suma
		System.out.println("Suma");
		System.out.println(x+y);
		System.out.println();
		
		//resta
		System.out.println("Resta");
		System.out.println(x-y);
		System.out.println();
		
		//producto
		System.out.println("Producto");
		System.out.println(x*y);
		System.out.println();
				
		//division entera
		System.out.println("Division entera");
		System.out.println(x/y);
		System.out.println();
		
		//division no entera(uso de casting)
		System.out.println("Division no entera");
		System.out.printf("%.2f\n", (double)x/y);
		System.out.println();
		
		//resto
		System.out.println("Resto");
		System.out.println(x%y);
		System.out.println();
		
		//preincremento. Primero se incrementa x.
		z = ++x;
		System.out.println(z);
		System.out.println(x);
		System.out.println();
		
		//postincremento. Primero se da valor a z y luego se incrementa x
		z = x++;
		System.out.println(z);
		System.out.println(x);
		System.out.println();
		
		//unario o cambio de signo
		z = -z;
		System.out.println(z);
		System.out.println();
		
		//operadores de asignacion abreviada
		x += y;	//x=x+y
		System.out.println(x);
		x -= y;	//x=x-y
		System.out.println(x);
		x *= y;	//x=x*y
		System.out.println(x);
		x /= y;	//x=x/y
		System.out.println(x);
		x %= y;	//x=x%y
		System.out.println(x);
		System.out.println();
		
		//operadores de bits
		
		//operador AND
		z = 0;
		System.out.println(Integer.toBinaryString(z));
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		z = x&y;
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		//operador OR exclusivo
		z = x^y;
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		//operador OR inclusivo
		z = x|y;
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		//operador cambio
		z = ~z;
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		//desplazamiento de bits a la izquierda
		z = z<<1;
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		//desplazamiento de bits a la derecha
		z = z>>2;
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		//desplazamiento de bits a la derecha, rellenamos con 0 a la izquierda
		z = z>>>1;
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		

	}

}
