/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Nif {

    // Lista de letras.
    public final static String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    // Valores límite. 
    public final static int DNI_MIN = 10000000; // (POR DEFECTO)
    public final static int DNI_MAX = 99999999;

    // Número de DNI.
    private int dni = DNI_MIN;
    //private char control;

    public void setDni(int dni) {

        if (dni >= DNI_MIN && dni <= DNI_MAX) {
            this.dni = dni;
        }
    }

    public int getDni() {
        return dni;
    }

    public char calcularLetraDni(String letras, int dni) {

        return letras.charAt(dni % 23);
    }

    public char getLetra() {

        return calcularLetraDni(LETRAS, dni);
    }

    //------------------------------------------------------------------------------------------------------
    
    /*
    public void setControl(int control) {

        this.control = LETRAS.charAt(dni % 23);
    }

    public char getControl() {

        return control;
    }
*/
}
