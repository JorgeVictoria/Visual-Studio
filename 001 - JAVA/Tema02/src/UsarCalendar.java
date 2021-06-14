import java.util.Calendar;
import java.util.TimeZone;

public class UsarCalendar {

    public static void main(String[] args) {
        
        //obtenemos la instancia
        Calendar ahora = Calendar.getInstance();
        Calendar despues = Calendar.getInstance();

        //nos devuelve la fecha/hora
        System.out.println(ahora.getTime());

        //nos devuelve el año
        System.out.println(ahora.get(Calendar.YEAR));

        //nos devuelve la semana del año
        System.out.println((ahora.get(Calendar.WEEK_OF_YEAR)));

        //y asi un monton de datos

        //sumar fechas
        despues.add(Calendar.DAY_OF_MONTH, 30);
        System.out.println("Today plus 20 days : " + despues.getTime());

        //restar fechas
        despues.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("Today minus 10 days : " + despues.getTime());
        
        //comparar 2 fechas
        System.out.println(ahora.after(despues));
        System.out.println(ahora.before(despues));

        //dias entre fechas
        System.out.println(despues.get(Calendar.DAY_OF_YEAR) - ahora.get(Calendar.DAY_OF_YEAR));

        //zonas horarias
        //String[] timeZones = TimeZone.getAvailableIDs();
        //System.out.println("Available Timezones" + Arrays.toString(timeZones));
        Calendar horaUk = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        System.out.println(horaUk.get(Calendar.HOUR_OF_DAY));
    }
    
}
