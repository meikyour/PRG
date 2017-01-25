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

//Importación Calendar.
import java.util.Calendar;
//Importación Gregorian Calendar.
import java.util.GregorianCalendar;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    //Constantes.
    public static final int H_INICIO = 8;
    public static final int M_INICIO = 20;
    public static final int H_FIN = 14;
    public static final int M_FIN = 10;

    //Utilidades.
    private final GregorianCalendar gc = new GregorianCalendar();

    public void lanzarAplicacion() {
        
        informar();
    }

    private void informar() {

        //Variables.
        int tiempoIni = H_INICIO * 60 + M_INICIO;
        int tiempoFin = H_FIN * 60 + M_FIN;
        
        int hAct = gc.get(Calendar.HOUR_OF_DAY);
        int mAct = gc.get(Calendar.MINUTE);
        int tiempoAct = hAct * 60 + mAct;
        
        //Informar.
        if(tiempoAct >= tiempoIni && tiempoAct <= tiempoFin){
            System.out.println("DENTRO");
        }else{
            System.out.println("FUERA");
        }
    }
}
