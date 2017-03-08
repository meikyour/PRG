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
public class UtilesEmpleado {

    // Constante con el número de unidades diarias que se deben cumplir.
    public static final int OBJETIVO = 100;
    // Constante con el stock máximo remanente del día anterior al comenzar la jornada.
    public static final int REMANENTE_MAX = 10;
    // Constante con el stock mínimo remanente del día anterior al comenzar la jornada.
    public static final int REMANENTE_MIN = 1;

    // Método que permite validar el cargo del empleado.
    public static boolean validarCargo(String cargo) {

        return cargo.equals("Operario") || cargo.equals("Encargado");
    }

    // Método que permite validar la sección del operario.
    public static boolean validarSeccion(String seccion) {

        return seccion.equals("Producción") || seccion.equals("Almacén") || seccion.equals("Mantenimiento");
    }

    // Método que devuelve el remanente aleatorio del día anterior entre 1 y 10;
    public static int stockRemanente() {

        // Instanciación de la clase Random.
        Random rnd = new Random(System.currentTimeMillis());

        // Devuelve un remanente aleatorio entre 1 y 10;
        return rnd.nextInt(REMANENTE_MAX - REMANENTE_MIN) + REMANENTE_MIN;
    }

    // Método que valora si se ha conseguido o no el objetivo.
    public static boolean validarObjetivo(int produccion) {

        boolean objetivoOK;
        String objetivo;
        
        if (produccion + stockRemanente() >= OBJETIVO) {
            objetivoOK = true;
        } else {
            objetivoOK = false;
        }

        return objetivoOK;
    }

    // Método que muestra si se ha conseguido o no el objetivo con un String.
    public static String mostrarObjetivo(int produccion) {

        String objetivo;
        if (validarObjetivo(produccion)) {
            objetivo = "Conseguido";
        } else {
            objetivo = "Pendiente";
        }

        return objetivo;
    }
   
}
