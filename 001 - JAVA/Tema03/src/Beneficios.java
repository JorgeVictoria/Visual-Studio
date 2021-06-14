public class Beneficios {

    public static void main(String[] args) {
        
        //variables locales
        double[][] beneficio = new double[5][12];   //5 empresas, 12 meses
        double total = 0;

        //vamos a ponerle un beneficio random a cada tienda, entre 0 y 1.000.000 de euros
        for(int i = 0; i < beneficio.length; i++){
            for(int j = 0; j < beneficio[i].length; j++){
                 beneficio[i][j] = Math.random() * 1000000;
            }
        }

        //ahora calculamos el beneficio
        for(int i = 0; i < beneficio.length; i++){
            for(int j = 0; j < beneficio[i].length; j++){
                total += beneficio[i][j]; 
            }
        }

        //mostramos el beneficio
        System.out.printf("La empresa a obtenido un beneficio de %.2f Euros", total);

        //mostramos el beneficio solo en diciembre
        total = 0;
        for(int i = 0; i < beneficio.length; i++){
            total += beneficio[i][11];
        }
        System.out.printf("\nLa empresa obtuvo en Diciembre un beneficio de %.2f Euros", total);

        //calcular y mostrar el beneficio de la tienda 3 durante el año
        total = 0;
        for(int i = 0; i < beneficio[2].length; i++){
            total += beneficio[2][i];
        }
        System.out.printf("\nLa tienda 3 obtuvo un total de %.2f de Euros de beneficio", total);
    }
    
}
