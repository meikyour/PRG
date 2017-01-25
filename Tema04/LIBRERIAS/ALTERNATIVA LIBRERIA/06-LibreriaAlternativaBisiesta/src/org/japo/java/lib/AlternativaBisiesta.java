/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class AlternativaBisiesta {

    // Instancia un objeto Scanner
    //Scanner sc = new Scanner(System.in);
    // Introduce el año a analizar
    //System.out.print("Introduzca año: ");
    //int any = sc.nextInt();
    // Acceso al calendario del sistema
    public static final GregorianCalendar gc = new GregorianCalendar();

    public static int obtenerAny() {

        int any = gc.get(Calendar.YEAR);

        return any;
    }

    public static String analizaAny(int any) {

        // Analiza el año
        String decision;

        if (any % 400 == 0) {
            decision = "SI";
        } else if (any % 100 == 0) {
            decision = "NO";
        } else if (any % 4 == 0) {
            decision = "SI";
        } else {
            decision = "NO";
        }
        return decision;
    }

    public static void mensaje() {

        //Variables.
        int any = obtenerAny();
        String decision = analizaAny(any);

        // Mensaje Resultado
        System.out.printf("El año %d %s es bisiesto\n", any, decision);
    }
}
