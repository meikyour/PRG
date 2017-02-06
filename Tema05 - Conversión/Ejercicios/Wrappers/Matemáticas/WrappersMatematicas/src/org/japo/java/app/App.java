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

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        System.out.println("Número PI............: " + Math.PI);
        System.out.println("Número E (Euler).....: " + Math.E);
        System.out.println("30º > Radianes.......: " + Math.PI / 6);
        System.out.println("45º > Radianes.......: " + Math.PI / 4);
        System.out.println("60º > Radianes.......: " + Math.PI / 3);
        System.out.println("90º > Radianes.......: " + Math.PI / 2);
        System.out.println("180º > Radianes......: " + Math.PI);
        System.out.println("270º > Radianes......: " + 3 * Math.PI / 2);
        System.out.println("360º > Radianes......: " + 2 * Math.PI);
    }

}
