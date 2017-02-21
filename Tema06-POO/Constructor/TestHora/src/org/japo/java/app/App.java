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

// Importación de la clase Hora.
import org.japo.java.entities.Hora;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // Instanciación de la clase Hora.
        Hora h1 = new Hora();
        Hora h2 = new Hora();
        Hora h3 = new Hora();
        Hora h4 = new Hora();

        h1.setH(16);
        h1.setM(40);
        h1.setS(8);

        h2.setH(12);
        h2.setM(26);
        h2.setS(42);

        h3.setH(80);
        h3.setM(62);
        h3.setS(705);

        int horas = h1.getH();
        int minutos = h1.getM();
        int segundos = h1.getS();

        System.out.println(horas + ":" + minutos + ":" + segundos);
        System.out.println(h2.getH() + ":" + h2.getM() + ":" + h2.getS());
        System.out.println(h3.getH() + ":" + h3.getM() + ":" + h3.getS());
        System.out.println(h4.getH() + ":" + h4.getM() + ":" + h4.getS());
    }

}
