public class GraficoBarras {

    public static void main(String[] args) {
        
        //variables locales
        int[] notas = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int[] d = { 0, 0, 0, 0, 0, 0, 1 ,2 ,4 ,2 ,1};   //notas por bloque, de 0 a 10, de 11 a 20...Se obtiene de notas

        //imprimimos por pantalla
        System.out.println("Distribucion de calificaciones:");

        //para cada elemento notas, imprime una barra del grafico
        for (int c = 0; c < d.length; c++) {
            //etiqyeta de la barra ("00-09:",..,"90-99: ","100: ")
            if(c==10) System.out.printf("%5d: ", 100);
            else{
                System.out.printf("%02d-%02d: ", c * 10, c * 10 + 9);
            }
            //imprime barra de asteriscos
            for (int e = 0; e < d[c]; e++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
