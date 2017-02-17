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

// Importación de la clase color.
import org.japo.java.entities.Color;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {
        
        // Intanciación de la clase Color.
        Color c = new Color();
        
        // Introducir el color.
        c.setA(156);
        c.setR(88);
        c.setV(60);
        
        // Mostrar color.
        System.out.println(c.getV());
        System.out.println(c.getR());
        System.out.println(c.getA());
    }
    
}
