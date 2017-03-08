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
package org.japo.java.lib;

import org.japo.java.entities.Empleado;
import org.japo.java.entities.Operario;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class UtilesEmpleado {

    // Valida el cargo
    public static boolean validarCargo(String cargo) {
        return cargo.equals(Empleado.CARGO_ENC)
                || cargo.equals(Empleado.CARGO_OPE);
    }

    public static boolean validarSeccion(String seccion) {
        return seccion.equals(Operario.SECCION_ALM)
                || seccion.equals(Operario.SECCION_MAN)
                || seccion.equals(Operario.SECCION_PRO);
    }

    public static boolean validarProduccion(int produccion) {
        return produccion >= 0;
    }
}
