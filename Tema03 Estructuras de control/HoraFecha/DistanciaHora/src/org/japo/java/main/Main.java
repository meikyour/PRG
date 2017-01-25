package org.japo.java.main;

//Importación Gregorian Calendar.
import java.util.GregorianCalendar;

//Importacion Calendar.
import java.util.Calendar;

//Importación objeto Scanner.
import java.util.Scanner;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Instanciación clase Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        
        //Instanciación clase Gregorian Calendar.
        GregorianCalendar gc = new GregorianCalendar();
        
        //Variables.
        //Hora del sistema en este momento.
        //Introducir valores.
        System.out.printf("Introduce la hora.............: ");
        int hInt = scn.nextInt();
        scn.nextLine();
        System.out.printf("Introduce los minutos.........:");
        int mInt = scn.nextInt();
        scn.nextLine();
        System.out.printf("Introduce los segundos........:");
        int sInt = scn.nextInt();
        scn.nextLine();  
        
        //Obtener valores.
        int hSis = gc.get(Calendar.HOUR_OF_DAY);
        int mSis = gc.get(Calendar.MINUTE);
        int sSis = gc.get(Calendar.SECOND);
        
        //Tiempo actual.
        int tiempoEntrada = hInt * 3600 +mInt * 60 + sInt;
        int tiempoActual = hSis * 3600 + mSis * 60 + sSis;

        //Diferencia de entre hora introducida y hora del sistema.
        //Segundos.
        int distanciaSeg = tiempoActual - tiempoEntrada;
        
        //Minutos.
        int minDis = distanciaSeg / 60;
        distanciaSeg = distanciaSeg % 60;

        //Horas.
        int horDis = minDis / 60;
        minDis = minDis % 60;
        
        //Impresión de valores.
        //Hora intruducida por teclado.
        System.out.printf("La hora que has introducido es....: %02d:%02d:%02d\n", hInt, mInt, sInt);   
        //Hora del sistema.
        System.out.printf("La hora del sistema es............: %02d:%02d:%02d\n", hSis, mSis, sSis);
        //Diferencia entre hora introducida y hora del sistema.
        System.out.printf("Distancia.........................: %02d:%02d:%02d\n", horDis, minDis, distanciaSeg);
    }   
}
