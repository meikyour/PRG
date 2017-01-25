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

//Importación clase Calendar.
import java.util.Calendar;
//Importación clase Gregorian Calendar.
import java.util.GregorianCalendar;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    //Constantes.
    public static final String MAÑANA = "Horario de mañana";
    public static final String TARDE = "Horario de tarde";

    //Utilidades.
    private final GregorianCalendar gc = new GregorianCalendar();

    //Variable horario.
    String horario = "";

    public void lanzarAplicacion() {

        obtenerHorario();
    }

    private String obtenerHorario() {

        //Obtener hora del sistema.
        int hora = gc.get(Calendar.HOUR_OF_DAY);
        int minutos = gc.get(Calendar.MINUTE);

        //Calcular horario.
        if (hora >= 8 && hora <= 13 && minutos <= 30) {
            horario = MAÑANA;
        } else {
            horario = TARDE;
        }

        //Mensajes.
        System.out.printf("Hora...............: %d:%d \n", hora, minutos);
        System.out.printf("Situación.........: %s\n", horario);

        return horario;
    }

}
