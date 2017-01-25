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
    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */

    public void lanzarAplicacion() {
        
        int lluvia[]={30,10,20,50,40,23,200,40,34,200,150,90};
        int posicionesMaximo[] = new int[12];
        int maximo;
               
        int contador;
/*        
        maximo=lluvia[0];
        for (int i=1;i<=11;i++)
        {
            if(lluvia[i] > maximo)
            { maximo=lluvia[i];
            }            
        }

        System.out.println("maximo : "+maximo);
        
        
        for (int i=1;i<=11;i++)
        {
            posicionesMaximo[i]=-1;
        }
        
        contador=0;
        for (int i=0;i<=11;i++)
        {
            if(lluvia[i] == maximo)
            { posicionesMaximo[contador]=i;
              contador++;
            }            
        } 
        
         int j=0;
         while (posicionesMaximo[j] != -1)
         { System.out.println("posicion maximo : "+posicionesMaximo[j]);
           j++;
         }
*/
        
        
        
        maximo=lluvia[0];
        for (int i=1;i<=11;i++)
        {
            if(lluvia[i] > maximo)
            { maximo=lluvia[i];                            
            }            
        }

        System.out.println("maximo : "+maximo);
               
        contador=0;
        for (int i=0;i<=11;i++)
        {
            if(lluvia[i] == maximo)
            { posicionesMaximo[contador]=i;
              contador++;             
            }            
        } 
        
        System.out.println("numero de maximos : "+contador);
        
       for (int i=0;i<contador;i++)
        {
            System.out.println("posicion maximo : "+posicionesMaximo[i]);
        }    

    }
    
}
