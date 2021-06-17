package unidadesVelocidad;

public class UnidadVelocidad {

    //variables miembro
    private double velocidad;   //velocidad en m/s o km/h
    private String medida;      //puede ser o m/s o km/h. Es la Unidad de medida

    //constructor. No pasamos parametros. Los pasamos cuando introduzcamos datos
    public UnidadVelocidad(){}

    //getters.

    //devuelve la velocidad
    public double getVelocidad(){ return this.velocidad;}

    //devuelve la unidad de medida
    public String getMedida(){ return this.medida;}

    //setters

    //para definir la velocidad. Recibe la velocidad
    public void setVelocidad(double vel){ this.velocidad = vel;}

    //para definir la unidad de medida, recibe un String que puede ser m/s o km/h
    public void setMedida(String med){ this.medida = med;}

    //metodo para devolver el calculo
    @Override
    public String toString(){

        //variables locales
        String cadena="";

        //de km/h a m/s
        if(this.getMedida().equals("Km/h"))
            cadena = String.format("velocidad= %.2f m/s", (this.getVelocidad()/3.6));

        //de m/s a km/h
        else cadena = String.format("velocidad= %d km/h", (int)(this.getVelocidad()*3.6));

        //devolvemos la cadena
        return cadena;
    }
    
}
