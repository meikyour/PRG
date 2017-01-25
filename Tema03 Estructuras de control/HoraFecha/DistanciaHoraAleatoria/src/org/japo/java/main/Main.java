package org.japo.java.main;

//Importación Gregorian Calendar.
import java.util.GregorianCalendar;

//Importacion Calendar.
import java.util.Calendar;

//Importación objeto Scanner.
import java.util.Random;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Instanciación clase Random.
        Random rnd = new Random(System.currentTimeMillis());
        
        //Instanciación clase Gregorian Calendar.
        GregorianCalendar gc = new GregorianCalendar();
        
        //Constantes limites para valores aleatorios.
        int H_MAX = 24;
        int H_MIN = 0;
        int M_MAX = 60;
        int M_MIN = 0;
        int S_MAX = 60;
        int S_MIN = 0;
        
        //Variables aleatorias.
        int hRnd = rnd.nextInt(H_MAX - H_MIN + 1) + H_MIN;
        int mRnd = rnd.nextInt(M_MAX - M_MIN + 1) + M_MIN;
        int sRnd = rnd.nextInt(S_MAX - S_MIN + 1) + S_MIN;
        
        //Obtener valores.
        int hSis = gc.get(Calendar.HOUR_OF_DAY);
        int mSis = gc.get(Calendar.MINUTE);
        int sSis = gc.get(Calendar.SECOND);
        
        //Tiempo actual.
        int tiempoEntrada = hRnd * 3600 +mRnd * 60 + sRnd;
        int tiempoActual = hSis * 3600 + mSis * 60 + sSis;

        //Diferencia de entre hora introducida y hora del sistema.
        //Segundos.
        int distanciaSeg = tiempoActual - tiempoEntrada;
        
        //Actuación en caso de numero negativo.
        if(distanciaSeg < 0){
            distanciaSeg = distanciaSeg * -1;
        }
        //Minutos.
        int minDis = distanciaSeg / 60;
        distanciaSeg = distanciaSeg % 60;

        //Horas.
        int horDis = minDis / 60;
        minDis = minDis % 60;
        
        //Impresión de valores.
        //Hora aleatoria.
        System.out.printf("La hora que has introducido es....: %02d:%02d:%02d\n", hRnd, mRnd, sRnd);   
        //Hora del sistema.
        System.out.printf("La hora del sistema es............: %02d:%02d:%02d\n", hSis, mSis, sSis);
        //Diferencia entre hora introducida y hora del sistema.
        System.out.printf("Distancia.........................: %02d:%02d:%02d\n", horDis, minDis, distanciaSeg);
    }   
}
