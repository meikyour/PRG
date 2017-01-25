package org.japo.java.main;

//Importación clase Gregorian Calendar.
//import java.util.GregorianCalendar;

//Importacion clase Calendar.
import java.util.Date;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Instanciación clase Gregorian Calendar.
        //GregorianCalendar gc = new GregorianCalendar();
        
        //Variable tiempo.
        //long tiempo = System.currentTimeMillis();
        long tiempo = new Date().getTime();
        
        //Resolución.
        System.out.println("Tiempo UNIX..........:"+ tiempo);
    } 
}