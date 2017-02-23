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

import org.japo.java.entities.Animal;
import org.japo.java.interfaces.IAnimal;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // Objeto 1.
        Animal a1 = new Animal();
        a1.setPatas(26);
        System.out.println(a1.getPatas());

        // Objeto 2.
        Animal a2 = new Animal(18);
        a2.mostrarPatas();

        // Objeto 3.
        IAnimal ai1 = new Animal();
        ai1.mostrarPatas();
    }

}
