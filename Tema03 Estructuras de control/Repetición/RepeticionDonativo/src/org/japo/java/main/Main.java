
package org.japo.java.main;

//Importación clase Random.
import java.util.Random;

/**
 *
 * @author (c) Raul Granel
 */
public class Main {

    public static void main(String[] args) {

        // Random
        Random rnd = new Random();

        //Constantes.
        //Cantidad total de donativos que hubieron.
        final int TOTAL_DONATIVOS = 13247;

        //Variables.
        //Suma de las cantidades de los donativos.
        double totalRecaudado = 0;
        //Cantidad de dinero que se aporta en cada donativo.
        double cantidadDonativo;

        //Contador de los donativos que se realizan.
        for (int donativos = 1; donativos <= TOTAL_DONATIVOS; donativos++) {

            //Cantidad que se aporta en cada donativo.
            cantidadDonativo = rnd.nextDouble();

            //Suma de las cantidades de cada donativo.
            totalRecaudado += cantidadDonativo;
        }
        //Mensaje con el total de dinero recaudado.
        System.out.printf("Dinero total recaudado.....: %.2f\n", totalRecaudado);
    }
}
