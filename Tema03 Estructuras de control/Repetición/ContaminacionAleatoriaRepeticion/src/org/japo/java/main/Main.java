
package org.japo.java.main;

//Importación clase Random.
import java.util.Random;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Random.
        Random rnd = new Random(System.currentTimeMillis());
        
        //Constantes.
        int ESTACIONES_MAX = 4;
        double CONTAMINACION_MAX = 100;
        double CONTAMINACION_MIN = 0;
                
        //Variables.
        int estaciones = 0;
        double nivelContaminacion;
        
        //Resolcuión / Cálculos.
        do{
            nivelContaminacion = rnd.nextDouble() * (CONTAMINACION_MAX - CONTAMINACION_MIN) + CONTAMINACION_MIN;
            estaciones++;
            System.out.printf("Estación %d.........: %.2f mcg NO2.\n", estaciones, nivelContaminacion);
        } while (estaciones < ESTACIONES_MAX);
    }
}
