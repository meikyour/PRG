
package org.japo.java.main;

public class Main {
   public static void main(String[]arg) {
       
       //Constantes.
       final int SALIDA_CASA= 16 * 60 + 30;            //Hora a la que han salido de casa.
       final int SALIDA_NORMAL_AUTOBUS = 17 * 60;      //Hora a la que deberíá haber salido el autobús.
       final int RECORRIDO_NORMAL= 20;                 //Recorrido normal que tardan de casa al autobús.
       final int RETRASO_AUTOBUS= 5;                   //Minutos que se a retrasado el autobús.       
       
       //Variables.
       //Hora real a la que a salido el autobús.
       double salidaRealAutobus= (SALIDA_NORMAL_AUTOBUS + RETRASO_AUTOBUS) / 60;
       System.out.printf("El autobus a salido a las %.0f:0%d horas.\n",salidaRealAutobus, RETRASO_AUTOBUS);
       
       //Tiempo real que han tardado en llegar desde casa al autobús.
       double tiempoRealLlegada= SALIDA_NORMAL_AUTOBUS + RETRASO_AUTOBUS - SALIDA_CASA;
       System.out.printf("Han tardado %.0f minutos en llegar al autobus.\n", tiempoRealLlegada);
   } 
}

