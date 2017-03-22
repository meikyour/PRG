/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

import java.util.Random;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class NumeroPrimitiva {

    //Instanciación del método Random.
    public static final Random RND = new Random(System.currentTimeMillis());

    public static final int NUMEROS_DISPONIBLES = 49;
    public static final int NUMEROS_UTILIZABLES = 6;

    //Instanciación del Array que contiene los números que forman el boleto de la Primitiva.
    public static int[] numeroPapeleta = new int[NUMEROS_UTILIZABLES];

    //Obtiene un número aleatorio.
    public static int obtenerNumero(int n1, int n2) {

        int numero = RND.nextInt(n1 - n2 + 1) + n2;

        return numero;
    }

    //Repite el método anterior y lo almacena.
    public static void repetirNumero(int n1, int n2, int vecesMax) {

        for (int veces = 0; veces <= vecesMax; veces++) {

            numeroPapeleta[veces] = obtenerNumero(n1, n2);
        }
    }
/*
    public static void comprobarNumeroRepetido(int[] numeroPapeleta) {

        boolean testOK = false;
        int veces = 0;

        repetirNumero(1, 49, NUMEROS_UTILIZABLES);
        /*
        while (testOK) {
            switch (numeroPapeleta[veces]) {
                case 1:
                    testOK = true;
                    break;
                case 2:
                    testOK = true;
                    break;
                case 3:
                    testOK = true;
                    break;
                case 4:
                    testOK = true;
                    break;
                case 5:
                    testOK = true;
                    break;
                case 6:
                    testOK = true;
                    break;
                default:
                    testOK = true;
                    throw new AssertionError();
            }
            testOK = false;
        }

        do {
            if (numeroPapeleta[veces] == numeroPapeleta[0]) {
                testOK = true;
            } else if (numeroPapeleta[veces] == numeroPapeleta[1]) {
                testOK = true;
            } else if (numeroPapeleta[veces] == numeroPapeleta[2]) {
                testOK = true;
            } else if (numeroPapeleta[veces] == numeroPapeleta[3]) {
                testOK = true;
            } else if (numeroPapeleta[veces] == numeroPapeleta[4]) {
                testOK = true;
            } else if (numeroPapeleta[veces] == numeroPapeleta[5]) {
                testOK = true;
            } else {
                veces++;
            }
            testOK = false;
        } while (testOK);

    }
*/
    
    //Mensaje con el número completo del boleto de Primitiva.
    public static void mensajePrimitiva(int n1, int n2, int vecesMax) {

        repetirNumero(n1, n2, vecesMax);
        
        for (int i = 0; i < numeroPapeleta.length; i++) {
            System.out.printf("Numero %d.......: %d \n", i + 1, numeroPapeleta[i]);
        }
        System.out.println();
        System.out.printf("Numero de la Primitiva....: %d-%d-%d-%d-%d\n", numeroPapeleta[0], numeroPapeleta[1], numeroPapeleta[2], numeroPapeleta[3], numeroPapeleta[4]);
    }

}
