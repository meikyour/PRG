/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class UtilesTemporales {

    public static boolean validacionHora(String hora) {

        boolean analisisOK;

        try {
            // Extraer componentes.
            String h = hora.substring(0, hora.indexOf(":"));
            String m = hora.substring(hora.indexOf(':') + 1, hora.lastIndexOf(':'));
            String s = hora.substring(hora.lastIndexOf(':') + 1);

            // Conversiones numericas.
            int hor = Integer.parseInt(h);
            int min = Integer.parseInt(m);
            int seg = Integer.parseInt(s);

            // Validar datos.
            analisisOK = validarHora(hor) && validarMinutos(min) && validarSegundos(seg);

        } catch (Exception e) {
            analisisOK = false;
        }

        // Devuelve hora válida.
        return analisisOK;
    }

    private static boolean validarHora(int hor) {

        return hor >= 0 && hor <= 23;
    }

    private static boolean validarMinutos(int min) {

        return min >= 0 && min <= 59;
    }

    private static boolean validarSegundos(int seg) {

        return seg >= 0 && seg <= 59;
    }
}
