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

import org.japo.java.lib.UtilesEmpleado;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class Operario extends Empleado {

    public static final String SECCION_PRO = "Producción";
    public static final String SECCION_ALM = "Almacén";
    public static final String SECCION_MAN = "Mantenimiento";

    private String seccion;

    public Operario() {
        super(Empleado.CARGO_OPE);
        seccion = SECCION_PRO;
    }

    public Operario(String seccion) {
        super(Empleado.CARGO_OPE);
        if (UtilesEmpleado.validarSeccion(seccion)) {
            this.seccion = seccion;
        } else {
            this.seccion = SECCION_PRO;
        }
    }

    @Override
    public void setCargo(String cargo) {
        super.setCargo(Empleado.CARGO_OPE);
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        if (UtilesEmpleado.validarSeccion(seccion)) {
            this.seccion = seccion;
        }
    }

    // Info del operario
    @Override
    public void mostrarInfo() {
        // LLamar al método heredado
        super.mostrarInfo();

        // Seccion
        System.out.printf("Sección .....: %s\n", this.getSeccion());

        // Separación Cosmética
        System.out.println("---");
    }

}
