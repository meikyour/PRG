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

// Importamos la clase Nif.
import org.japo.java.entities.Nif;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {

        // Instanciación de la clase que contiene los metodos y atrubutos.
        Nif n = new Nif();

        // Set o atrubuto que condiciona la letra del dni.
        n.setDni(29211661);
        
        // Introducción del número de dni en el atributo o set que calcula la letra.
        //n.setControl(n.getDni());

        System.out.println(n.getDni());
        System.out.println(n.getLetra());
        
        // Ejecución del set o atributo que calcula la letra del dni.
        //System.out.println(n.getControl());

        // Usada la expresión en la misma clase ejecutable.
        //System.out.println(LETRAS.charAt(n.getDni() % 23));
    }

}
