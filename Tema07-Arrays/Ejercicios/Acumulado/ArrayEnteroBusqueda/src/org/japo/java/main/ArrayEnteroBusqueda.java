/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;
import org.japo.java.lib.BuscarArray;
import org.japo.java.lib.LlenarArrayAleatorio;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class ArrayEnteroBusqueda {

    public static final Random RND = new Random(System.currentTimeMillis());

    public static final int MIN = 0;
    public static final int MAX = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numero = new int[5];
        int number = RND.nextInt(MAX - MIN + 1) + MIN;

        LlenarArrayAleatorio.llenarArrayAleatorioEntero(numero, MIN, MAX);

        for (int i = 0; i < numero.length; i++) {
            System.out.printf("Número %d.........: %d\n", i + 1, numero[i]);
        }

        if (BuscarArray.buscarEnteroArray(numero, number) != -1) {
            System.out.printf("Aforo......: %d - Sí encontrado - Posición %d\n", number, BuscarArray.buscarEnteroArray(numero, number) + 1);
        } else {
            System.out.println("Número no encontrado.");
        }
    }

}
