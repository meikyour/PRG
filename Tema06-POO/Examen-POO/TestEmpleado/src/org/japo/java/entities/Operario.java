/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.japo.java.lib.UtilesEmpleado;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Operario extends Empleado {

    // ------------------- Atributo de clase privado -----------------------------------
    private String seccion;

    // ------------------ Constructores predeterminado y parametizado ----------------
    public Operario() {
        
        super.setCargo("Operario");
        this.seccion = "Producción";
    }

    public Operario(String seccion) {

        super.setCargo("Operario");
        
        if (UtilesEmpleado.validarSeccion(seccion)) {
            this.seccion = seccion;
        } else {
            super.setCargo("Operario");
            this.seccion = "Producción";
        }
    }

    // -------------------- Setters y Getters ---------------------------
    public void setSeccion(String seccion) {

        if (UtilesEmpleado.validarSeccion(seccion)) {
            this.seccion = seccion;
        }
    }

    public String getSeccion() {
        return seccion;
    }

    // --------------------- Método heredado ----------------------------
    @Override
    public void mostrarInfo() {

        // Instanciación clase Gregorian Calendar.
        GregorianCalendar gc = new GregorianCalendar();
        
        System.out.println();
        System.out.printf("Informe.......: %d:%d:%d\n", gc.get(Calendar.HOUR_OF_DAY), gc.get(Calendar.MINUTE), gc.get(Calendar.SECOND));
        System.out.println("Cargo........: " + super.getCargo());
        System.out.println("Sección......: " + this.seccion);
    }

}
