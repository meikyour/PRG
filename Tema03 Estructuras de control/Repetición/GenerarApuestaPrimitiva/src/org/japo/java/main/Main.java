package org.japo.java.main;

//Random.
import java.util.Random;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {
        
        //Random.
        Random rnd = new Random(System.currentTimeMillis());
        
        //Constantes.
        //Limites de posibilidades.
        final int LIM_INF = 1;
        final int LIM_SUP = 49;
        //Limites de tiradas.
        final int TIRADAS_MAX = 6;
        final int TIRADAS_MIN = 1;
        
        //Variables.
        int resultado; 
        
        for (int tiradas = TIRADAS_MIN; tiradas < TIRADAS_MAX; tiradas++){
            resultado = rnd.nextInt(LIM_SUP - LIM_INF + 1) + LIM_INF;
            System.out.printf("Ha salido.......: %d\n",  resultado);
        }
    }
}