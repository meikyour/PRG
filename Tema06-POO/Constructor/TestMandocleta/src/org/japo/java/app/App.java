/* 
 * Copyright 2016  - Raul Granel - raul.granel@gmail.com.
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
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // Objeto 1.
        Mandocleta m1 = new Mandocleta(12);
        System.out.println(m1.getVelocidad());
        m1.setVelocidad(25);
        System.out.println(m1.getVelocidad());
        Mandocleta m2 = new Mandocleta();

        System.out.println();
        // Objeto 2.
        m2.setVelocidad(28);
        System.out.println(m2.getVelocidad());
    }

}
