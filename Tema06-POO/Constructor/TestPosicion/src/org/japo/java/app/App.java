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

import org.japo.java.entities.Posicion;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        Posicion p1 = new Posicion();
        p1.setX(500);
        p1.setY(30);
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        System.out.println();
        Posicion p2 = new Posicion();
        p2.setX(68);
        p2.setY(150);
        System.out.println(p2.getX());
        System.out.println(p2.getY());

        System.out.println();
        Posicion p3 = new Posicion();
        p3.setX(9000);
        p3.setY(12000);
        System.out.println(p3.getX());
        System.out.println(p3.getY());

        System.out.println();
        Posicion p4 = new Posicion();
        System.out.println(p4.getX());
        System.out.println(p4.getY());
    }

}
