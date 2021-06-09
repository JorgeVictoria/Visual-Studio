public class DemoFormato {

    public static void main(String[] args) {

        //entero. La cantidad indica el numero minimo de posiciones. Rellena con huecos
        int num1 = 23;
        System.out.printf("%12d\n",num1);

        //formato S. El numero indica la cantidad minima de caracteres
        int num2 = 356789;
        System.out.printf("%4s\n", num2);

        double cantidad = 71283.567811;
 
        System.out.println();
        System.out.println("Ejemplo para mostrar un mismo valor con varios formatos"); 
    
        // El simbolo %n es un salto de linea
        // Formato normal double y float
        System.out.printf("%nEl valor de la variable cantidad es %f", cantidad); 
    
        // Formato notación científica
        System.out.printf("%nEl valor de la variable cantidad es %e", cantidad);

        //mas formato cientifico
        System.out.printf("\nEl valor de la variable cantidad es %.2e", cantidad);

        //mas formato cientifico
        System.out.printf("\nEl valor de la variable cantidad es %.2g", cantidad);
    
        // Formato con 2 decimales
        System.out.printf("%nEl valor de la variable cantidad es %.2f", cantidad);
    
        // Formato con 6 decimales
        System.out.printf("%nEl valor de la variable cantidad es %.6f", cantidad);
    
        // Formato con simbolo + y 2 decimales
        System.out.printf("%nEl valor de la variable cantidad es %+.2f", cantidad);
    
        // Formato con espacios en blanco (suman 11 todas las cifras) con 2 decimales
        System.out.printf("%nEl valor de la variable cantidad es %11.2f", cantidad); 
    
        // Formato con espacios en blanco (suman 11 todas las cifras) con símbolo + y 2 decimales
        System.out.printf("%nEl valor de la variable cantidad es %+11.2f", cantidad); 
    
        // Formato con ceros delante (suman 11 todas las cifras) con 2 decimales
        System.out.printf("%nEl valor de la variable cantidad es %011.2f", cantidad); 
    
        // Formato con ceros delante (suman 11 todas las cifras) con símbolo + y 2 decimales
        System.out.printf("%nEl valor de la variable cantidad es %+011.2f", cantidad); 
    
        // Formato separando los miles (71,283.567811 en lugar de 71283.567811) 
        System.out.printf("%nEl valor de la variable cantidad es %,f", cantidad);

        //justificar salida a la izquierda
        System.out.printf("%nEl valor de la variable cantidad es %-20.1f", cantidad);

        //porcentaje
        System.out.printf("%nEl valor de la variable cantidad es %3.2f%%\n", cantidad);
    

        
    }
    
}
