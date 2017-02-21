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

// Importamos la clase Fecha.
import org.japo.java.entities.Fecha;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // Instanciamos la clase Fecha.
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha();
        Fecha f3 = new Fecha();
        Fecha f4 = new Fecha();

        f1.setDia(18);
        f1.setMes(6);
        f1.setAny(1990);

        f2.setDia(22);
        f2.setMes(3);
        f2.setAny(1964);

        f3.setDia(36);
        f3.setMes(18);
        f3.setAny(1998);

        // Muestra fecha numérica.
        System.out.println(f1.getDia() + "/" + f1.getMes() + "/" + f1.getAny());
        System.out.println(f2.getDia() + "/" + f2.getMes() + "/" + f2.getAny());
        System.out.println(f3.getDia() + "/" + f3.getMes() + "/" + f3.getAny());
        System.out.println(f4.getDia() + "/" + f4.getMes() + "/" + f4.getAny());

        f1.setDay(8);
        f1.setMonth(24);
        f1.setEstacion(2);

        // Muestra dia de la semana, mes escrito y estación del año.
        System.out.println(f1.getDay() + "/" + f1.getMonth() + "/" + f1.getEstacion());
    }

}
