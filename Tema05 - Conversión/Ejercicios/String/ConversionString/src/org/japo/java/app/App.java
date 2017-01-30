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
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */

    public void lanzarAplicacion() {

        System.out.println();
        System.out.println("----------Converiones a String-----------");
        System.out.println();
        
        System.out.println("String.valueOf()");
        System.out.println();
        
        String a = String.valueOf(123);
        System.out.println("123 >> String.valueOf(123) -- "+a);
        
        String b = String.valueOf(43.21);
        System.out.println("43.21 >> String.valueOf(43.21) -- "+b);
        
        System.out.println("'W' >> String.valueOf('W') -- "+String.valueOf('W'));
        System.out.println("true >> String.valueOf(true) -- "+String.valueOf(true));
        System.out.println("2 + 3 >> String.valueOf(2 + 3) -- "+String.valueOf(2 + 3));
        System.out.println("20 / 3.0 >> String.valueOf(20 / 3.0) -- "+String.valueOf(20 / 3.0));
        System.out.println("(char)('\\u0041' + 4) >> String.valueOf((char)('\\u0041' + 4)) -- "+String.valueOf((char)('\u0041' + 4)));
        System.out.println("!(2 <= 2) >> String.valueOf(!(2 <= 2)) -- "+String.valueOf(!(2 <= 2)));
        
        System.out.println();
        System.out.println("\"\" + Dato");
        System.out.println();
        
        String c = "" + 2016;
        System.out.println("2016 >> \"\" + 2016 -- "+c);
        
        String d = "" + 3.1415;
        System.out.println("3.1415 >> \"\" + 3.1415 -- "+d);
        
        System.out.println("'?' >> \"\" + '?' -- "+ "" + '?');
        System.out.println("true >> \"\" + true -- "+ "" + true);
        System.out.println("6 % 3 >> \"\" + 6 % 3 -- "+ "" + 6 % 3);
        System.out.println("5 - 3.0 >> \"\" + 5 - 3.0 -- "+ "" + (5 - 3.0));
        System.out.println("'\\u20AC' >> \"\" + '\\u20AC' -- "+ "" + '\u20AC');
        System.out.println("'\\u0041' > 'a' >> \"\" + '\\u0041' > 'a' -- "+ "" + ('\u0041' > 'a'));
    }

}
