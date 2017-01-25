/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib.utiles;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Utiles {

    // Constante saludo (instanciada en la CLASE).
    public static final String SALUDO = "Hello!";

    
    // Método 1 (dentro de la CLASE Utiles) "Caja Negra = Static".
    public static int sumar(int n1, int n2) {

        return n1 + n2;
    }

    // Método 2 (dentro de la CLASE Utiles) "Caja Blanca".
    public void saludar() {

        System.out.println(SALUDO);
    }
}
