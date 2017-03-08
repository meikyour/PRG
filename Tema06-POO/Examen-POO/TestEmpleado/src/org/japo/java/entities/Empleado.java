/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

// Importaciones.
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.japo.java.interfaces.IEmpleado;
import org.japo.java.lib.UtilesEmpleado;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class Empleado implements Serializable, IEmpleado {

    // -------------- Atributo de clase privado -----------------------------------
    private String cargo;

    // ------------------ Constructores predeterminado y parametizado ----------------
    public Empleado() {
        this.cargo = "Operario";
    }

    public Empleado(String cargo) {

        if (UtilesEmpleado.validarCargo(cargo)) {
            this.cargo = cargo;
        } else {
            this.cargo = "Operario";
        }
    }

    // -------------------- Setters y Getters ------------------------
    public void setCargo(String cargo) {

        if (UtilesEmpleado.validarCargo(cargo)) {
            this.cargo = cargo;
        }
    }

    public String getCargo() {
        return cargo;
    }

    // --------------------- Métodos heredados del Interfaz -------------------------
    @Override
    public void mostrarInfo() {
        
        // Instanciación clase Gregorian Calendar.
        GregorianCalendar gc = new GregorianCalendar();

        System.out.printf("Informe.......: %d:%d:%d\n", gc.get(Calendar.HOUR_OF_DAY), gc.get(Calendar.MINUTE), gc.get(Calendar.SECOND));
        System.out.println("Cargo........: " + this.getCargo());
    }

}
