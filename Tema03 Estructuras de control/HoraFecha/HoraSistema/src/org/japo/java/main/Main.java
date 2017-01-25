package org.japo.java.main;

//Importación objeto Calendar.
import java.util.Calendar;
//Importación objeto Gregorian Calendar.
import java.util.GregorianCalendar;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        // 1-Instanciación clase Gregorian Calendar.
        GregorianCalendar gc = new GregorianCalendar();
        
        //2-Variables.
        int h;
        int m;
        int s;
        
        //3-Obterner valores.
        h = gc.get(Calendar.HOUR_OF_DAY);
        m = gc.get(Calendar.MINUTE);
        s = gc.get(Calendar.SECOND);
        
        //4-Mensaje.
        System.out.printf("Hora del sistema........: %02d:%02d:%02d\n", h, m, s); 
    }  
}