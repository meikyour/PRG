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
        Color c1 = new Color();
        Color c2 = new Color();
        Color c3 = new Color();
        Color c4 = new Color();

        // Introducir el color.
        c1.setA(156);
        c1.setR(88);
        c1.setV(60);

        c2.setA(180);
        c2.setR(90);
        c2.setV(30);

        c3.setA(900);
        c3.setR(880);
        c3.setV(310);

        // Mostrar color.
        System.out.println(c1.getV() + c1.getR() + c1.getA());
        System.out.println(c2.getV() + c2.getR() + c2.getA());
        System.out.println(c3.getV() + c3.getR() + c3.getA());
        System.out.println(c4.getV() + c4.getR() + c4.getA());
    }

}
