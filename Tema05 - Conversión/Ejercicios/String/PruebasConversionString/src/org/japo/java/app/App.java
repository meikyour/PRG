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

     //   System.out.println("pEpEpÓTaMo".toUpperCase().substring(0, 1)
     //           + ("pEpEpÓTaMo".toLowerCase().substring(1)));
        
      String cadena = "HIPOPOTAMO";  
      char miArray[] = new char[cadena.length()];
      String lasCadenas[] = new String[cadena.length()];
      
        System.out.println(cadena.substring(2, 6));
        
    for(int i=0; i<cadena.length(); i++)    
         System.out.println(cadena.substring(i, i+1));
    
    for(int i=0; i<cadena.length(); i++)    
         System.out.println(cadena.charAt(i));
    
    System.out.println("-------------- array de Char ------------------");
    
    for(int i=0; i<cadena.length(); i++)    
         miArray[cadena.length()-i-1] = cadena.charAt(i);
    
    for(int i=0; i<miArray.length; i++)    
         System.out.println(miArray[i]);
    
    System.out.println("------------- array de String -------------------");    
    for(int i=0; i<cadena.length(); i++)    
         lasCadenas[cadena.length()-i-1] = cadena.substring(i, i+1)+" viva la Republica "+i;    
    
    for(int i=0; i<lasCadenas.length; i++)    
         System.out.println(lasCadenas[i]);  
    
    System.out.println("------------- POSICION DE SUBCADENA -------------------");  
        System.out.println(cadena.indexOf("POPO"));
        System.out.println(cadena.indexOf(cadena.substring(2, 6)));        
        System.out.println(cadena.indexOf("POPO",7));
        System.out.println(cadena.lastIndexOf("PO"));
        
   System.out.println("------------- POSICION DE CHAR -------------------");    
         System.out.println(cadena.indexOf('P'));
         System.out.println(cadena.indexOf(cadena.charAt(2)));
         System.out.println(cadena.indexOf('P',3));
         System.out.println(cadena.indexOf('P',7));
         System.out.println(cadena.lastIndexOf('P'));
    System.out.println("------------- CONCATENAR -------------------"); 
    String novaCadena = cadena.concat(" bonico");
        System.out.println(novaCadena);
    System.out.println("------------- replace -------------------");    
    String novaCadena2 = cadena.replace('P', 'K');
        System.out.println(novaCadena2);
        
    System.out.println("------------- OBTENER NUMERO DE ORDEN ASCII DE UN CHAR -------------------");   
    char letra='P';
    int numeroOrden = (int)letra;
        System.out.println(numeroOrden);
        
    char digitoNumerico='9';
    int valorNumerico = ((int)digitoNumerico)-48;
        System.out.println(valorNumerico);            
    }
    
       

}
