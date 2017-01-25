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
    
    public static final int NUM_MIN = 2;
    public static final int NUM_MAX = 8;
    
    public void lanzarAplicacion() {
        
        if(NUM_MAX < NUM_MIN){
            System.out.printf("El número máximo %d es menor que el número mínimo %d.", NUM_MAX, NUM_MIN);
        }else if (NUM_MAX > NUM_MIN){
            System.out.printf("El número máximo %d es mayor que el número mínimo %d.", NUM_MAX, NUM_MIN);
        }else{
            System.out.printf("Los números máximo %d y mínimo %d son iguales.", NUM_MAX, NUM_MIN);
        }
    }
    
}
