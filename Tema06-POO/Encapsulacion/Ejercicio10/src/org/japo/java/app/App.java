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
        Fecha f = new Fecha();
        
        f.setDia(18);
        f.setMes(6);
        f.setAny(1990);
        
        // Muestra fecha numérica.
        System.out.println(f.getDia()+"/"+f.getMes()+"/"+f.getAny());
        
        f.setDay(8);
        f.setMonth(24);
        f.setEstacion(2);
        
        // Muestra dia de la semana, mes escrito y estación del año.
        System.out.println(f.getDay()+"/"+f.getMonth()+"/"+f.getEstacion());
    }
    
}
