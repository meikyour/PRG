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

import org.japo.java.entities.Trasto;
import org.japo.java.interfaces.ICosa;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        Trasto t1 = new Trasto();
        t1.setFragilidadOK(true);
        System.out.println(t1.isFragilidadOK());

        // Objeto 2.
        Trasto t2 = new Trasto(true);
        t2.mostrarInfo();

        // Onjeto 3 Interface.
        ICosa tI3 = new Trasto();
        tI3.mostrarInfo();
    }

}
