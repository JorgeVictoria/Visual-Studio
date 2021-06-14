public class GeneradorClaves {

    public static void main(String[] args) {
        
        //variables locales
        String cadena="";           //donde vamos a ir almacenando la clave
        int pos;
        String[] consonantes = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z" };
        String[] vocales = {"A", "E", "I", "O", "U"};

        //letra 1
        pos = (int)(Math.random() * 21);
        cadena = cadena + consonantes[pos];
        
        //letra 2
        pos = (int)(Math.random() * 5);
        cadena = cadena + vocales[pos].toLowerCase();

        //letra 3
        pos = (int)(Math.random() * 21);
        cadena = cadena + consonantes[pos].toLowerCase();

        //letra 4
        pos = (int)(Math.random() * 5);
        cadena = cadena + vocales[pos].toLowerCase();

        //letra 5
        pos = (int)(Math.random() * 21);
        cadena = cadena + consonantes[pos].toLowerCase();

        //letra 6
        pos = (int)(Math.random() * 5);
        cadena = cadena + vocales[pos].toLowerCase();
        //letra 7
        pos = (int)(Math.random() * 21);
        cadena = cadena + consonantes[pos].toLowerCase();

        //letra 8
        pos = (int)(Math.random() * 5);
        cadena = cadena + vocales[pos].toLowerCase();

        //letra 9
        cadena = cadena + ".";

        //letra 10
        pos = (int)(Math.random() * 10);
        cadena = cadena + String.valueOf(pos);

        //letra 11
        pos = (int)(Math.random() * 10);
        cadena = cadena + String.valueOf(pos);

        //letra 12
        pos = (int)(Math.random() * 10);
        cadena = cadena + String.valueOf(pos);

        //letra 13
        pos = (int)(Math.random() * 10);
        cadena = cadena + String.valueOf(pos);

        //imprimir la cadena
        System.out.println(cadena);

    }
    
}
