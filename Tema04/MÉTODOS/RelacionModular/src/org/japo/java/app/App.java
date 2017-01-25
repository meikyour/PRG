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
    
    //Constantes.
    public static final int N1 = 2;
    public static final int N2 = 16;

    public void lanzarAplicacion() {
        
        relacionar();
    }
    public void relacionar(){
        
        if(N1 < N2){
            System.out.println(N1+" es mayor que "+N2);
        }else if(N1 < N2){
            System.out.println("%d es menor que %d"+ N1+ N2);
        }else{
            System.out.println("%d es igual que %d"+ N1+ N2);
        }
    }
    
}
