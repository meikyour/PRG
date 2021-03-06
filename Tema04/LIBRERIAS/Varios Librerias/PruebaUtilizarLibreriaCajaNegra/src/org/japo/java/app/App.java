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

// 1- Importamos la clase donde se encuentra el método que queremos utilizar.
import org.japo.java.lib.utiles.Utiles;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        /*
        2- Utilizar el método de lal librería.
            Creamos variable que contenga el método de la libreria.
            Variable = NombreClase + NombreMetodo(valores)
         */
        int numero = Utiles.sumar(2, 3);

        // 3- Imprimir el resultado del método almacenado en la variable.
        System.out.println("Número....: " + numero);
    }

}
