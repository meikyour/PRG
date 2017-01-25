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

//Importación clase Scanner.
import java.util.Scanner;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {
    
    //Constantes número DNI.
    public static final int NUMERO = 29211661;
    
    //Utilidad Scanner.
    private final Scanner scn  = new Scanner(System.in, "ISO-8859-1");
    
    //Variable realcionar
    int relacionar = obtenerEnteroConsola();
    
    public void lanzarAplicacion() {
        
        relacionar();        
    }
    private void relacionar(){
        
        obtenerEnteroConsola();
    }
    private int obtenerEnteroConsola(){
        
        //Petición e introducción del número por el ususario.
        System.out.printf("Número entero.......: ");
        int peticionNumero = scn.nextInt();
        
        //Validar númerop correcto.
        if(peticionNumero == NUMERO){
            System.out.println("El número es correcto");
        }else{
            System.out.println("El número es incorrecto");
        }
        //Devolver relacionar.
        return relacionar;
    }
    
}
