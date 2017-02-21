/*
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
 * La clase App contiene la lógica del proyecto.
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class App {
    /**
     * El método lanzarAplicacion es el punto de netrada de la clase App.
     */
    public void lanzarAplicacion() {
        // Objeto 1 - Constructor predeterminado
        Posicion p1 = new Posicion();
        System.out.printf("Posición...: %d, %d\n", p1.getX(), p1.getY());
        p1.setX(640);
        p1.setY(480);
        System.out.printf("Posición...: %d, %d\n", p1.getX(), p1.getY());

        // Objeto 2 - Constructor parametrizado
        Posicion p2 = new Posicion(7, 8);
        System.out.printf("Posición...: %d, %d\n", p2.getX(), p2.getY());
        p2.setX(42);
        p2.setY(700);
        System.out.printf("Posición...: %d, %d\n", p2.getX(), p2.getY());
        
    }
    
}
