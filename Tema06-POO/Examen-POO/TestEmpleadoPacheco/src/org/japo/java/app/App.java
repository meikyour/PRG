/*
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
package org.japo.java.app;

import org.japo.java.entities.Operario;
import org.japo.java.entities.Encargado;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class App {
    /**
     * El método lanzarAplicacion es el punto de entrada de la clase App.
     */
    public void lanzarAplicacion() {
        // Operario
        Operario o = new Operario("Almacen");
        o.mostrarInfo();
        o.setSeccion("Recepción");
        o.mostrarInfo();

        // Encargado
        Encargado e = new Encargado(-150);
        e.mostrarInfo();
        e.setProduccion(150);
        e.mostrarInfo();
    }
    
}
