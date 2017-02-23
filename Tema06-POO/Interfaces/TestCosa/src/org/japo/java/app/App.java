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

import org.japo.java.entities.Cosa;
import org.japo.java.interfaces.ICosa;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // Objeto 1.
        Cosa c1 = new Cosa();
        c1.setCombustibleOK(true);
        System.out.println(c1.isCombustibleOK());

        // Objeto 2.
        Cosa c2 = new Cosa(true);
        c2.mostrarInfo();
        
        // Objeto Interface.
        ICosa ci1 = new Cosa(true);
        ci1.mostrarInfo();
    }

}
