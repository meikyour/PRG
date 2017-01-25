package org.japo.java.main;

//Importación clase Random.
import java.util.Random;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {

        //Instanciación clase Random.
        Random rnd = new Random(System.currentTimeMillis());

        //Constantes / Valores máximos y mínimos.
        char MAX = 'Z';
        char MIN = 'A';
        int VECES_MAX = 8;

        //Variables.
        char aleatorio;

        //Resolución / Cálculos.
        System.out.printf("Pasword..............:");

        for (int veces = 1; veces <= VECES_MAX; veces++) {
            aleatorio = (char) (rnd.nextInt(MAX - MIN + 1) + MIN);
            System.out.printf("" + aleatorio);
        }
    }
}
