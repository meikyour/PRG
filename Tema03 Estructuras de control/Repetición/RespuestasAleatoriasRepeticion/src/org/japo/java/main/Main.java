
package org.japo.java.main;

//Importación clase Random.
import java.util.Random;
/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Random.
        Random rnd = new Random(System.currentTimeMillis());
        
        //Constantes /Respuestas lógicas del examen.
        boolean RESPUESTA;
        int RESPUESTAS_MAX = 10;
        
        for (int num_respuestas = 1; num_respuestas <= RESPUESTAS_MAX; num_respuestas++){
            RESPUESTA = rnd.nextBoolean();
            System.out.printf("Respuesta %02d..........: %b.\n", num_respuestas, RESPUESTA);
        }
    }
}
