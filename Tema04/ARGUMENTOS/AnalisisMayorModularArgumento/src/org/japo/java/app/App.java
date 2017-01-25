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
 *La clase App contiene la lógica del proyecto.
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {
    
    final static int N1 = 2;
    final static int N2 = 8;
    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */

    public void lanzarAplicacion() {
        
        int mayor = devolverMayor(N1, N2);
        System.out.printf("Relación......: %d", mayor);        
    }
    private int devolverMayor(int n1, int n2){
        
        int mayor = 0;
        if (n1 > n2){
            mayor = n1;
        }else if (n1 < n2){
            mayor = n2;
        }else {
            System.out.printf("Los números %d y %d son iguales.\n", n1, n2);
        }
        return mayor;
    }
    
}
