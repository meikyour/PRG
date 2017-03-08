/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.util.GregorianCalendar;
import java.util.Calendar;
import org.japo.java.lib.UtilesEmpleado;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Encargado extends Empleado {

    // Constante con el stock máximo remanente del día anterior al comenzar la jornada.
    public static final int REMANENTE_MAX = 10;
    // Constante con el stock mínimo remanente del día anterior al comenzar la jornada.
    public static final int REMANENTE_MIN = 1;

    // ------------------- Atributo de clase privado -----------------------------------
    // Número de unidades que llevan fabricadas hasta el momento.
    private int produccion;

    // ------------------ Constructores predeterminado y parametizado ----------------
    public Encargado() {
        super.setCargo("Encargado");
        this.produccion = UtilesEmpleado.stockRemanente();
    }

    public Encargado(int produccion) {

        if (produccion >= 0) {
            this.produccion = produccion + UtilesEmpleado.stockRemanente();
        } else {
            super.setCargo("Encargado");
            this.produccion =UtilesEmpleado.stockRemanente();
        }
    }

    // -------------------- Setters y Getters ---------------------------
    public void setProduccion(int produccion) {
        if (UtilesEmpleado.validarObjetivo(produccion)) {
            this.produccion = produccion + UtilesEmpleado.stockRemanente();
        }
    }

    public int getProduccion() {
        return produccion;
    }

    // --------------------- Método heredado ----------------------------
    @Override
    public void mostrarInfo() {

        // Instanciación clase Gregorian Calendar.
        GregorianCalendar gc = new GregorianCalendar();

        System.out.printf("Informe.......: %d:%d:%d\n", gc.get(Calendar.HOUR_OF_DAY), gc.get(Calendar.MINUTE), gc.get(Calendar.SECOND));
        System.out.println("Cargo........: " + super.getCargo());
        System.out.printf("Producción....: %d/100 - %s\n", getProduccion(), UtilesEmpleado.mostrarObjetivo(this.produccion));
    }

}
