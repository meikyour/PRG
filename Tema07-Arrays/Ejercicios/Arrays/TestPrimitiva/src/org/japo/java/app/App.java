package org.japo.java.app;

import org.japo.java.lib.UtilesLoteria;
//@author 2K16 - Angel Pastelero angel.pastelero399@gmail.com

public class App {

    //
    //
    public void lanzarAplicacion() {
        int[] sorteo = new int[UtilesLoteria.NUMEROS_UTILIZABLES];

        UtilesLoteria.generarApuestaPrimitiva(sorteo);

        System.out.println("-----------------------");
        System.out.println("APUESTA NO ORDENADA");
        System.out.println("-----------------------");

        for (int i = 0; i < sorteo.length; i++) {
            System.out.printf("Número %d ....: %d\n", i + 1, sorteo[i]);
        }
        System.out.println("-----------------------");
        System.out.println("APUESTA ORDENADA");
        System.out.println("-----------------------");

        java.util.Arrays.sort(sorteo);
        for (int i = 0; i < sorteo.length; i++) {
            System.out.printf("Número %d ....: %d\n", i + 1, sorteo[i]);
        }

    }
}