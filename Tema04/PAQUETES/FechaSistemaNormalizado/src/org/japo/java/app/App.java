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

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public void lanzarAplicacion() {
        
       //1-Instanciación Gregorian Calendar.
        GregorianCalendar gc = new GregorianCalendar();
 
        //2-Variables.
        int d;
        int m;
        int a;
        
        //3-Obtener valores.
        d = gc.get(Calendar.DAY_OF_MONTH);
        m = gc.get(Calendar.MONTH)+1;
        a = gc.get(Calendar.YEAR);
        
        //4-Resultado.
        System.out.printf("Fecha de hoy......: %02d/%02d/%04d\n", d, m, a);
    }
    
}
