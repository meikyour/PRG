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

import org.japo.java.entities.Cafetera;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera();
        Cafetera c3 = new Cafetera();

        c1.setServicio(4);
        c2.setServicio(6);
        c2.setServicio(20);

        System.out.println(c1.getServicio());
        System.out.println(c2.getServicio());
        System.out.println(c3.getServicio());
    }

}
