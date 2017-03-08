/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.japo.java.lib.UtilesEmpleado;
import org.japo.java.interfaces.IEmpleado;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Empleado implements IEmpleado, Serializable {

    public static final String CARGO_OPE = "Operario";
    public static final String CARGO_ENC = "Encargado";

    private String cargo;

    public Empleado() {
        this.cargo = CARGO_OPE;
    }

    public Empleado(String cargo) {
        if (UtilesEmpleado.validarCargo(cargo)) {
            this.cargo = cargo;
        } else {
            this.cargo = CARGO_OPE;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (UtilesEmpleado.validarCargo(cargo)) {
            this.cargo = cargo;
        }
    }

    @Override
    public void mostrarInfo() {
        // Objeto GregorianCalendar
        GregorianCalendar gc = new GregorianCalendar();
        
        // Tiempo
        int h = gc.get(Calendar.HOUR_OF_DAY);
        int m = gc.get(Calendar.MINUTE);
        
        // Mensajes
        System.out.printf("Informe .....: %02d:%02dh\n", h, m);
        System.out.printf("Cargo .......: %s\n", this.cargo);
    }

}
