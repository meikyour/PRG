package org.japo.java.main;

//Importación Gregorian Calendar.
import java.util.GregorianCalendar;

//Importacion Calendar.
import java.util.Calendar;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1-Instanciación Gregorian Calendar.
        GregorianCalendar gc = new GregorianCalendar();
 
        //2-Variables.
        int d;
        int m;
        int a;
        
        //3-Obtener valores.
        d = gc.get(Calendar.DAY_OF_MONTH);
        m = gc.get(Calendar.MONTH)+1;
        a = gc.get(Calendar.YEAR);
        
        //4-Resultado.
        System.out.printf("%02d/%02d/%04d\n", d, m, a);
    } 
}
