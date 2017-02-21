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

import org.japo.java.entities.Mandocleta;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class App {
    /**
     * El método lanzarAplicacion es el punto de netrada de la clase App.
     */
    public void lanzarAplicacion() {
        // Objeto 1 - Constructor predeterminado
        Mandocleta m1 = new Mandocleta();
        System.out.println(m1.getVelocidad());
        m1.setVelocidad(3);
        System.out.println(m1.getVelocidad());

        // Objeto 2 - Constructor predeterminado
        Mandocleta m2 = new Mandocleta(15);
        System.out.println(m2.getVelocidad());
        m2.setVelocidad(17.27);
        System.out.println(m2.getVelocidad());
    }
    
}
