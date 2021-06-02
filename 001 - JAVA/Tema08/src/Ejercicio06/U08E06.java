package Ejercicio06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class U08E06 {
    //para puntuar los chistes que salen
    private static int[] puntuacion = new int[3]; //para añmacenar la puntuacion del usuario
    private static int[] posChistes = new int[3]; //para almacenar las posiciones de los chistes del random
    private static double[] comparacion;          //para almacenar el manhattam de los usuarios
    private static List<Usuario> misUsuarios = new ArrayList<>();   //para almacenar usuarios
    private static List<Chiste> misChistes = new ArrayList<>();     //para almacenar chistes
    private static List<Puntos> misPuntos = new ArrayList<>();      //para almacenar puntuaciones

    public static void main(String[] args) {

        //creamos los usuarios
        
        try {
			//nos creamos un filereader envuelto en un buffer de lectura
			BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\usuarios.csv"));
			
			//leemos la primera linea
			String linea = br.readLine();
			
			//mientras hayan lineas que leer
			while (linea != null) {
			
			    //construimos un array con los campos de la linea. Separamos los campos con split
				String [] fields = linea.split(";"); 
		
				//si hay info de la provincia, la mostramos por pantalla
				if(fields.length == 2) {
					int id = Integer.parseInt(fields[0]);
                    String usuari = fields[1];
                    Usuario temp = new Usuario(id, usuari);
                    misUsuarios.add(temp);
				} 
				
				 //leemos la siguiente linea
				linea = br.readLine();
			}

            br.close();


			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

        //creamos los chistes
        

       try {
			//nos creamos un filereader envuelto en un buffer de lectura
			BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\chistes.csv"));
			
			//leemos la primera linea
			String linea = br.readLine();
			
			//mientras hayan lineas que leer
			while (linea != null) {
			
			    //construimos un array con los campos de la linea. Separamos los campos con split
				String [] fields = linea.split(";"); 
		
				//si hay info de la provincia, la mostramos por pantalla
				if(fields.length == 2) {
					int id = Integer.parseInt(fields[0]);
                    String text = fields[1];
                    Chiste temp = new Chiste(id, text);
                    misChistes.add(temp);
				} 
				
				 //leemos la siguiente linea
				linea = br.readLine();
			}

            br.close();

            
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

        //creamos los puntos
        

        try {
			//nos creamos un filereader envuelto en un buffer de lectura
			BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\puntos.csv"));
			
			//leemos la primera linea
			String linea = br.readLine();
			
			//mientras hayan lineas que leer
			while (linea != null) {
			
			    //construimos un array con los campos de la linea. Separamos los campos con split
				String [] fields = linea.split(";"); 
		
				//si hay info de la provincia, la mostramos por pantalla
				if(fields.length == 3) {
					int idu = Integer.parseInt(fields[0]);
                    int idc = Integer.parseInt(fields[1]);
                    int punts = Integer.parseInt(fields[2]);
                    Puntos temp = new Puntos(idu, idc, punts);
                    misPuntos.add(temp);
				} 
				
				 //leemos la siguiente linea
				linea = br.readLine();
			}

            br.close();

            
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

        

        Scanner stdin = new Scanner(System.in);

        //Escogemos 3 chistes al azar y los puntuamos
        for(int i = 0; i <= 2; i++){
            puntuacion[i] = 0;                                          //inicialimos la nota
            int pos = (int)(Math.random() * misChistes.size());         //contamos un chiste al azar
            posChistes[i] = pos;                                        //almacenamos la posicion del chiste
            System.out.println(misChistes.get(pos).getTexto());         //mostramos el chiste
            while (puntuacion[i] <= 0 || puntuacion[i] >= 6){
                System.out.print("Puntacion del chiste[1-5]: ");
                puntuacion[i] = stdin.nextInt();                        //almacenamos la puntuacion
            }
        }

        //algoritmo de comparacion con el resto de usuarios

        //creamos el array donde iremos almacenando los distintos calculos
        comparacion = new double[misUsuarios.size()];

        //calculamos el manhattam vs los usuarios
        for(int i = 0; i < comparacion.length; i++){
            comparacion[i] = manhattam(i);
        }

        /*//para ver los calculos
        for(int i = 0; i < comparacion.length; i++){
            System.out.println(comparacion[i]);
        }*/

        //obtenemos la menor distancia
        double menor=comparacion[0];
        for(int i = 0; i < comparacion.length; i++){
            if (comparacion[i] < menor) menor = comparacion[i];
        }

        //System.out.println(menor);

        //System.out.println();

        System.out.println("Usuarios parecidos: ");

        //imprimimos usuarios parecidos
        for(int i = 0; i < comparacion.length; i++){
            if (comparacion[i] == menor){
                System.out.println(misUsuarios.get(i).getNombre());
                otrosChistes(i);
            } 
        }

        

    }

    public static double manhattam(int usuario){
        //aumentamos 1 el usuario para que coincida la posicion
        usuario++;

        double nota1=0;
        double nota2=0;
        double nota3=0;

        //corremos el arrayList de puntos para el chiste 1. 
        for(int i = 0; i < misPuntos.size();i++){
            if(misPuntos.get(i).getIdUsuario() == usuario && misPuntos.get(i).getIdChiste() == posChistes[0]) nota1 = misPuntos.get(i).getPuntos();
        }

        //corremos el arrayList de puntos para el chiste 2
        for(int i = 0; i < misPuntos.size();i++){
            if(misPuntos.get(i).getIdUsuario() == usuario && misPuntos.get(i).getIdChiste() == posChistes[1]) nota2 = misPuntos.get(i).getPuntos();
        } 

        //corremos el arrayList de puntos para el chiste 3
        for(int i = 0; i < misPuntos.size();i++){
            if(misPuntos.get(i).getIdUsuario() == usuario && misPuntos.get(i).getIdChiste() == posChistes[2]) nota3 = misPuntos.get(i).getPuntos();
        } 

        double calculo = (Math.abs(nota1-puntuacion[0] + Math.abs(nota2-puntuacion[1]) + Math.abs(nota3-puntuacion[2]))/3);




        return calculo;
    }

    
    public static void otrosChistes(int usu){

        usu++;

        for(int i = 0; i < misPuntos.size(); i++){
            if (misPuntos.get(i).getIdUsuario() == usu){
                int chiste = misPuntos.get(i).getIdChiste();
                for(int z = 0; z < misChistes.size();z++){
                    if (misChistes.get(z).getId() == chiste && posChistes[0] != z && posChistes[1] != z && posChistes[2] != z){
                         System.out.println (misChistes.get(z).getTexto());
                         System.out.println("Puntos otorgados: " + misPuntos.get(i).getPuntos());
                    }
                }
            } 
        }
    }


    
    
} //fin clase U08E06

class Usuario{

    //variables miembro
    int Id;
    String nombre;

    //constructor
    public Usuario(int id, String nom){
        this.Id = id;
        this.nombre = nom;
    }

    //getters
    public int getId() { return this.Id;}
    public String getNombre() { return this.nombre;}

    //setters
    public void setId(int id) { this.Id = id;}
    public void setNombre(String nom) { this.nombre = nom;}

} //fin clase Usuario

class Chiste{

    //variables miembro
    int Id;
    String texto;

    public Chiste (int id, String chiste){
        this.Id = id;
        this.texto = chiste;
    }

    //getters
    public int getId() { return this.Id;}
    public String getTexto() { return this.texto;}

    //setters
    public void setId(int id) { this.Id = id;}
    public void setNombre(String chiste) { this.texto = chiste;}

}//fin clase chiste

class Puntos{

    //variables miembro
    int IdUsuario;
    int IdChiste;
    int puntos;

    public Puntos(int idUser, int idText, int punts){
        this.IdUsuario = idUser;
        this.IdChiste = idText;
        this.puntos = punts;
    }

    //getters
    public int getIdUsuario() { return this.IdUsuario;}
    public int getIdChiste() { return this.IdChiste;}
    public int getPuntos() { return this.puntos;}

    //setters
    public void setIdUsuario(int IdUser) { this.IdUsuario = IdUser;}
    public void setIdChiste(int idtext) { this.IdChiste = idtext;}
    public void setPuntos(int punts) { this.puntos = punts;}

}//fin clase Puntos



