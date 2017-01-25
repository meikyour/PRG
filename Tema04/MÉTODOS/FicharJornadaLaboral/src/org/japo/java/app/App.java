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

    //Constantes.
    public static final int H_INICIO = 8;
    public static final int M_INICIO = 20;
    public static final int HORAS_JORMNADA = 8;
    //Utilidades.
    private final GregorianCalendar gc = new GregorianCalendar();

    public void lanzarAplicacion() {

        informar();
    }

    public void informar() {

        //Variables.
        //Hora y minuto al que se ficha.
        int hFichaje = gc.get(Calendar.HOUR_OF_DAY);
        int mFichaje = gc.get(Calendar.MINUTE);
        //Horas y minutos efectivos que se trabajan
        int horasEfectivas = (hFichaje - H_INICIO);
        int minutosEfectivos = (mFichaje - M_INICIO);

        //Informar.
        if (horasEfectivas >= HORAS_JORMNADA && minutosEfectivos >= M_INICIO) {
            System.out.println("Ha trabajado 8 horas o más");
        } else {
            System.out.println("Ha trabajado menos de 8 horas");
        }
    }

}
