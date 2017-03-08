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

import java.util.Random;
import org.japo.java.lib.UtilesEmpleado;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Encargado extends Empleado {

    public static final int OBJETIVO_DIA = 100;
    public static final int STOCK_MAXIMO = 10;

    private int produccion;

    public Encargado() {
        super(Empleado.CARGO_ENC);
        this.produccion = new Random().nextInt(STOCK_MAXIMO);
    }

    @Override
    public void setCargo(String cargo) {
        super.setCargo(Empleado.CARGO_ENC);
    }

    
    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        if (UtilesEmpleado.validarProduccion(produccion)) {
            this.produccion = produccion;
        }
    }

    public Encargado(int produccion) {
        super(Empleado.CARGO_ENC);
        if (UtilesEmpleado.validarProduccion(produccion)) {
            this.produccion = produccion;
        } else {
            this.produccion = new Random().nextInt(STOCK_MAXIMO);
        }
    }

    // Info del operario
    @Override
    public void mostrarInfo() {
        // LLamar al método heredado
        super.mostrarInfo();

        // Producción
        System.out.printf("Producción ..: %d/%d - %s\n", this.getProduccion(), OBJETIVO_DIA,
                getProduccion() < OBJETIVO_DIA ? "Pendiente" : "Conseguido");

        // Separación Cosmética
        System.out.println("---");
    }

}
