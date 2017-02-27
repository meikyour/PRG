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

import org.japo.java.entities.Camion;
import org.japo.java.entities.Moto;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {
        
        Camion c1 = new Camion();
        c1.mostrarInfo();
        c1.setContador(299);
        
        Camion c2 = new Camion(-12345);
        c2.mostrarInfo();
        c2.setContador(40000);
        
        Moto m1 = new Moto();
        m1.mostrarInfo();
        m1.setContador(12451);
        m1.mostrarInfo();
        
        Moto m2 = new Moto();
        m2.mostrarInfo();
        m2.setContador(30000);
        m2.mostrarInfo();
                
    }
    
}
